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

public class BlueJazz {

	public static String getName = "§b§lBông cẩm tú cầu xanh ";

	public static boolean isJazzBlock(Block b) {

		if (CropStorage.BLUE_JAZZ.contains(new CropsMeta(b.getLocation()).getMetaData())) {
			return true;
		} else {
			return false;
		}

	}

	public static void removeJazzBlock(Block b) {

		if (isJazzBlock(b)) {
			CropStorage.BLUE_JAZZ.remove(new CropsMeta(b.getLocation()).getMetaData());
		}

	}

	public static void addJazzBlock(Block b) {

		if (isJazzBlock(b) == false) {
			CropManager c = new CropManager(CropsData.BLUE_JAZZ, b);
			c.setMetaData();
		}

	}

	public static void harvestJazz(Block b, Location loc) {
		b.setType(Material.AIR);
		
		Block up = b.getRelative(BlockFace.UP);
		up.setType(Material.AIR);
		
		Block soil = b.getRelative(BlockFace.DOWN);
		soil.setType(Material.DIRT);
		
		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);

		b.getWorld().dropItem(loc, getBlueJazz());
		
		removeJazzBlock(b);
	}

	public static ItemStack getBlueJazz() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6"
						+ "Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQyM2"
						+ "IxMTllM2FlMGNmODhiYTg4ZThmOTRkNTM1N2MyODYyNDk4NTBjMWQ1MmQz"
						+ "MjU1ZjNmZjE0OTVhM2QzYyJ9fX0=");
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§b§lBông cẩm tú cầu xanh " + HashTag.addQuality());

		SimpleItem.addLore(mt, "", "Một loài hoa hình cầu, thu hút nhiều", "loài ong bướm khác nhau", "",
				HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static boolean plantBlueJazz(Block soil, ItemStack seed, Player p) {
		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);
	
		Block b = loc.getBlock();
		int am = seed.getAmount();
		
		if(DaysAndTimes.isSpring()) {
			b.setType(Material.SAPLING);
			b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);
			
			addJazzBlock(b);
			
			seed.setAmount(am - 1);
		}else {
			p.sendMessage("§c§lGiờ không phải là mùa §a§lXUÂN");
		}
		
		return true;
	}
	
}
