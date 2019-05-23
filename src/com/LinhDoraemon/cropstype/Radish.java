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

public class Radish {

	public static boolean isRadishBlock(Block b) {

		if (CropStorage.RADISH.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeRadishBlock(Block b) {

		if (isRadishBlock(b)) {
			CropStorage.RADISH.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addRadishBlock(Block b) {

		if (isRadishBlock(b) == false) {
			CropManager c = new CropManager(CropsData.RADISH, b);
			c.update();
		}

	}

	public static void harvestRadish(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getRadish());

		removeRadishBlock(b);
	}

	public static ItemStack getRadish() {
		ItemStack item = new ItemStack(Material.BEETROOT);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§c§lCủ dền " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fMột loại rau củ giòn và tươi mát,", "§dăn với hạt tiêu khi ăn sống.", "",
				HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantRadish(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSummer()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addRadishBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §e§lHÈ");
		}

		return true;
	}

}
