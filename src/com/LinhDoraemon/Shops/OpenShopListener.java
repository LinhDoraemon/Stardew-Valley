package com.LinhDoraemon.Shops;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.data.PlayerData;
import com.LinhDoraemon.season.DaysAndTimes;
import com.LinhDoraemon.utils.SimpleItem;

public class OpenShopListener implements Listener {

	@EventHandler
	public void nguoichoimocuahangra(PlayerInteractEvent e) {

		Player p = e.getPlayer();
		Block b = e.getClickedBlock();

		if (b == null) {
			return;
		}

		if (b.getLocation().equals(new Location(Bukkit.getWorld("stardewhome"), 352, 66, -89))) {
			if (DaysAndTimes.isSpring()) {
				PierreShop.openPiereSpringShop(p);
				return;
			}
			if (DaysAndTimes.isSummer()) {
				PierreShop.openPiereSummerShop(p);
				return;
			}
			if(DaysAndTimes.isFall()) {
				PierreShop.openPiereFallShop(p);
				return;
			}
			return;
		}

		if (b.getLocation().equals(new Location(Bukkit.getWorld("world"), 58, 65, 11))) {
			ClintShop.mainClintShop(p);
			return;
		}
		
		if (b.getLocation().equals(new Location(Bukkit.getWorld("world"), -101, 65, 56))) {
			MarnieShop.openMarnieShop(p);
			return;
		}
	}

	private static boolean enoughMoney(Player p, int amount) {
		if (PlayerData.getPlayerMoney(p.getName()) >= amount) {
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void nguoichoiclintshop(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (!(e.getClickedInventory().getTitle().equals("§0§lTiệm rèn của Clint >>"))) {
			return;
		}
		e.setCancelled(true);
		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals("§e§lNÂNG CẤP ITEM TRÊN TAY")) {

			if (enoughMoney(p, 5000)) {

				ItemStack inhand = p.getInventory().getItemInMainHand();

				if (inhand.getType() == Material.STONE_PICKAXE) {
					if (p.getInventory().containsAtLeast(StardewItems.COPPER_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.COPPER_PICKAXE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.getMaterial((byte) 336));
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §6§l5 thỏi đồng");
					}
				}

				if (inhand.getType() == Material.STONE_AXE) {
					if (p.getInventory().containsAtLeast(new ItemStack(StardewItems.COPPER_BAR()), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.COPPER_AXE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.getMaterial((byte) 336));
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §6§l5 thỏi đồng");
					}
				}

				if (inhand.getType() == Material.STONE_HOE) {
					if (p.getInventory().containsAtLeast(StardewItems.COPPER_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.COPPER_HOE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.getMaterial((byte) 336));
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §6§l5 thỏi đồng");
					}
				}
				
				if(inhand.getType() == Material.WOOD_PICKAXE) {
					if (p.getInventory().containsAtLeast(StardewItems.IRON_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.IRON_PICKAXE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.IRON_INGOT);
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §f§l5 thỏi sắt");
					}
				}
				
				if(inhand.getType() == Material.WOOD_AXE) {
					if (p.getInventory().containsAtLeast(StardewItems.IRON_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.IRON_AXE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.IRON_INGOT);
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §f§l5 thỏi sắt");
					}
				}
				
				if(inhand.getType() == Material.WOOD_HOE) {
					if (p.getInventory().containsAtLeast(StardewItems.IRON_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.IRON_HOE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.IRON_INGOT);
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §f§l5 thỏi sắt");
					}
				}

				if(inhand.getType() == Material.IRON_HOE) {
					if (p.getInventory().containsAtLeast(StardewItems.GOLD_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.GOLD_HOE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.GOLD_INGOT);
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §e§l5 thỏi vàng");
					}
				}
				
				if(inhand.getType() == Material.IRON_PICKAXE) {
					if (p.getInventory().containsAtLeast(StardewItems.GOLD_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.GOLD_PICKAXE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.GOLD_INGOT);
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §e§l5 thỏi vàng");
					}
				}
				
				if(inhand.getType() == Material.IRON_AXE) {
					if (p.getInventory().containsAtLeast(StardewItems.GOLD_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.GOLD_AXE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.GOLD_INGOT);
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §e§l5 thỏi vàng");
					}
				}
				
				if(inhand.getType() == Material.GOLD_AXE) {
					if (p.getInventory().containsAtLeast(StardewItems.IRIDIUM_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.IRIDIUM_AXE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.DIAMOND);
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §5§l5 thỏi iriđium");
					}
				}
				
				if(inhand.getType() == Material.GOLD_PICKAXE) {
					if (p.getInventory().containsAtLeast(StardewItems.IRIDIUM_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.IRIDIUM_PICKAXE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.DIAMOND);
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §5§l5 thỏi iriđium");
					}
				}
				
				if(inhand.getType() == Material.GOLD_AXE) {
					if (p.getInventory().containsAtLeast(StardewItems.IRIDIUM_BAR(), 5)) {
						p.getInventory().setItemInMainHand(StardewItems.IRIDIUM_HOE());
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
						PlayerData.removePlayerMoney(p.getName(), 5000);
						SimpleItem.consumeItem(p, 5, Material.DIAMOND);
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §5§l5 thỏi iriđium");
					}
				}
				
				return;
			} else {
				p.closeInventory();
				p.sendMessage("§c§lBạn không đủ §a§l5000đ");
			}

		}
		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals("§a§lĐẬP QUẶNG VỚI GIÁ §e§l25đ")) {
			p.closeInventory();
			ClintShop.openBreakOreInv(p);
			return;
		}
	}

	@EventHandler
	public void nguoichoiclintshop2(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (!(e.getClickedInventory().getTitle().equals("§0§lĐập quặng >>"))) {
			return;
		}
		// BREAK ORE

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals("§a§lĐẬP THÔI")) {
			e.setCancelled(true);
			if (e.getClickedInventory().getItem(4) != null) {
				if (e.getClickedInventory().getItem(4).getItemMeta() != null
						&& e.getClickedInventory().getItem(4).getItemMeta().getDisplayName() != null
						&& (e.getClickedInventory().getItem(4).getItemMeta().getDisplayName().equals("§6§lTinh thể đá")
								|| e.getClickedInventory().getItem(4).getItemMeta().getDisplayName()
										.equals("§b§lTinh thể Omni"))) {
					if (enoughMoney(p, 25)) {

						int am = e.getClickedInventory().getItem(4).getAmount();
						e.getClickedInventory().getItem(4).setAmount(am - 1);

						p.getInventory().addItem(ClintShop.getRandomResource());
						p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);

						PlayerData.removePlayerMoney(p.getName(), 25);
						
						return;
					} else {
						p.closeInventory();
						p.sendMessage("§c§lBạn không đủ §a§l25đ");
					}
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			} else {
				p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
			}
		}

		if(i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals("§e§lMột số quặng có thể đập") || i.getType() == Material.WOOL) {
			e.setCancelled(true);
			return;
		}
		
	}

}
