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

public class Strawberry {

	public static String getName = "§d§lDâu tây ";

	public static boolean isStraBlock(Block b) {

		if (CropStorage.STRAWBERRY.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeStraBlock(Block b) {

		if (isStraBlock(b)) {
			CropStorage.STRAWBERRY.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addStraBlock(Block b) {

		if (isStraBlock(b) == false) {
			CropManager c = new CropManager(CropsData.STRAWBERRY, b);
			c.update();
		}

	}

	public static void harvestStra(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getStrawberry());

		removeStraBlock(b);

	}

	public static ItemStack getStrawberry() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7In" + "VybCI6Imh0dHA6Ly90ZXh0dXJlcy5" + "taW5lY3JhZnQubmV0L3RleHR1cmUv"
						+ "Yjk3MDhkODE4YmU5N2RjN2UyYzNiY" + "jVjMzU2NjNlYjM2MjY5MjM2ZTliYzk"
						+ "4Mjg2ZjQyOWRmZGYzNzVhYTkifX19");
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§d§lDâu tây " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fMột hương vị ngọt ngào với màu", "§fđỏ hấp dẫn.", "", SimpleItem.isHealth(2.5),
				SimpleItem.isFood(1), "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantStrawberry(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSpring()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addStraBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §a§lXUÂN");
		}

		return true;
	}

}
