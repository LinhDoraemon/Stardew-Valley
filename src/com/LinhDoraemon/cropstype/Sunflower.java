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

public class Sunflower {

	public static boolean isSFlowerBlock(Block b) {

		if (CropStorage.SUNFLOWER.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeSFlowerBlock(Block b) {

		if (isSFlowerBlock(b)) {
			CropStorage.SUNFLOWER.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addSFlowerBlock(Block b) {

		if (isSFlowerBlock(b) == false) {
			CropManager c = new CropManager(CropsData.SUNFLOWER, b);
			c.update();
		}

	}

	public static void harvestSFlower(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getSunflower());

		removeSFlowerBlock(b);
	}

	public static ItemStack getSunflower() {
		ItemStack item = new ItemStack(Material.DOUBLE_PLANT);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lHoa hướng dương " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột quan niệm sai lầm phổ biến là", "§fhoa luôn quay về hướng mặt trời.", "",
				HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantSunflower(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSummer()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addSFlowerBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §e§lHÈ");
		}

		return true;
	}

}
