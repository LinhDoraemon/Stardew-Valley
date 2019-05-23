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

public class Tomato {

	public static boolean isTomatoBlock(Block b) {

		if (CropStorage.TOMATO.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeTomatoBlock(Block b) {

		if (isTomatoBlock(b)) {
			CropStorage.TOMATO.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addTomatoBlock(Block b) {

		if (isTomatoBlock(b) == false) {
			CropManager c = new CropManager(CropsData.TOMATO, b);
			c.update();
		}

	}

	public static void harvestTomato(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getTomato());
		b.getWorld().dropItem(loc, getTomato());

		removeTomatoBlock(b);

	}

	public static ItemStack getTomato() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVy" + "bCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmU"
						+ "vYzhiNzUyZTUyMzJiMDM5YjFlNzVlNDU0M"
						+ "TgzYTE5MmQ0MDU3YjdjYTgzMmY3YzI0YTVmZDg2Nzk2OWNiNGQifX19");
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§c§lCà chua " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fGiàu hương vị, cà chua có nhiều", "§fcách sử dụng trong ẩm thực.", "",
				HashTag.TYPE_CROPS);
		item.setItemMeta(mt);

		return item;
	}

	public static boolean plantTomato(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSummer()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addTomatoBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §e§lHÈ");
		}

		return true;
	}

}
