package com.LinhDoraemon.mining;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.inventory.ItemStack;

public class PreSmelt implements Listener {

	@EventHandler
	public void CUSTOM_FURNACE_LISTENER(FurnaceSmeltEvent e) {

		if(e.getSource().hasItemMeta() == false || e.getSource().getItemMeta().hasDisplayName() == false) {
			e.setCancelled(true);
			return;
		}
		
		if (SmeltRecipe.getAllSources().contains(e.getSource().getItemMeta().getDisplayName()) == false) {
			e.setCancelled(true);
			e.setResult(new ItemStack(Material.AIR));
			return;
		}
	}

	private boolean itemstacksSim(ItemStack i1, ItemStack i2) {
		if (i1.getType() == i2.getType())
			if (i1.getDurability() == i2.getDurability())
				if (i1.hasItemMeta() && i2.hasItemMeta()) {
					if ((!i1.getItemMeta().hasDisplayName() && !i2.getItemMeta().hasDisplayName())
							|| (i1.getItemMeta().hasDisplayName() && i2.getItemMeta().hasDisplayName()
									&& i1.getItemMeta().getDisplayName().equals(i2.getItemMeta().getDisplayName())))
						if ((!i1.getItemMeta().hasLore() && !i2.getItemMeta().hasLore())
								|| (i1.getItemMeta().hasLore() && i2.getItemMeta().hasLore()
										&& i1.getItemMeta().getLore().equals(i2.getItemMeta().getLore())))
							return true;
				} else if (!(i1.hasItemMeta()) && !(i2.hasItemMeta())) {
					return true;
				}
		return false;
	}

}
