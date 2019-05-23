package com.LinhDoraemon.KitPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.SpecialItem.StardewSeeds;
import com.LinhDoraemon.machenics.WateringCan;

public class StarterPack {

	static HashMap<Player, Inventory> inventories = new HashMap<Player, Inventory>();
	static List<String> data = new ArrayList<>();
	
	static Inventory starterPack(Player player) {
		Inventory i = inventories.get(player);

		if (i == null) {
			i = Bukkit.createInventory(null, InventoryType.CHEST, "§0§lＳＴＡＲＴＥＲ╵Ｓ ＰＡＣＫ");
			i.clear();
			i.addItem(StardewItems.STARTER_HOE());
			i.addItem(StardewItems.STARTER_AXE());
			i.addItem(StardewItems.STARTER_PICKAXE());
			i.addItem(StardewItems.STARTER_FISHING_ROD());
			i.addItem(StardewItems.STARTER_SCYTHE());
			i.addItem(WateringCan.getWateringCan());
			i.addItem(StardewItems.SHIPPING_BIN());

			i.addItem(StardewSeeds.PARSNIP_SEED(), StardewSeeds.PARSNIP_SEED(), StardewSeeds.PARSNIP_SEED(),
					StardewSeeds.PARSNIP_SEED(), StardewSeeds.PARSNIP_SEED());
			inventories.put(player, i);
		}
		return i;
	}

	public static void openStarterPack(Player p) {
		p.openInventory(starterPack(p));
		data.add(p.getName());
	}

}
