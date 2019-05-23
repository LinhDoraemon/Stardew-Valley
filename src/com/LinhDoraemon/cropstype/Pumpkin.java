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

public class Pumpkin {

	public static boolean isPumpkinBlock(Block b) {

		if (CropStorage.PUMPKIN.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removePumpkinBlock(Block b) {

		if (isPumpkinBlock(b)) {
			CropStorage.PUMPKIN.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addPumpkinBlock(Block b) {

		if (isPumpkinBlock(b) == false) {
			CropManager c = new CropManager(CropsData.PUMPKIN, b);
			c.update();
		}

	}

	public static void harvestPumpkin(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getPumpkin());

		removePumpkinBlock(b);

	}

	public static ItemStack getPumpkin() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item, CropsData.PUMPKIN.getData());
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§6§lBí ngô " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fMột loại quả yêu thích vào mùa thu, cho","§fhạt giòn và thịt có hương vị tinh tế.",
				"", SimpleItem.isHealth(0.5), SimpleItem.isFood(1.5), "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantPumpkin(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isFall()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addPumpkinBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §6§lTHU");
		}

		return true;
	}
	
}
