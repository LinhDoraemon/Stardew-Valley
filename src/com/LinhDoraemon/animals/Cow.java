package com.LinhDoraemon.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class Cow {

	private static List<Entity> FEEDING = new ArrayList<Entity>();
	private static List<Entity> MILKED = new ArrayList<Entity>();

	public static ItemStack getCow() {
		ItemStack i = new ItemStack(Material.MONSTER_EGG, 1, EntityType.COW.getTypeId());
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName(
				"§6§l" + AnimalsListener.ANIMAL_NAME[new Random().nextInt(AnimalsListener.ANIMAL_NAME.length)]);
		SimpleItem.addLore(mt, "", "§fNhớ làm chuồng bò trước khi thả để", "§ftránh đi mất.", "",
				HashTag.TYPE_ANIMALS_EGG);
		i.setItemMeta(mt);
		return i;
	}
	
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

	public static void setMilked(Entity b, boolean dachoanchua) {
		if (dachoanchua == true) {
			if (MILKED.contains(b)) {
				return;
			} else {
				MILKED.add(b);
			}
		} else {
			if (MILKED.contains(b)) {
				MILKED.remove(b);
			} else {
				return;
			}
		}
	}

	public static boolean isMilked(Entity b) {
		if (MILKED.contains(b)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isFed(Entity b) {
		if (FEEDING.contains(b)) {
			return true;
		} else {
			return false;
		}
	}

	public static void produceMilk(Entity b) {
		Location loc = b.getLocation().getBlock().getRelative(BlockFace.UP).getLocation();

		loc.getWorld().spawnParticle(Particle.HEART, loc, 5);
		b.getWorld().dropItemNaturally(b.getLocation().getBlock().getRelative(BlockFace.UP).getLocation(), StardewItems.MILK());

		b.getWorld().playSound(b.getLocation(), Sound.ENTITY_COW_MILK, 1, 1);
		b.getWorld().playSound(b.getLocation(), Sound.ITEM_BUCKET_FILL, 1, 1);
		setMilked(b, true);
		return;

	}

	public static void breedingCow(Entity b) {

		Location loc = b.getLocation().getBlock().getRelative(BlockFace.UP).getLocation();

		loc.getWorld().spawnParticle(Particle.HEART, loc, 5);
		b.getWorld().playSound(b.getLocation(), Sound.ENTITY_COW_AMBIENT, 1, 1);
		setFed(b, true);
		return;
	}

	public static void resetBreading() {
		FEEDING.clear();
		MILKED.clear();
		Bukkit.getConsoleSender()
				.sendMessage("§f§l[§6§lSTARDEW VALLEY§f§l] §e§lĐã thiết lập lại dữ liệu cho bò ăn....");
		return;
	}
	
	public static int getSellPrice() {
		return new Random().nextInt(2400) + 1;
	}

}
