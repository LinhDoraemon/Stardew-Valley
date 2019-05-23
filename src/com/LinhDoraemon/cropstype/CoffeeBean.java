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

public class CoffeeBean {

	public static String getName = "§6§lHạt cà phê ";

	public static boolean isCoffBlock(Block b) {

		if (CropStorage.COFFEE_BEAN.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeCoffBlock(Block b) {

		if (isCoffBlock(b)) {
			CropStorage.COFFEE_BEAN.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addCoffBlock(Block b) {

		if (isCoffBlock(b) == false) {
			CropManager c = new CropManager(CropsData.COFFEE_BEAN, b);
			c.setMetaData();
		}

	}

	public static void harvestCoff(Block b, Location loc) {
		b.setType(Material.AIR);
		
		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);
		
		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getCoffeeBean());
		
		removeCoffBlock(b);
	}

	public static ItemStack getCoffeeBean() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InV" + "ybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5"
						+ "lY3JhZnQubmV0L3RleHR1cmUvMjExNmI5" + "ZDhkZjM0NmEyNWVkZDA1Zjg0MmU3YTkzND"
						+ "ViZWFmMTZkY2E0MTE4YWJmNWE2OGM3NWJj" + "YWFlMTAifX19");
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§6§lHạt cà phê " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fTrồng vào mùa xuân để thu hoạch cà phê",
				"§fvà bỏ vào thùng ủ để tạo ra cà phê uống", "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}
	
	public static boolean plantCoffeeBean(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);
	
		Block b = loc.getBlock();
		int am = seed.getAmount();
		
		if(DaysAndTimes.isSpring()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);
			
			addCoffBlock(b);
			
			seed.setAmount(am - 1);
		}else {
			p.sendMessage("§c§lGiờ không phải là mùa §a§lXUÂN");
		}
		
		return true;
	}
}
