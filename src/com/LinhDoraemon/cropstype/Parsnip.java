package com.LinhDoraemon.cropstype;

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

public class Parsnip {

	public static String getName = "§e§lCủ cải vàng ";

	public static boolean isParsBlock(Block b) {

		if (CropStorage.PARSNIP.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeParsBlock(Block b) {

		if (isParsBlock(b)) {
			CropStorage.PARSNIP.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addParsBlock(Block b) {

		if (isParsBlock(b) == false) {
			CropManager c = new CropManager(CropsData.PARSNIP, b);
			c.update();
		}

	}

	public static void harvestPars(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getParsnip());
	
		removeParsBlock(b);
	}

	public static ItemStack getParsnip() {
		ItemStack item = new ItemStack(Material.CARROT_ITEM);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§e§lCủ cải vàng " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fMột loại rau củ có họ gần với cà rốt,", "§fcó vị đất và đầy đủ vitamin.", "",
				SimpleItem.isHealth(1.5), SimpleItem.isFood(0.5), "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantParsnip(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSpring()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addParsBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §a§lXUÂN");
		}

		return true;
	}
}
