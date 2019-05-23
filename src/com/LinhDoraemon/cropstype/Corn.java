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

public class Corn {

	public static String getName = "§e§lBắp ngô ";

	public static boolean isCornBlock(Block b) {

		if (CropStorage.CORN.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeCornBlock(Block b) {

		if (isCornBlock(b)) {
			CropStorage.CORN.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addCornBlock(Block b) {

		if (isCornBlock(b) == false) {
			CropManager c = new CropManager(CropsData.CORN, b);
			c.update();
		}

	}

	public static void harvestCorn(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getCorn());

		removeCornBlock(b);
	}

	public static ItemStack getCorn() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI" + "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3Jh"
						+ "ZnQubmV0L3RleHR1cmUvZDM5MWRmZmJlYT" + "JmYzNmMmFkNzhhNjIzZjQ5YmY3ZTExMjE2"
						+ "OTQxMTJjMzc1OWZlZWQ0MTU2ZmMyYmE" + "0NmMwIn19fQ==");
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§e§lBắp ngô " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fMột loại ngũ cốc phổ biến nhất. Các",
				"§floại bắp ngọt, tươi rất tuyệt vào mùa hè.", "", SimpleItem.isHealth(0.5), SimpleItem.isFood(1.5), "",
				HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantCorn(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSummer()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addCornBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §e§lHÈ");
		}

		return true;
	}

}
