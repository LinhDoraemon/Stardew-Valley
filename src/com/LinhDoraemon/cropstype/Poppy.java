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

public class Poppy {

	public static boolean isPoppyBlock(Block b) {

		if (CropStorage.POPPY.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removePoppyBlock(Block b) {

		if (isPoppyBlock(b)) {
			CropStorage.POPPY.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addPoppyBlock(Block b) {

		if (isPoppyBlock(b) == false) {
			CropManager c = new CropManager(CropsData.POPPY, b);
			c.update();
		}

	}

	public static void harvestPoppy(Block b, Location loc) {
		b.setType(Material.AIR);
		
		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);
		
		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getPoppy());
		
		removePoppyBlock(b);
	}

	public static ItemStack getPoppy() {
		ItemStack item = new ItemStack(Material.RED_ROSE);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§c§lHoa anh túc " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fNgoài là một hoa đầy màu sắc, nó còn ", "§fcó công dụng về ẩm thực và dược liệu",
				"", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantPoppy(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		Block b = loc.getBlock();
		int am = seed.getAmount();

		if (DaysAndTimes.isSummer()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

			addPoppyBlock(b);

			seed.setAmount(am - 1);
		} else {
			p.sendMessage("§c§lGiờ không phải là mùa §e§lHÈ");
		}

		return true;
	}

}
