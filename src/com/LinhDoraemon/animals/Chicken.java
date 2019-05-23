package com.LinhDoraemon.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class Chicken {

	public static ItemStack getChicken() {
		ItemStack i = new ItemStack(Material.MONSTER_EGG, 1, EntityType.CHICKEN.getTypeId());
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName(
				"§6§l" + AnimalsListener.ANIMAL_NAME[new Random().nextInt(AnimalsListener.ANIMAL_NAME.length)]);
		SimpleItem.addLore(mt, "", "§fNhớ làm chuồng gà trước khi thả để", "§ftránh đi mất.", "",
				HashTag.TYPE_ANIMALS_EGG);
		i.setItemMeta(mt);
		return i;
	}

	public static int getSellPrice() {
		return new Random().nextInt(1800) + 1;
	}

	private static List<Entity> FEEDING = new ArrayList<Entity>();

	public static void setFed(Entity b, boolean dachoanchua) {
		if (dachoanchua == true) {
			if (FEEDING.contains(b)) {
				return;
			} else {
				FEEDING.add(b);
			}
		} else {
			if (FEEDING.contains(b)) {
				FEEDING.remove(b);
			} else {
				return;
			}
		}
	}

	public static boolean isFed(Entity b) {

		if (FEEDING.contains(b)) {
			return true;
		} else {
			return false;
		}
	}

	public static void produceEgg(Entity b) {

		Location loc = b.getLocation();

		b.getWorld().playSound(b.getLocation(), Sound.ENTITY_CHICKEN_EGG, 1, 1);
		b.getWorld().playSound(b.getLocation(), Sound.ENTITY_CHICKEN_AMBIENT, 1, 1);

		loc.getWorld().spawnParticle(Particle.HEART, loc, 5);
		loc.getWorld().dropItemNaturally(loc.add(0, 1, 0), StardewItems.EGG());
		setFed(b, true);
		return;
	}

	public static void resetBreading() {
		FEEDING.clear();
		Bukkit.getConsoleSender()
				.sendMessage("§f§l[§6§lSTARDEW VALLEY§f§l] §e§lĐã thiết lập lại dữ liệu cho gà ăn....");
		return;
	}

}
