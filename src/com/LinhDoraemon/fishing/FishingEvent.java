package com.LinhDoraemon.fishing;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//
//import org.bukkit.Bukkit;
//import org.bukkit.Material;
//import org.bukkit.Sound;
//import org.bukkit.entity.Item;
//import org.bukkit.entity.Player;
//import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
//import org.bukkit.event.block.Action;
//import org.bukkit.event.player.PlayerFishEvent;
//import org.bukkit.event.player.PlayerInteractEvent;
//import org.bukkit.inventory.Inventory;
//import org.bukkit.inventory.ItemStack;
//import org.bukkit.inventory.meta.ItemMeta;
//import org.bukkit.potion.PotionEffect;
//import org.bukkit.potion.PotionEffectType;
//
//import com.LinhDoraemon.StardewValley.StardewValley;
//import com.LinhDoraemon.utils.CSkull;
//import com.LinhDoraemon.utils.CaughtChestItems;
//import com.LinhDoraemon.utils.HashTag;

public class FishingEvent implements Listener {
//
//	private static Map<String, Inventory> inventories = new HashMap<String, Inventory>();
//
//	Inventory getInventory(String player) {
//		Inventory inv = inventories.get(player);
//
//		if (inv == null) {
//			inv = Bukkit.createInventory(null, 27, "§6§l<< Rương câu được >>");
//			inv.setItem(13, new ItemStack(CaughtChestItems.ITEMS[new Random().nextInt(CaughtChestItems.ITEMS.length)]));
//			inventories.put(player, inv);
//		} else {
//			inv.clear();
//			inv.setItem(13, new ItemStack(CaughtChestItems.ITEMS[new Random().nextInt(CaughtChestItems.ITEMS.length)]));
//		}
//		return inv;
//	}
//
//	@EventHandler
//	public void moruongvaanca(PlayerInteractEvent e) {
//
//		Player p = e.getPlayer();
//
//		if (p.getInventory().getItemInMainHand() == null) {
//			return;
//		}
//		if (p.getInventory().getItemInMainHand().getItemMeta() == null) {
//			return;
//		}
//
//		if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)
//				&& p.getInventory().getItemInMainHand().getItemMeta() != null
//				&& p.getInventory().getItemInMainHand().getItemMeta().getDisplayName() != null
//				&& (StardewValley.OCEAN_FISH_NAME
//						.contains(p.getInventory().getItemInMainHand().getItemMeta().getDisplayName())
//						|| StardewValley.RIVER_FISH_NAME
//								.contains(p.getInventory().getItemInMainHand().getItemMeta().getDisplayName()))) {
//
			/*String maulore = p.getInventory().getItemInMainHand().getItemMeta().getLore().get(3);
			String foodlore = p.getInventory().getItemInMainHand().getItemMeta().getLore().get(4);

			String maui = Character.toString(maulore.charAt(8));
			String foodi = Character.toString(foodlore.charAt(8));

			p.sendMessage(maulore);
			p.sendMessage(foodlore);

			int mau = Integer.parseInt(maui);
			int food = Integer.parseInt(foodi);*/

//			if (20 - p.getHealth() >= mau) {
//				p.setHealth(p.getHealth() + mau);
//				p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
//				p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EAT, 1, 1);
//			} else {
//				p.setHealth(20);
//				p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
//				p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EAT, 1, 1);
//			}
//
//			if (20 - p.getFoodLevel() >= food) {
//				p.setFoodLevel(p.getFoodLevel() + food);
//			} else {
//				p.setFoodLevel(20);
//			}
//
//		}
//
//		if (p.getInventory().getItemInMainHand().getItemMeta() != null
//				&& p.getInventory().getItemInMainHand().getItemMeta().getDisplayName() != null && p.getInventory()
//						.getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lRương câu được")) {
//
//			p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
//			p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 3, 3);
//			p.openInventory(getInventory(p.getName()));
//
//		}
//
//		if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)
//				&& p.getInventory().getItemInMainHand().getItemMeta() != null
//				&& p.getInventory().getItemInMainHand().getItemMeta().getDisplayName() != null
//				&& p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lCá nóc")) {
//
//			p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
//			p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EAT, 1, 1);
//
//			p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 200, 2));
//			p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 4));
//
//		}
//
//	}
//
//	public void caughtRuinChest(Player p) {
//
//		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
//
//		CSkull.itemWithUrl(item, "d8c1e1c62dc695eb90fa192da6aca49ab4f9dffb6adb5d2629ebfc9b2788fa2");
//		ItemMeta mt = item.getItemMeta();
//		mt.setDisplayName("§6§lRương câu được");
//
//		ArrayList<String> lore = new ArrayList<String>();
//		lore.add("");
//		lore.add("§fPhải chuột để mở xem có gì ?");
//		lore.add("");
//		lore.add(HashTag.TYPE_TREASURE);
//
//		mt.setLore(lore);
//		item.setItemMeta(mt);
//
//		p.getInventory().addItem(item);
//		p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
//	}

//	@EventHandler
//	public void onfishingevent(PlayerFishEvent e) {
//
//		Player p = e.getPlayer();
//
//		if (e.getCaught() == null) {
//			return;
//		}
//
//		if (!(e.getCaught() instanceof Item)) {
//			return;
//		}
//
//		if (((Item) e.getCaught()).getItemStack().getType() == Material.RAW_FISH
//				&& (((Item) e.getCaught()).getItemStack().getData().getData() == (byte) 0
//						|| ((Item) e.getCaught()).getItemStack().getData().getData() == (byte) 1
//						|| ((Item) e.getCaught()).getItemStack().getData().getData() == (byte) 2)) {
//			e.setCancelled(true);
//			ItemStack old = p.getInventory().getItemInMainHand();
//			p.getInventory().setItemInMainHand(new ItemStack(Material.AIR));
//			p.getInventory().setItemInMainHand(old);
//			FishingMinigame.startFishingMinigame(p, FishingMinigame.openFishingMinigame(p.getName()));
//			return;
//		} else {
//			if (((Item) e.getCaught()).getItemStack().getType() == Material.RAW_FISH
//					&& ((Item) e.getCaught()).getItemStack().getData().getData() == (byte) 3) {
//				e.setCancelled(true);
//				ItemStack old = p.getInventory().getItemInMainHand();
//				p.getInventory().setItemInMainHand(new ItemStack(Material.AIR));
//				p.getInventory().setItemInMainHand(old);
//				FishingMinigame.startPupperMinigame(p, FishingMinigame.openFishingMinigame(p.getName()));
//				return;
//			}
//
//			e.setCancelled(true);
//			ItemStack old = p.getInventory().getItemInMainHand();
//			p.getInventory().setItemInMainHand(new ItemStack(Material.AIR));
//			p.getInventory().setItemInMainHand(old);
//			caughtRuinChest(p);
//			return;
//
//		}
//	}

}
