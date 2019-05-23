package com.LinhDoraemon.machenics;

import java.util.Arrays;
import java.util.Random;

import org.bukkit.Sound;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import com.LinhDoraemon.SpecialItem.StardewItems;

public class KillMobModule implements Listener {

	private EntityType[] type = { EntityType.ZOMBIE, EntityType.SKELETON, EntityType.SPIDER };

	@EventHandler
	public void MOB_KILL_EVENT(EntityDamageByEntityEvent e) {
		if (!(e.getDamager() instanceof Player && Arrays.asList(type).contains(e.getEntity().getType()))) {
			return;
		}
		
		Player p = (Player) e.getDamager();
		Entity en = e.getEntity();
		
		if(((Damageable) en).getHealth() - e.getFinalDamage() <= 0){
			
			if(p.getWorld().getName().equalsIgnoreCase("ASkyBlock") == false) {
				e.setCancelled(true);
				en.remove();
				return;
			}
			
			e.setCancelled(true);
			en.remove();
			en.getWorld().dropItemNaturally(en.getLocation(), StardewItems.BUG_MEAT());
			switch (new Random().nextInt(200)) {
			case 2:
				en.getWorld().dropItemNaturally(en.getLocation(), StardewItems.SLIME());
				break;
			case 10:
			case 20:
				en.getWorld().dropItemNaturally(en.getLocation(), StardewItems.SOLAR_ESSENCE());
				break;
			case 30:
			case 40:
				en.getWorld().dropItemNaturally(en.getLocation(), StardewItems.VOID_ESSENCE());
				break;
			default:
				break;
			}
			
			if(new Random().nextInt(300) == 50) {
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
				en.getWorld().dropItemNaturally(en.getLocation(), StardewItems.DIAMOND());
				return;
			}
		}
		
	}
}
