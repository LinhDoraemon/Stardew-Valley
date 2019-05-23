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

public class Kale {

	public static String getName = "§a§lCải xoăn ";

	public static boolean isKaleBlock(Block b) {

		if (CropStorage.KALE.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeKaleBlock(Block b) {

		if (isKaleBlock(b)) {
			CropStorage.KALE.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addKaleBlock(Block b) {

		if (isKaleBlock(b) == false) {
			CropManager c = new CropManager(CropsData.KALE, b);
			c.update();
		}

	}

	public static void harvestKale(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getKale());
	}

	public static ItemStack getKale() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InV" + "ybCI6Imh0dHA6Ly90ZXh0dXJlcy5t" + "aW5lY3JhZnQubmV0L3RleHR1cmUvZ"
						+ "TUxOTY5NjlhZmNjMTk0OWMzNTM4Nj" + "k3Y2RkNWIxOTE5N2ZhMzg1MTYxMzQ"
						+ "2OGRiZDU1ZDAzMTUzODk5YjYifX19");
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§a§lCải xoăn " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fLoại là rất tuyệt vời cho các", "§fmón súp và xào.", "", SimpleItem.isHealth(2.5),
				SimpleItem.isFood(1), "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantGarlic(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSpring()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addKaleBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §a§lXUÂN");
		}

		return true;
	}

}
