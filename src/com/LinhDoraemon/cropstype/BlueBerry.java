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

public class BlueBerry {

	public static String getName = "§9§lQuả mọng xanh";

	public static boolean isBlBerryBlock(Block b) {

		if (CropStorage.BLUE_BERRY.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeBlBerryBlock(Block b) {

		if (isBlBerryBlock(b)) {
			CropStorage.BLUE_BERRY.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addBlBerryBlock(Block b) {

		if (isBlBerryBlock(b) == false) {
			CropManager c = new CropManager(CropsData.BLUE_BERRY, b);
			c.setMetaData();
		}

	}

	public static void harvestBlBerry(Block b, Location loc) {
		b.setType(Material.AIR);
		
		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);
		
		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);
		
		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getBlueBerry());
		b.getWorld().dropItem(loc, getBlueBerry());
		
		removeBlBerryBlock(b);
		
	}
	
	public static ItemStack getBlueBerry() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6I" + "mh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQub"
				+ "mV0L3RleHR1cmUvMWIxODcwNGFhMGM5MmFi" + "N2YzMDY1YjNlMzg0OTZkZDFjZDQyZjkzYj"
				+ "ExODNhM2ZiNGYyNmI0ZThkOTk5YWUifX19"
				);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§9§lQuả mọng xanh " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fMột loại quả mọng phổ biến được cho", "§flà có nhiều lợi ích sức khỏe.", "",
				SimpleItem.isHealth(0.5), SimpleItem.isFood(1.5), "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}
	
	public static boolean plantBlueBerry(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);
	
		Block b = loc.getBlock();
		int am = seed.getAmount();
		
		if(DaysAndTimes.isSummer()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);
			
			addBlBerryBlock(b);
			
			seed.setAmount(am - 1);
		}else {
			p.sendMessage("§c§lGiờ không phải là mùa §e§lHÈ");
		}
		
		return true;
	}
	
}
