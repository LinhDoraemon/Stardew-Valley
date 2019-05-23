package com.LinhDoraemon.antithings.itemdrop;

import java.util.ArrayList;
import java.util.List;

public enum ItemDrop{

	DOUBLE_PLANT,
	RED_ROSE,
	SUGAR_CANE,
	SAPLING,
	APLLE,
	YELLOW_FLOWER,
	MELON,
	PUMPKIN,
	SEEDS,
	BROWN_MUSHROOM,
	RED_MUSHROOM,
	FLINT,
	CLAY,
	STAINED_CLAY;
	
	public static List<String> getValues(){
		List<String> l = new ArrayList<>();
		for(ItemDrop i : ItemDrop.values()) {
			l.add(i.toString());
		}
		return l;
	}
	
	
	
}
