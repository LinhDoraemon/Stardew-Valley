package com.LinhDoraemon.cropstype;

import java.util.Random;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.crops.CropsData;
import com.LinhDoraemon.crops.CropsMeta;
import com.LinhDoraemon.data.CropManager;
import com.LinhDoraemon.data.CropStorage;
import com.LinhDoraemon.season.DaysAndTimes;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class Potato {

	public static String getName = "§e§lKhoai tây ";

	public static boolean isPotaBlock(Block b) {

		if (CropStorage.POTATO.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removePotaBlock(Block b) {

		if (isPotaBlock(b)) {
			CropStorage.POTATO.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addPotaBlock(Block b) {

		if (isPotaBlock(b) == false) {
			CropManager c = new CropManager(CropsData.POTATO, b);
			c.update();
		}

	}

	public static void harvestPota(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		Random rand = new Random();
		int so = rand.nextInt(5);

		if (so == 1) {
			b.getWorld().dropItem(loc, getPotato());
			b.getWorld().dropItem(loc, getPotato());
		} else {

			b.getWorld().dropItem(loc, getPotato());
		}

		removePotaBlock(b);
	}

	public static ItemStack getPotato() {
		ItemStack item = new ItemStack(Material.POTATO_ITEM);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§e§lKhoai tây " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fMột loại củ được trồng rộng rãi", "", SimpleItem.isHealth(1.5),
				SimpleItem.isFood(0.5), "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantPotato(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSpring()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addPotaBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §a§lXUÂN");
		}

		return true;
	}

}
