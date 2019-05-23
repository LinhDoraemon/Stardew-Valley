package com.LinhDoraemon.fishing;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Random;
//
//import org.bukkit.Bukkit;
//import org.bukkit.Material;
//import org.bukkit.Sound;
//import org.bukkit.block.Biome;
//import org.bukkit.entity.Player;
//import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
//import org.bukkit.event.inventory.InventoryClickEvent;
//import org.bukkit.inventory.Inventory;
//import org.bukkit.inventory.ItemStack;
//import org.bukkit.inventory.meta.ItemMeta;
//
//import com.LinhDoraemon.SpecialItem.StardewItems;
//import com.LinhDoraemon.StardewValley.StardewValley;

public class FishingMinigame implements Listener {
// //
//	private static HashMap<String, Inventory> inventories = new HashMap<String, Inventory>();
//
//	public static Inventory openFishingMinigame(String player) {
//		Inventory inv = inventories.get(player);
//
//		if (inv == null) {
//			inv = Bukkit.createInventory(null, 45, "§r §r §r §r §r §r §r §c§l« §d§lＦｉｓｈｉｎｇ Ｍｉｎｉｇａｍｅ §c§l»");
//			inv.clear();
//			for (int i = 0; i < inv.getSize(); i++) {
//				Random rand = new Random();
//				int so = rand.nextInt(4) + 1;
//
//				if (so == 2) {
//					inv.setItem(i, new ItemStack(Material.RAW_FISH));
//				} else {
//					inv.setItem(i, new ItemStack(Material.STAINED_GLASS_PANE));
//				}
//
//			}
//			inventories.put(player, inv);
//		} else {
//			inventories.remove(player);
//			inv = Bukkit.createInventory(null, 45, "§r §r §r §r §r §r §r §c§l« §d§lＦｉｓｈｉｎｇ Ｍｉｎｉｇａｍｅ §c§l»");
//			inv.clear();
//			for (int i = 0; i < inv.getSize(); i++) {
//				Random rand = new Random();
//				int so = rand.nextInt(4) + 1;
//
//				if (so == 2) {
//					inv.setItem(i, new ItemStack(Material.RAW_FISH));
//				} else {
//					inv.setItem(i, new ItemStack(Material.STAINED_GLASS_PANE));
//				}
//
//			}
//			inventories.put(player, inv);
//		}
//		return inv;
//	}
//
//	@EventHandler
//	public void choiminigamecoqua(InventoryClickEvent e) {
//
//		Player p = (Player) e.getWhoClicked();
//		ItemStack i = e.getCurrentItem();
//
//		if (i == null) {
//			return;
//		}
//		if (e.getClickedInventory().getTitle() != "§r §r §r §r §r §r §r §c§l« §d§lＦｉｓｈｉｎｇ Ｍｉｎｉｇａｍｅ §c§l»") {
//			return;
//		}
//
//		e.setCancelled(true);
//
//		if (i.getType() == Material.RAW_FISH) {
//			i.setType(Material.BARRIER);
//			p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
//		}
//
//	}
//
//	static int count = 8;
//
//	public static void startPupperMinigame(Player p, Inventory inv) {
//
//		p.openInventory(inv);
//
//		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
//				new Runnable() {
//
//					@Override
//					public void run() {
//
//						if (inv.contains(new ItemStack(Material.RAW_FISH)) == false) {
//
//							p.closeInventory();
//							p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
//
//							ItemStack i = StardewItems.PUPPER_FISH();
//							p.sendTitle("", "§e§lBạn vừa câu được " + i.getItemMeta().getDisplayName());
//							p.getLocation().getWorld().dropItemNaturally(p.getLocation(), i);
//
//						} else {
//
//							p.closeInventory();
//
//							p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
//							p.sendTitle("", "§c§lBạn vừa câu trượt một con cá");
//
//						}
//					}
//
//				}, 80L);
//	}
//
//	public static void startFishingMinigame(Player p, Inventory inv) {
//
//		p.openInventory(inv);
//
//		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
//				new Runnable() {
//
//					@Override
//					public void run() {
//
//						if (inv.contains(new ItemStack(Material.RAW_FISH)) == false) {
//
//							p.closeInventory();
//							p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
//
//							if (p.getLocation().getBlock().getBiome().equals(Biome.OCEAN)
//									|| p.getLocation().getBlock().getBiome().equals(Biome.DEEP_OCEAN)
//									|| p.getLocation().getBlock().getBiome().equals(Biome.BEACHES)) {
//
//								ItemStack item = new ItemStack(Material.RAW_FISH);
//								ItemMeta mt = item.getItemMeta();
//
//								Random rand = new Random();
//								int so = rand.nextInt(StardewValley.OCEAN_FISH_NAME.size());
//
//								int sao = rand.nextInt(20) + 1;
//								if (sao != 18) {
//									mt.setDisplayName(StardewValley.OCEAN_FISH_NAME.get(so));
//								} else {
//									int vangbac = rand.nextInt(2) + 1;
//									if (vangbac == 1) {
//										mt.setDisplayName("§f§l✭ " + StardewValley.OCEAN_FISH_NAME.get(so));
//									} else {
//										mt.setDisplayName("§6§l✭ " + StardewValley.OCEAN_FISH_NAME.get(so));
//									}
//								}
//
//								int mau = rand.nextInt(6) + 1;
//								int food = rand.nextInt(4) + 1;
//
//								ArrayList<String> lore = new ArrayList<String>();
//								lore.add("");
//								lore.add(StardewValley.OCEAN_FISH_LORE.get(so));
//								lore.add("");
//								lore.add("§a§l✙ §6" + mau);
//								lore.add("§c§l✙ §e" + food);
//								lore.add("§b§l[Các loài cá]");
//
//								mt.setLore(lore);
//								item.setItemMeta(mt);
//								p.sendTitle("", "§e§lBạn vừa câu được " + item.getItemMeta().getDisplayName());
//								p.getInventory().addItem(item);
//
//							} else {
//
//								ItemStack item = new ItemStack(Material.RAW_FISH);
//								ItemMeta mt = item.getItemMeta();
//
//								Random rand = new Random();
//								int so = rand.nextInt(StardewValley.RIVER_FISH_NAME.size());
//
//								int sao = rand.nextInt(20) + 1;
//								if (sao != 18) {
//									mt.setDisplayName(StardewValley.RIVER_FISH_NAME.get(so));
//								} else {
//									int vangbac = rand.nextInt(2) + 1;
//									if (vangbac == 1) {
//										mt.setDisplayName("§f§l✭ " + StardewValley.RIVER_FISH_NAME.get(so));
//									} else {
//										mt.setDisplayName("§6§l✭ " + StardewValley.RIVER_FISH_NAME.get(so));
//									}
//								}
//
//								int mau = rand.nextInt(6) + 1;
//								int food = rand.nextInt(4) + 1;
//
//								ArrayList<String> lore = new ArrayList<String>();
//								lore.add("");
//								lore.add(StardewValley.RIVER_FISH_LORE.get(so));
//								lore.add("");
//								lore.add("§a§l✙ §6" + mau);
//								lore.add("§c§l✙ §e" + food);
//								lore.add("§b§l[Các loài cá]");
//
//								mt.setLore(lore);
//								item.setItemMeta(mt);
//								p.sendTitle("", "§e§lBạn vừa câu được " + item.getItemMeta().getDisplayName());
//								p.getInventory().addItem(item);
//
//							}
//
//						} else {
//
//							p.closeInventory();
//
//							p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
//							p.sendTitle("", "§c§lBạn vừa câu trượt một con cá");
//
//						}
//					}
//
//				}, 160L);
//	}
	
}
