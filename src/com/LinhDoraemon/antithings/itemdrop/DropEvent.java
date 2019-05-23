package com.LinhDoraemon.antithings.itemdrop;

import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class DropEvent  implements Listener {

	@EventHandler
	public void ITEM_DROP(ItemSpawnEvent e) {
		Item item = e.getEntity();
		
		if(item == null) {
			return;
		}
		
		ItemStack i = item.getItemStack();
		
		if(i.hasItemMeta() || i.getItemMeta().hasDisplayName()) {
			return;
		}
		
		if(ItemDrop.getValues().contains(i.getType().toString())) {
			item.remove();
		}
	}
	
}
