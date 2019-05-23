package com.LinhDoraemon.npc;

import java.util.Arrays;
import java.util.List;

import org.bukkit.inventory.ItemStack;

public enum NPC {

	PIERRE(new ItemStack[] {}, new ItemStack[] {});
	
	private List<ItemStack> love_thing;
	private List<ItemStack> hate_thing;
	
	NPC(ItemStack[] love_thing, ItemStack[] hate_thing){
		this.love_thing = Arrays.asList(love_thing);
		this.hate_thing = Arrays.asList(hate_thing);
	}
}
