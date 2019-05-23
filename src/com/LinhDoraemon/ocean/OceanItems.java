package com.LinhDoraemon.ocean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public enum OceanItems {

	TRASH, DRIFED_WOOD, SOGGY_NEWSPAPER, BROKEN_CD, LOBSTER, CRAB, SHRIMP, SNAIL;
	
	public static List<ItemStack> getAll(){
		List<ItemStack> l = new ArrayList<>();
		l.add(getItem(TRASH));
		l.add(getItem(DRIFED_WOOD));
		l.add(getItem(SOGGY_NEWSPAPER));
		l.add(getItem(BROKEN_CD));
		l.add(getItem(LOBSTER));
		l.add(getItem(CRAB));
		l.add(getItem(SHRIMP));
		l.add(getItem(SNAIL));
		return l;
	}
	
	public static ItemStack getItem(OceanItems item) {

		switch (item) {
		case TRASH:
			ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
			
			CSkull.skullWithBase64(i,
					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7" + "InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQ"
							+ "ubmV0L3RleHR1cmUvNWFjOTFhYjI1ODM2ZDEzNDgzOD"
							+ "Y0Y2RkYmQ0MzJkYmIyMmQ0YWMyOTNmMWM5OWZiMjg5M" + "TljZjM5YzMifX19");
			ItemMeta mt = i.getItemMeta();
			mt.setDisplayName("§7§lRác rưởi");
			SimpleItem.addLore(mt, "", "§fĐây là rác.", "", HashTag.TRASH);
			i.setItemMeta(mt);
			return i;
		case DRIFED_WOOD:
			ItemStack stick = new ItemStack(Material.STICK);
			ItemMeta stickmt = stick.getItemMeta();
			stickmt.setDisplayName("§6§lMẩu gỗ trôi dạt");
			SimpleItem.addLore(stickmt, "", "§fMột mẩu gỗ từ biển.", "", HashTag.TRASH);
			stick.setItemMeta(stickmt);
			return stick;
		case SOGGY_NEWSPAPER:

			ItemStack paper = new ItemStack(Material.STICK);
			ItemMeta papermt = paper.getItemMeta();
			papermt.setDisplayName("§7§lGiấy báo ướt sũng");
			SimpleItem.addLore(papermt, "", "§fĐây là rác.", "", HashTag.TRASH);
			paper.setItemMeta(papermt);
			return paper;
		case BROKEN_CD:

			ItemStack cd = new ItemStack(Material.RECORD_11);
			ItemMeta cdmt = cd.getItemMeta();
			cdmt.setDisplayName("§b§lĐĩa CD bị hỏng");
			SimpleItem.addLore(cdmt, "", "§fĐĩa CD quảng cáo về JojaNet 2.0, họ", "§fđã làm cả tỷ cái như thế này.",
					HashTag.TRASH);
			cd.setItemMeta(cdmt);
			return cd;
		case LOBSTER:
			ItemStack tomhum = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
			
			CSkull.skullWithBase64(tomhum,
					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI" + "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3Jh"
							+ "ZnQubmV0L3RleHR1cmUvNTNkZjYzMTNlM" + "TUzNzNmMmM2NDIzMDJlNDZmYzdjOGFiZW"
							+ "MyMTkwNGI3YzYyZTM5ZGQ2NTExMTI1OWV" + "kYiJ9fX0=");
			ItemMeta tomhummt = tomhum.getItemMeta();
			tomhummt.setDisplayName("§c§lTôm hùm");
			SimpleItem.addLore(tomhummt, "", "§fMột loài giáp xác lớn sống ở", "§fđại dương với cái đuôi mạnh mẽ.", "",
					HashTag.TYPE_FISH);
			tomhum.setItemMeta(tomhummt);
			return tomhum;
		case CRAB:
			ItemStack clam = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
			
			CSkull.skullWithBase64(clam,
					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7I" + "nVybCI6Imh0dHA6Ly90ZXh0dXJlc" + "y5taW5lY3JhZnQubmV0L3RleHR1cm"
							+ "UvYWZiODEyYWU5Zjg5MzI2YWUyNGY" + "4NzJjODFhYjIzMjliYTYzYmRiYzk2"
							+ "MjBmMGIxOWRhMmFjODYxNTQ2OWUyI" + "n19fQ==");
			
			ItemMeta clammt = clam.getItemMeta();
			clammt.setDisplayName("§4§lCua biển");
			SimpleItem.addLore(clammt, "", "§fMột loài động vật biển với", "§fhai chiếc càng mạnh mẽ.", "",
					HashTag.TYPE_FISH);
			clam.setItemMeta(clammt);
			return clam;
		case SHRIMP:
			ItemStack shrimp = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
			
			CSkull.skullWithBase64(shrimp,
					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVy" + "bCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3"
							+ "RleHR1cmUvNzMxNGQ0NjY0OTVmNDZj" + "ZmU5MDMxNTFhMzUzZDIyY2NkZjVmYTE4Y"
							+ "TY0ZmI2NTgzMTJhZmZiMGU3ZTg3YTMwIn19fQ==");
			ItemMeta shrmt = shrimp.getItemMeta();
			shrmt.setDisplayName("§c§lTôm");
			SimpleItem.addLore(shrmt, "", "§fMột loài động sống sâu dưới biển, thịt", "§fvô cùng ngon và đậm đà.", "",
					HashTag.TYPE_FISH);
			shrimp.setItemMeta(shrmt);
			return shrimp;
		case SNAIL:
			ItemStack snail = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
			
			CSkull.skullWithBase64(snail,
					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7" + "InVybCI6Imh0dHA6Ly90ZXh0dXJ" + "lcy5taW5lY3JhZnQubmV0L3RleH"
							+ "R1cmUvMTVlMmU1OWJhNjc4YWRlMGE" + "4MGIxZDQyYTIxMmI3Y2Y0ZWM5Nj"
							+ "NiNDk0ZjhlYWVhYjlmNjQzZTJjY" + "WFhOTEifX19");
			ItemMeta snmt = snail.getItemMeta();
			snmt.setDisplayName("§3§lỐc sên");
			SimpleItem.addLore(snmt, "", "§fMột loài động vật biển với", "§fhai chiếc càng mạnh mẽ.", "",
					HashTag.TYPE_FISH);
			snail.setItemMeta(snmt);
			return snail;
		default:
			return null;
		}

	}
	
	public static ItemStack getRandomItem() {
		
		Random rand = new Random();
		int so = rand.nextInt(OceanItems.values().length) + 1;
		
		switch (so) {
		case 1:
			
			return getItem(BROKEN_CD);
		case 2:
			
			return getItem(OceanItems.CRAB);
		case 3:
			
			return getItem(OceanItems.DRIFED_WOOD);
		case 4:
			
			return getItem(OceanItems.LOBSTER);
		case 5:
			
			return getItem(OceanItems.SHRIMP);
		case 6:	
		
			return getItem(OceanItems.SNAIL);
		case 7:
		
			return getItem(OceanItems.SOGGY_NEWSPAPER);
		default:

			return getItem(OceanItems.TRASH);
		}
		
	}

}
