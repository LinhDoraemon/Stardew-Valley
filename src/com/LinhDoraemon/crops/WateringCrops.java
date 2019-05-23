package com.LinhDoraemon.crops;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.LinhDoraemon.energy.EnergyAPI;
import com.LinhDoraemon.machenics.WateringCan;

public class WateringCrops implements Listener {

	@EventHandler
	public void nguoichoituoinuoc(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Block b = e.getClickedBlock();
		ItemStack i = e.getItem();

		if (b == null || i == null) {
			return;
		}
		if (!(i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
				.equalsIgnoreCase(WateringCan.getWateringCan().getItemMeta().getDisplayName()))) {
			return;
		}

		if (e.getAction() != Action.RIGHT_CLICK_BLOCK) {
			return;
		}

		if (b.getRelative(BlockFace.UP).getType() == Material.STATIONARY_WATER) {
			e.setCancelled(true);
			WateringCan.setFullDurability(p);
			p.playSound(p.getLocation(), Sound.ITEM_BOTTLE_FILL, 1, 1);
			return;
		}

		if (WateringCan.isRanoutOfWater(p)) {
			e.setCancelled(true);
			p.sendTitle("", "§c§lHết nước ✖");
			return;
		}

		if (b.getType() == Material.SOIL && b.getData() != 7) {
			if(EnergyAPI.getEnergy(p) == 0) {
				e.setCancelled(true);
				p.sendMessage("§cHết năng lượng.");
				p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 2));
			}
			b.setData((byte) 7);
			WateringCan.useWateringCan(p);
			p.playEffect(b.getLocation(), Effect.STEP_SOUND, Material.STATIONARY_WATER);
			EnergyAPI.removeEnergy(p, 2);
			return;
		}

		Location loc = b.getLocation();
		loc.setY(loc.getBlockY() - 1);
		Block soil = loc.getBlock();

		if (soil.getType() == Material.SOIL && soil.getData() != 7) {
			
			WateringCan.useWateringCan(p);

			Block down = b.getRelative(BlockFace.DOWN);
			down.setType(Material.SOIL);
			down.setData((byte) 7);

			p.playEffect(b.getLocation(), Effect.STEP_SOUND, Material.STATIONARY_WATER);

		}

	}

}
