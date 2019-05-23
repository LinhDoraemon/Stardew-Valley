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
import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class RedCabbage {

	public static boolean isRCabbageBlock(Block b) {

		if (CropStorage.RED_CABBAGE.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeRCabbageBlock(Block b) {

		if (isRCabbageBlock(b)) {
			CropStorage.RED_CABBAGE.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addRCabbageBlock(Block b) {

		if (isRCabbageBlock(b) == false) {
			CropManager c = new CropManager(CropsData.RED_CABBAGE, b);
			c.update();
		}

	}

	public static void harvestRCabbage(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getRedCabbage());

		
	}

	public static ItemStack getRedCabbage() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh" + "0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0"
						+ "L3RleHR1cmUvOTVjMjdlOWUwNzQ0NjgyNWZhN" + "2VjYmFjMTkyNTEwOWUyYzE2MjUzNTY0YTQ2Mjg"
						+ "yMDJkODk0NDkyZDJjMzZmOCJ9fX0=");
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§c§lCải bắp đỏ " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fThường được sử dụng trong món", "§fsalad và xà lách trộn.", "",
				SimpleItem.isHealth(2.5), SimpleItem.isFood(1), "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantRedCabbage(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSummer()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addRCabbageBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §e§lHÈ");
		}

		return true;
	}
}
