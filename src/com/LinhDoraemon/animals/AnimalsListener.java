package com.LinhDoraemon.animals;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;

public class AnimalsListener implements Listener {

	public static String[] ANIMAL_NAME = { "Onii-chan", "Kamezoku", "Sammy", "Quicery", "Theriot", "Pandas", "Zoe",
			"Twilight", "Machenism", "Chickery", "Beko", "Sailex", "Daxua", "Pinkle", "Pieree", "Knocblock", "Rem" };
	
	@EventHandler
	public void BUCKET_FILL(PlayerBucketFillEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void ON_PRODUCT_SPAWN(ItemSpawnEvent e) {
		Item i = e.getEntity();
		
		if(i == null) {
			return;
		}
		
		ItemStack item = i.getItemStack();
		
		if(item.getType() == Material.EGG) {
			if(item.hasItemMeta()) {
				return;
			}else {
				i.remove();
			}
		}
		
		if(item.getType() == Material.WOOL) {
			if(item.hasItemMeta()) {
				return;
			}else {
				i.setItemStack(StardewItems.WOOL());
			}
		}
	}
	
	// TODO Interact với người chơi
	@EventHandler
	public void interactvoidongvat(PlayerInteractEntityEvent e) {

		Player p = e.getPlayer();
		Entity en = e.getRightClicked();
		ItemStack i = p.getInventory().getItemInMainHand();

		if (en == null || i == null) {
			return;
		}

		if (en instanceof org.bukkit.entity.Chicken) {
			e.setCancelled(true);
			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
					&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§e§lLúa mì")) {
				if (Chicken.isFed(en) == false) {
					int am = i.getAmount();
					i.setAmount(am - 1);

					Chicken.setFed(en, true);
					Chicken.produceEgg(en);
				} else {
					p.sendMessage("§c§lChú gà nhỏ này đã được cho ăn rồi !");
				}

			} else {
				e.setCancelled(true);
				p.sendMessage("§c§lGà không ăn được thứ này đâu ! Chỉ ăn được §e§lLÚA MÌ §c§lthôi !");
			}
		}

		if (en instanceof org.bukkit.entity.Sheep) {
			e.setCancelled(true);
			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equalsIgnoreCase(StardewItems.SHEARS().getItemMeta().getDisplayName())) {
				if (Sheep.isSheared(en)) {
					p.sendMessage("§c§lChú cừu này đã cắt lông rồi !");
					return;
				} else {
					if (Sheep.isFed(en)) {
						Sheep.setSheared(en, true);
						Sheep.produceSilk(en);
					} else {
						p.sendMessage("§c§lCừu này chưa được cho ăn :(");
					}
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
					&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§e§lLúa mì")) {
				if (Sheep.isFed(en) == false) {
					int am = i.getAmount();
					i.setAmount(am - 1);

					Sheep.setFed(en, true);
				} else {
					p.sendMessage("§c§lCon cừu nhỏ này đã được cho ăn rồi !");
				}

			} else {
				e.setCancelled(true);
				p.sendMessage("§c§lCừu không ăn được thứ này đâu ! Chỉ ăn được §e§lLÚA MÌ §c§lthôi !");
			}

		}

		if (en instanceof org.bukkit.entity.Cow) {
			e.setCancelled(true);
			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
					&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§9§lBình vắt sữa")) {
				if (Cow.isMilked(en)) {
					p.sendMessage("§c§lChú bò này đã vắt sữa rồi !");
				} else {
					if (Cow.isFed(en)) {
						Cow.setMilked(en, true);
						Cow.produceMilk(en);
					} else {
						p.sendMessage("§c§lBò này chưa được cho ăn :(");
					}
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
					&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§e§lLúa mì")) {
				if (Cow.isFed(en) == false) {
					int am = i.getAmount();
					i.setAmount(am - 1);

					Cow.setFed(en, true);
				} else {
					p.sendMessage("§c§lCon bò nhỏ này đã được cho ăn rồi !");
				}

			} else {
				e.setCancelled(true);
				p.sendMessage("§c§lBò không ăn được thứ này đâu ! Chỉ ăn được §e§lLÚA MÌ §c§lthôi !");
			}

		}

	}

}
