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

public class Cauliflower {

	public static String getName = "§f§lSúp lơ trắng ";

	public static boolean isCauliBlock(Block b) {

		if (CropStorage.CAULIFLOWER.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeCauliBlock(Block b) {

		if (isCauliBlock(b)) {
			CropStorage.CAULIFLOWER.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addCauliBlock(Block b) {

		if (isCauliBlock(b) == false) {
			CropManager c = new CropManager(CropsData.CAULIFLOWER, b);
			c.setMetaData();
		}

	}

	public static void harvestCauli(Block b, Location loc) {
		b.setType(Material.AIR);

		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);

		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);

		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getCauliflower());
	}

	public static ItemStack getCauliflower() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp" + "7InVybCI6Imh0dHA6Ly90ZXh0dXJl" + "cy5taW5lY3JhZnQubmV0L3RleHR1cmU"
						+ "vNjE2NGNjNzYwODE1OTlhMjBhNjg5NmEzOD" + "E4MzIyYTBjZGMwODA2OWZmOTYwYmJkNzlmZj"
						+ "U0ZmM0NWUzNWVlNiJ9fX0=");
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§f§lSúp lơ trắng " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "§fRất có giá trị nhưng mọc lâu. Mặc dù có màu", "§fkhông đẹp nhưng có đủ vitamin",
				"", SimpleItem.isHealth(3.5), SimpleItem.isFood(1.5), "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}
	
	public static boolean plantCauliflower(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);
	
		Block b = loc.getBlock();
		int am = seed.getAmount();
		
		if(DaysAndTimes.isSpring()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);
			
			addCauliBlock(b);
			
			seed.setAmount(am - 1);
		}else {
			p.sendMessage("§c§lGiờ không phải là mùa §a§lXUÂN");
		}
		
		return true;
	}

}
