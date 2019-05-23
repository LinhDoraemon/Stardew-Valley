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

public class Melon {

	public static String getName = "§d§lDưa hấu ";

	public static boolean isMelonBlock(Block b) {

		if (CropStorage.MELON.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeMelonBlock(Block b) {

		if (isMelonBlock(b)) {
			CropStorage.MELON.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addMelonBlock(Block b) {

		if (isMelonBlock(b) == false) {
			CropManager c = new CropManager(CropsData.MELON, b);
			c.update();
		}

	}

	public static void harvestMelon(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getMelon());
	}

	public static ItemStack getMelon() {
		ItemStack item = new ItemStack(Material.MELON);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§d§lDưa hấu " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fMột loại hoa quả mát mẻ và ngọt", "§fngào vào mùa hè", "", SimpleItem.isHealth(1),
				SimpleItem.isFood(1.5), "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantMelon(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSummer()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addMelonBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §e§lHÈ");
		}

		return true;
	}

}
