package com.LinhDoraemon.fishing;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerFishEvent.State;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.LinhDoraemon.energy.EnergyAPI;
import com.LinhDoraemon.ocean.OceanItems;
import com.LinhDoraemon.season.Season;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.Messenger;
import com.LinhDoraemon.utils.SimpleItem;

public class FishEvent implements Listener {

	@EventHandler
	public void PLAYER_EAT_FISH_EVENT(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		ItemStack i = p.getInventory().getItemInMainHand();

		if (i == null) {
			return;
		}

		if (e.getAction() != Action.RIGHT_CLICK_AIR) {
			return;
		}

		if (i.hasItemMeta() == false || i.getItemMeta().hasDisplayName() == false
				|| i.getItemMeta().hasLore() == false) {
			return;
		}

		if (!(i.getItemMeta().getLore().contains(HashTag.TYPE_FISH))) {
			return;
		}

		p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EAT, 1, 1);

		if (i.getItemMeta().getDisplayName().startsWith("§e§lCá nóc")) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20 * 5, 3));
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 3, 2));
			i.setAmount(i.getAmount() - 1);
		} else {
			if (p.getHealth() <= 18) {
				p.setHealth(p.getHealth() + 2);
			}
			if (EnergyAPI.getEnergy(p) < 96) {
				EnergyAPI.addEnergy(p, 4);
			}else {
				EnergyAPI.resetEnergy(p);
			}
			Messenger.sendActionBar(p, SimpleItem.isHealth(2) + "   " + SimpleItem.isFood(2));
			i.setAmount(i.getAmount() - 1);
		}
	}

	@EventHandler
	public void PLAYER_FISH_EVENT(PlayerFishEvent e) {
		Player p = e.getPlayer();

		if (e.getState() != State.CAUGHT_FISH) {
			return;
		}

		if (!(e.getCaught() instanceof Item)) {
			return;
		}

		Item i = (Item) e.getCaught();

		if (i == null) {
			return;
		}

		final ItemStack item = i.getItemStack();

		if (item.getType() == Material.RAW_FISH) {
			p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
			p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
			if (Season.isSpring()) {
				FishType fish = FishType.getSprings().get(new Random().nextInt(FishType.getSprings().size()));
				if (fish.isTimed(p.getWorld())) {
					i.setItemStack(fish.getItemStack());
				} else {
					i.setItemStack(OceanItems.getRandomItem());
				}
			}
			if (Season.isSummer()) {
				FishType fish = FishType.getSummers().get(new Random().nextInt(FishType.getSummers().size()));
				if (fish.isTimed(p.getWorld())) {
					i.setItemStack(fish.getItemStack());
				} else {
					i.setItemStack(OceanItems.getRandomItem());
				}
			}
			if (Season.isFall()) {
				FishType fish = FishType.getFalls().get(new Random().nextInt(FishType.getFalls().size()));
				if (fish.isTimed(p.getWorld())) {
					i.setItemStack(fish.getItemStack());
				} else {
					i.setItemStack(OceanItems.getRandomItem());
				}
			}
			if (Season.isWinter()) {
				FishType fish = FishType.getWinters().get(new Random().nextInt(FishType.getWinters().size()));
				if (fish.isTimed(p.getWorld())) {
					i.setItemStack(fish.getItemStack());
				} else {
					i.setItemStack(OceanItems.getRandomItem());
				}
			}
			EnergyAPI.removeEnergy(p, 2);
		} else {
			i.setItemStack(OceanItems.getRandomItem());
			EnergyAPI.removeEnergy(p, 2);
		}
	}

}
