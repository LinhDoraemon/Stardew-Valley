package com.LinhDoraemon.machenics;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_11_R1.CraftWorld;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

import net.minecraft.server.v1_11_R1.BlockPosition;
import net.minecraft.server.v1_11_R1.TileEntity;
import net.minecraft.server.v1_11_R1.TileEntityChest;
import net.minecraft.server.v1_11_R1.World;

public class ChestS implements Listener {

	public static ItemStack getChest() {
		ItemStack i = new ItemStack(Material.CHEST);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lRương");
		SimpleItem.addLore(mt, "", "Nơi để chứa tất cả các vật phẩm", "của bạn", "", HashTag.TYPE_CRAFTING);
		i.setItemMeta(mt);
		return i;
	}

	private static HashMap<String, Inventory> inventories = new HashMap<String, Inventory>();

	private HashMap<String, Location> LOC_DATA = new HashMap<String, Location>();

	private static Inventory chestColorGUI(Location loc) {
		Inventory i = inventories.get(loc.toString());

		if (i == null) {
			i = Bukkit.createInventory(null, 9, "§0§lChọn màu cho rương >>");
			i.clear();
			i.addItem(new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE.getDyeData()));
			i.addItem(new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.BROWN.getDyeData()));
			i.addItem(new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.GREEN.getDyeData()));
			i.addItem(new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.MAGENTA.getDyeData()));
			i.addItem(new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.ORANGE.getDyeData()));
			i.addItem(new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.PINK.getDyeData()));
			i.addItem(new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.PURPLE.getDyeData()));
			i.addItem(new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.RED.getDyeData()));
			i.addItem(new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));

			inventories.put(loc.toString(), i);
		}
		return i;
	}

	@EventHandler
	public void changemaucuacaichest(PlayerInteractEvent e) {

		Block b = e.getClickedBlock();

		if (b == null) {
			return;
		}

		if (e.getAction() != Action.LEFT_CLICK_BLOCK) {
			return;
		}

		if (!(e.getPlayer().isSneaking())) {
			return;
		}

		if (b.getType() != Material.CHEST) {
			return;
		}

		LOC_DATA.put(e.getPlayer().getName(), b.getLocation());

		e.getPlayer().openInventory(chestColorGUI(b.getLocation()));

	}

	@EventHandler
	public void changemaucuacaichest2(InventoryClickEvent e) {
		ItemStack i = e.getCurrentItem();
		Player p = (Player) e.getWhoClicked();
		
		if(i == null) {
			return;
		}
		
		if(e.getClickedInventory().getTitle() != "§0§lChọn màu cho rương >>") {
			return;
		}
		
		if(i.getType() != Material.STAINED_GLASS_PANE) {
			return;
		}
		
		e.setCancelled(true);
		
		Block b = LOC_DATA.get(p.getName()).getBlock();
		
		if(i.getData().getData() == DyeColor.BLUE.getDyeData()) {
			setName(b, "§1§lRương");
			return;
		}
		if(i.getData().getData() == DyeColor.BLACK.getDyeData()) {
			setName(b, "§0§lRương");
			return;
		}
		if(i.getData().getData() == DyeColor.BROWN.getDyeData()) {
			setName(b, "§c§lRương");
			return;
		}
		if(i.getData().getData() == DyeColor.GREEN.getDyeData()) {
			setName(b, "§2§lRương");
			return;
		}
		if(i.getData().getData() == DyeColor.MAGENTA.getDyeData()) {
			setName(b, "§5§lRương");
			return;
		}
		if(i.getData().getData() == DyeColor.ORANGE.getDyeData()) {
			setName(b, "§6§lRương");
			return;
		}
		if(i.getData().getData() == DyeColor.PINK.getDyeData()) {
			setName(b, "§d§lRương");
			return;
		}
		if(i.getData().getData() == DyeColor.PURPLE.getDyeData()) {
			setName(b, "§9§lRương");
			return;
		}
		if(i.getData().getData() == DyeColor.RED.getDyeData()) {
			setName(b, "§4§lRương");
			return;
		}
	
		
	}

	public void setName(Block block, String name) {
		if (block.getType() != Material.CHEST) {
			// Not a chest
			return;
		}

		// Get the NMS World
		World nmsWorld = ((CraftWorld) block.getWorld()).getHandle();
		// Get the tile entity
		TileEntity te = nmsWorld.getTileEntity(
				new BlockPosition(block.getLocation().getX(), block.getLocation().getY(), block.getLocation().getZ()));
		// Make sure it's a TileEntityChest before using it
		if (!(te instanceof TileEntityChest)) {
			// Not a chest :o!
			return;
		}
		((TileEntityChest) te).a(name);
	}
}
