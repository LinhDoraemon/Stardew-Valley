package com.LinhDoraemon.Shops;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.animals.Chicken;
import com.LinhDoraemon.animals.Cow;
import com.LinhDoraemon.animals.Sheep;
import com.LinhDoraemon.data.PlayerData;
import com.LinhDoraemon.utils.Messenger;
import com.LinhDoraemon.utils.SimpleItem;

public class MarnieShop implements Listener {

	private static Inventory inv = Bukkit.createInventory(null, 9, "§0§lCửa hàng động vật >>");

	public static void openMarnieShop(Player p) {
		ItemStack i = new ItemStack(Material.MONSTER_EGG, 1, EntityType.CHICKEN.getTypeId());
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lGà");
		SimpleItem.addLore(mt, "", "§fMang về trang trại và đặt chú gà", "§fnhỏ này vào trong chuồng gà.", "",
				"§e§lClick để mua với giá §f§l2.500 §6§lG");
		i.setItemMeta(mt);

		ItemStack i1 = new ItemStack(Material.MONSTER_EGG, 1, EntityType.COW.getTypeId());
		ItemMeta mt1 = i.getItemMeta();
		mt1.setDisplayName("§b§lBò");
		SimpleItem.addLore(mt1, "", "§fMang về trang trại và đặt con bò", "§fnhỏ này vào trong chuồng bò.", "",
				"§e§lClick để mua với giá §f§l5.000 §6§lG");
		i1.setItemMeta(mt1);

		ItemStack bucket = new ItemStack(Material.BUCKET);
		ItemMeta mt2 = bucket.getItemMeta();
		mt2.setDisplayName("§9§lBình vắt sữa");
		SimpleItem.addLore(mt2, "", "§fThu thập sữa từ động vật của bạn.", "",
				"§e§lClick để mua với giá §f§l1.000 §6§lG");
		bucket.setItemMeta(mt2);

		ItemStack i3 = new ItemStack(Material.MONSTER_EGG, 1, EntityType.SHEEP.getTypeId());
		ItemMeta mt3 = i.getItemMeta();
		mt3.setDisplayName("§f§lCừu");
		SimpleItem.addLore(mt3, "", "§fMang về trang trại và đặt con cừu", "§fnhỏ này vào trong chuồng cừu.", "",
				"§e§lClick để mua với giá §f§l8.000 §6§lG");
		i3.setItemMeta(mt3);
		
		ItemStack item = new ItemStack(Material.WHEAT);
		ItemMeta mt4 = item.getItemMeta();
		mt4.setDisplayName("§e§lLúa mì");
		SimpleItem.addLore(mt4, "", "§fSử dụng như thức ăn cho động vật.", "", "§e§lClick để mua với giá §f§l50 §6§lG");
		item.setItemMeta(mt4);
		
		ItemStack i9 = new ItemStack(Material.SHEARS);
		ItemMeta mt9 = i9.getItemMeta();
		mt9.setDisplayName("§9§lKéo tỉa");
		SimpleItem.addLore(mt9, "", "§fDùng để kiếm len từ bọn cừu.", "");
		i9.setItemMeta(mt9);

		inv.setItem(1, item);
		inv.setItem(3, i);
		inv.setItem(4, i1);
		inv.setItem(5, bucket);
		inv.setItem(6, i9);
		inv.setItem(7, i3);

		for (int so = 0; so < inv.getSize(); so++) {
			if (inv.getItem(so) == null) {
				inv.setItem(so, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			}
		}

		p.openInventory(inv);
	}

	private boolean enoughMoney(Player p, int min) {
		if (PlayerData.getPlayerMoney(p.getName()) >= min) {
			return true;
		} else {
			return false;
		}
	}

	@EventHandler
	public void nguoichoimuahangmarnie(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lCửa hàng động vật >>") {
			return;
		}

		if (i.getType() == Material.STAINED_GLASS_PANE) {
			e.setCancelled(true);
			return;
		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null) {
			if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§6§lGà")) {
				if (enoughMoney(p, 2500)) {
					e.setCancelled(true);
					p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 3);
					p.getInventory().addItem(Chicken.getChicken());
					PlayerData.removePlayerMoney(p.getName(), 2500);
					Messenger.sendActionBar(p, "§a§lGIAO DỊCH THÀNH CÔNG ! BẠN ĐÃ BỊ TRỪ §6§l2500 G");
					return;
				} else {
					e.setCancelled(true);
					p.sendMessage("§c§lBạn không đủ §6§l2500 G");
					return;
				}
			}

			if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lBò")) {
				if (enoughMoney(p, 5000)) {
					e.setCancelled(true);
					p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 3);
					p.getInventory().addItem(Cow.getCow());
					PlayerData.removePlayerMoney(p.getName(), 5000);
					Messenger.sendActionBar(p, "§a§lGIAO DỊCH THÀNH CÔNG ! BẠN ĐÃ BỊ TRỪ §6§l5000 G");
					return;
				} else {
					e.setCancelled(true);
					p.sendMessage("§c§lBạn không đủ §6§l5000 G");
					return;
				}
			}

			if (i.getItemMeta().getDisplayName()
					.equalsIgnoreCase(StardewItems.MILK_PAIL().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 1000)) {
					e.setCancelled(true);
					p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 3);
					p.getInventory().addItem(StardewItems.MILK_PAIL());
					PlayerData.removePlayerMoney(p.getName(), 1000);
					Messenger.sendActionBar(p, "§a§lGIAO DỊCH THÀNH CÔNG ! BẠN ĐÃ BỊ TRỪ §6§l1000 G");
					return;
				} else {
					e.setCancelled(true);
					p.sendMessage("§c§lBạn không đủ §6§l1000 G");
					return;
				}
			}

			if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§e§lLúa mì")) {
				if (enoughMoney(p, 50)) {
					e.setCancelled(true);
					p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 3);
					p.getInventory().addItem(StardewItems.HAY());
					PlayerData.removePlayerMoney(p.getName(), 50);
					Messenger.sendActionBar(p, "§a§lGIAO DỊCH THÀNH CÔNG ! BẠN ĐÃ BỊ TRỪ §6§l50 G");
					return;
				} else {
					e.setCancelled(true);
					p.sendMessage("§c§lBạn không đủ §6§l50 G");
					return;
				}
			}
			
			if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§f§lCừu")) {
				if (enoughMoney(p, 8000)) {
					e.setCancelled(true);
					p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 3);
					p.getInventory().addItem(Sheep.getSheep());
					PlayerData.removePlayerMoney(p.getName(), 8000);
					Messenger.sendActionBar(p, "§a§lGIAO DỊCH THÀNH CÔNG ! BẠN ĐÃ BỊ TRỪ §6§l8000 G");
					return;
				} else {
					e.setCancelled(true);
					p.sendMessage("§c§lBạn không đủ §6§l8000 G");
					return;
				}
			}
			
			if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§9§lKéo tỉa")) {
				if (enoughMoney(p, 1000)) {
					e.setCancelled(true);
					p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 3);
					p.getInventory().addItem(StardewItems.SHEARS());
					PlayerData.removePlayerMoney(p.getName(), 1000);
					Messenger.sendActionBar(p, "§a§lGIAO DỊCH THÀNH CÔNG ! BẠN ĐÃ BỊ TRỪ §6§l1000 G");
					return;
				} else {
					e.setCancelled(true);
					p.sendMessage("§c§lBạn không đủ §6§l1000 G");
					return;
				}
			}
		}

	}

}
