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

public class Garlic {

	public static String getName = "§f§lTỏi ";

	public static boolean isGarlBlock(Block b) {

		if (CropStorage.GARLIC.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeGarlBlock(Block b) {

		if (isGarlBlock(b)) {
			CropStorage.GARLIC.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addGarlBlock(Block b) {

		if (isGarlBlock(b) == false) {
			CropManager c = new CropManager(CropsData.GARLIC, b);
			c.update();
		}

	}

	public static void harvestGarl(Block b, Location loc) {
		b.setType(Material.AIR);
		
		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);
		
		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getGarlic());
		
		removeGarlBlock(b);
	}

	public static ItemStack getGarlic() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7I" + "nVybCI6Imh0dHA6Ly90ZXh0dXJlc" + "y5taW5lY3JhZnQubmV0L3RleHR1cm"
						+ "UvMzA1MmQ5YzExODQ4ZWJjYzlmODM0" + "MDMzMjU3N2JmMWQyMmI2NDNjMzRjNmF"
						+ "hOTFmZTRjMTZkNWE3M2Y2ZDgifX19");
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§f§lTỏi " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fHãy thêm một nguyên liệu tuyệt vời vào", "§fcác món ăn của bạn", "",
				SimpleItem.isHealth(1), SimpleItem.isFood(0.5), "", HashTag.TYPE_CROPS);
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

			addGarlBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §a§lXUÂN");
		}

		return true;
	}
}
