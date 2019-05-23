package com.LinhDoraemon.television;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.Messenger;

import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

public class OpenTVListener implements Listener {

	private static Inventory television = Bukkit.createInventory(null, 9, "§0§lTELEVISION");

	public static void openTV(Player p) {

		ItemStack grass = new ItemStack(Material.GRASS);
		ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
		ItemStack cake = new ItemStack(Material.CAKE);
		ItemStack clock = new ItemStack(Material.WATCH);

		ItemMeta grassmt = grass.getItemMeta();
		ItemMeta bookmt = book.getItemMeta();
		ItemMeta cakemt = cake.getItemMeta();
		ItemMeta clockmt = clock.getItemMeta();

		grassmt.setDisplayName("§f§l⊏§2§l❐§f§l⊐§a§l Ｌｉｖｉｎｇ Ｏｆ Ｔｈｅ Ｌａｎｄ");
		bookmt.setDisplayName("§f§l⊏§9§l☬§f§l⊐§b§l Ｆｏｒｔｕｎｅ Ｔｅｌｌｅｒ");
		cakemt.setDisplayName("§f§l⊏§5§lѽ§f§l⊐§d§l Ｔｈｅ Ｑｕｅｅｎ ｏｆ Ｓａｕｃｅ");
		clockmt.setDisplayName("§f§l⊏§6§l❂§f§l⊐§e§l Ｗｅａｔｈｅｒ Ｒｅｐｏｒｔ");

		grass.setItemMeta(grassmt);
		book.setItemMeta(bookmt);
		cake.setItemMeta(cakemt);
		clock.setItemMeta(clockmt);

		television.setItem(1, grass);
		television.setItem(3, book);
		television.setItem(5, cake);
		television.setItem(7, clock);

		for(int so = 0; so < television.getSize(); so++) {
			if(television.getItem(so) == null) {
				television.setItem(so, new ItemStack(Material.STAINED_GLASS_PANE));
			}
		}
		
		p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 1, 1);

		p.openInventory(television);

	}

	@EventHandler
	public void dapmecaitvra(BlockBreakEvent e) {
		Block b = e.getBlock();
		
		if(b == null) {
			return;
		}
		
		if(b.getType() != Material.SKULL) {
			return;
		}
		
		try {
			if (CustomSkull.getTexture(b) != null) {
				if (CustomSkull.getTexture(b).equalsIgnoreCase(CSkull.TELEVISION)) {
					e.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItem(b.getLocation(), getTelevision());
				} else {
					return;
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	@EventHandler
	public void motvchonchuongtrinh(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}
		if (e.getClickedInventory().getTitle() != "§0§lTELEVISION") {
			return;
		}

		e.setCancelled(true);

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§f§l⊏§2§l❐§f§l⊐§a§l Ｌｉｖｉｎｇ Ｏｆ Ｔｈｅ Ｌａｎｄ")) {

			if (LivingOfTheLand.hasWatched(p) == false) {
				LivingOfTheLand.runLivinOfTheLand(p);
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);

				LivingOfTheLand.add(p);
			} else {
				Messenger.sendActionBar(p, "§c§lBạn đã xem chương trình này rồi !");
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§f§l⊏§9§l☬§f§l⊐§b§l Ｆｏｒｔｕｎｅ Ｔｅｌｌｅｒ")) {

			if (FortuneTeller.hasWatched(p) == false) {
				FortuneTeller.runLuckTeller(p);
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);

				FortuneTeller.add(p);
			} else {
				Messenger.sendActionBar(p, "§c§lBạn đã xem chương trình này rồi !");
			}

		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§f§l⊏§5§lѽ§f§l⊐§d§l Ｔｈｅ Ｑｕｅｅｎ ｏｆ Ｓａｕｃｅ")) {

			p.closeInventory();
			p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
			p.sendMessage("§cChương trình đang bảo trì để sửa chữa một vài lỗi nhỏ !");

		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§f§l⊏§6§l❂§f§l⊐§e§l Ｗｅａｔｈｅｒ Ｒｅｐｏｒｔ")) {

			if (WeatherReport.hasWatched(p) == false) {
				WeatherReport.runWeatherReport(p);
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
				
				WeatherReport.add(p);
			} else {
				Messenger.sendActionBar(p, "§c§lBạn đã xem chương trình này rồi !");
			}
			
		}

	}

	@EventHandler
	public void motvlenxemnaoahihi(PlayerInteractEvent e) {

		Player p = e.getPlayer();
		Block b = e.getClickedBlock();

		if (b == null) {
			return;
		}

		if (b.getType() != Material.SKULL) {
			return;
		}

		if (e.getAction() != Action.RIGHT_CLICK_BLOCK) {
			return;
		}

		try {
			if (CustomSkull.getTexture(b) != null) {
				if (CustomSkull.getTexture(b).equalsIgnoreCase(CSkull.TELEVISION)) {
					openTV(p);
				} else {
					return;
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static ItemStack getTelevision() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.TELEVISION);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lTi vi");
		mt.setLore(Arrays.asList("", "§fĐặt trong nông trại để xem", "§fcác chương trình từ đài §6§lKOZU TV", "",
				HashTag.TYPE_FURNITURE));
		i.setItemMeta(mt);
		return i;
	}

}
