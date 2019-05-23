package com.LinhDoraemon.book;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.crafting.Recipe;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.server.v1_11_R1.PacketDataSerializer;
import net.minecraft.server.v1_11_R1.PacketPlayOutCustomPayload;

public class BookAPI implements Listener {

	private static HashMap<String, Inventory> inventories = new HashMap<String, Inventory>();
	private static HashMap<String, Inventory> recipes = new HashMap<String, Inventory>();

	public static Inventory getBookGUI(String playername) {
		Inventory i = inventories.get(playername);

		if (i == null) {
			i = Bukkit.createInventory(null, 54, "§0§lCÁC CÔNG THỨC CHẾ TẠO >>");
			for (ItemStack item : Recipe.getAllResults()) {
				i.addItem(item);
			}

			inventories.put(playername, i);
		}

		return i;
	}

	private static Inventory getGUI(Player p, Recipe rc) {
		Inventory i = recipes.get(p.getName());

		if (i == null) {
			i = Bukkit.createInventory(null, 27, "§0§lCÔNG THỨC >>");

			ItemStack pane1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 2);
			ItemStack pane2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);

			ItemStack item = new ItemStack(Material.BOOK);
			ItemMeta mt = item.getItemMeta();
			mt.setDisplayName("§eQuay về trang trước >>");
			item.setItemMeta(mt);

			i.setItem(0, pane1);
			i.setItem(9, pane1);
			i.setItem(18, pane1);
			i.setItem(4, pane1);
			i.setItem(13, pane1);
			i.setItem(22, pane1);

			i.setItem(14, item);

			i.setItem(6, pane2);
			i.setItem(15, pane2);
			i.setItem(24, pane2);
			i.setItem(7, pane2);
			i.setItem(8, pane2);
			i.setItem(17, pane2);
			i.setItem(26, pane2);
			i.setItem(25, pane2);

			recipes.put(p.getName(), i);
		}

		return i;
	}

	public static void showRecipe(Recipe rc, Player p) {

		ItemStack[] ingre = rc.getIngredients();
		ItemStack result = rc.getResult();

		getGUI(p, rc).setItem(1, ingre[0]);
		getGUI(p, rc).setItem(2, ingre[1]);
		getGUI(p, rc).setItem(3, ingre[2]);
		getGUI(p, rc).setItem(10, ingre[3]);
		getGUI(p, rc).setItem(11, ingre[4]);
		getGUI(p, rc).setItem(12, ingre[5]);
		getGUI(p, rc).setItem(19, ingre[6]);
		getGUI(p, rc).setItem(20, ingre[7]);
		getGUI(p, rc).setItem(21, ingre[8]);
		getGUI(p, rc).setItem(16, result);

		p.openInventory(getGUI(p, rc));

	}

	public static void openBook(ItemStack book, Player p) {
		int slot = p.getInventory().getHeldItemSlot();
		ItemStack old = p.getInventory().getItem(slot);
		p.getInventory().setItem(slot, book);

		ByteBuf buf = Unpooled.buffer(256);
		buf.setByte(0, (byte) 0);
		buf.writerIndex(1);

		PacketPlayOutCustomPayload packet = new PacketPlayOutCustomPayload("MC|BOpen", new PacketDataSerializer(buf));
		((CraftPlayer) p).getHandle().playerConnection.sendPacket(packet);
		p.getInventory().setItem(slot, old);
	}

	@EventHandler
	public void RECIPE_BOOK_LISTENER(InventoryClickEvent e) {

		ItemStack i = e.getCurrentItem();
		Player p = (Player) e.getWhoClicked();

		if (i == null) {
			return;
		}

		if (e.getInventory().getTitle() == "§0§lCÁC CÔNG THỨC CHẾ TẠO >>") {

			e.setCancelled(true);

			if (i.hasItemMeta() && i.getItemMeta().hasDisplayName()) {
				String name = i.getItemMeta().getDisplayName();
				try {
					showRecipe(Recipe.getRecipe(name), p);
					p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);

				} catch (Exception e2) {
					e2.printStackTrace();
				}

				return;
			}

			return;
		}

		if (e.getInventory().getTitle() == "§0§lCÔNG THỨC >>") {
			e.setCancelled(true);

			if (i.hasItemMeta() && i.getItemMeta().hasDisplayName()
					&& i.getItemMeta().getDisplayName().equals("§eQuay về trang trước >>")) {

				p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
				p.openInventory(getBookGUI(p.getName()));
				return;

			}

			return;
		}
	}

	@EventHandler
	public void OPEN_RECIPE_BOOK(PlayerInteractEvent e) {

		Player p = e.getPlayer();
		ItemStack i = p.getInventory().getItemInMainHand();
		
		if (i.getType() == Material.ENCHANTED_BOOK && i.hasItemMeta() && i.getItemMeta().hasDisplayName()
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§7(§aChế tạo§7) §e§lPHIÊN BẢN VÀNG") && p.isSneaking() == false) {
			p.openInventory(getBookGUI(p.getName()));
			p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
			return;
		} else {
			return;
		}

	}
	
}
