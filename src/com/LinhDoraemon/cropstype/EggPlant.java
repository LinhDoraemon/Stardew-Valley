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

public class EggPlant {

	public static boolean isEggPlantBlock(Block b) {
		if (CropStorage.EGGPLANT.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}
	}

	public static void removeEggPlantBlock(Block b) {

		if (isEggPlantBlock(b)) {
			CropStorage.EGGPLANT.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addEggPlantBlock(Block b) {

		if (isEggPlantBlock(b) == false) {
			CropManager c = new CropManager(CropsData.EGGPLANT, b);
			c.update();
		}

	}

	public static void harvestEggPlant(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getEggPlant());

		removeEggPlantBlock(b);
	}

	public static ItemStack getEggPlant() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item, CropsData.EGGPLANT.getData());
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§5§lCà tím " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fMột họ hàng của cà chua", "§fRất ngon khi xào hay hầm.", "",
				SimpleItem.isHealth(0.5), SimpleItem.isFood(1.5), "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantEggPlant(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isFall()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addEggPlantBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §6§lTHU");
		}

		return true;
	}

}
