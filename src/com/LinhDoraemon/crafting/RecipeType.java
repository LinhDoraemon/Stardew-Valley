package com.LinhDoraemon.crafting;

import java.util.Arrays;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.cropstype.Pumpkin;
import com.LinhDoraemon.machenics.Campfire;
import com.LinhDoraemon.machenics.CherryBomb;
import com.LinhDoraemon.machenics.ChestS;
import com.LinhDoraemon.machines.StardewMachines;

public enum RecipeType {

	WOOD_SIGN(new Crafts[] {new Crafts(StardewItems.WOOD(), 25)}, StardewItems.WOOD_SIGN()),
	CHEST(new Crafts[] {new Crafts(StardewItems.WOOD(), 50)}, ChestS.getChest()),
	TAPPER(new Crafts[] {new Crafts(StardewItems.WOOD(), 40), new Crafts(StardewItems.COPPER_BAR(), 2)}, StardewMachines.TAPPER()),
	SEED_MAKER(new Crafts[] {new Crafts(StardewItems.WOOD(), 25), new Crafts(StardewItems.GOLD_BAR(), 1), new Crafts(StardewItems.COAL(), 10)}, StardewMachines.SEED_MAKER()),
	FURNACE(new Crafts[] {new Crafts(StardewItems.COPPER_CLUSTER(), 20), new Crafts(StardewItems.STONE(), 25)}, StardewItems.FURNACE()),
	JACK_O_LANTERN(new Crafts[] {new Crafts(Pumpkin.getPumpkin(), 1), new Crafts(StardewItems.TORCH(), 1)}, StardewItems.JACK_O_LANTERN()),
	CAMPFIRE(new Crafts[] {new Crafts(StardewItems.WOOD(), 10), new Crafts(StardewItems.STONE(), 10), new Crafts(StardewItems.FIBER(), 10)}, Campfire.getCamfire()),
	TORCH(new Crafts[] {new Crafts(StardewItems.WOOD(), 1), new Crafts(StardewItems.SAP(), 2)}, StardewItems.TORCH()),
	CRAB_POT(new Crafts[] {new Crafts(StardewItems.WOOD(), 40), new Crafts(StardewItems.IRON_BAR(), 3)}, StardewMachines.CRAB_POT()),
	BAIT(new Crafts[] {new Crafts(StardewItems.BUG_MEAT(), 1)}, StardewItems.BAIT()),
	STONE_PATH(new Crafts[] {new Crafts(StardewItems.STONE(), 1)}, StardewItems.STONE_PATH()),
	WOOD_PATH(new Crafts[] {new Crafts(StardewItems.WOOD(), 1)}, StardewItems.WOOD_PATH()),
	OIL_MAKER(new Crafts[] {new Crafts(StardewItems.SLIME(), 50), new Crafts(StardewItems.HARDWOOD(), 20), new Crafts(StardewItems.GOLD_BAR(), 1)}, StardewMachines.OIL_MAKER()),
	KEG(new Crafts[] {new Crafts(StardewItems.WOOD(), 30), new Crafts(StardewItems.COPPER_BAR(), 1), new Crafts(StardewItems.IRON_BAR(), 1), new Crafts(StardewItems.OAK_RESIN(), 1)}, StardewMachines.KEG()),
	LOOM(new Crafts[] {new Crafts(StardewItems.WOOD(), 60), new Crafts(StardewItems.FIBER(), 30), new Crafts(StardewItems.PINE_TAR(), 1)}, StardewMachines.LOOM()),
	CHEESE_PRESS(new Crafts[] {new Crafts(StardewItems.WOOD(), 45), new Crafts(StardewItems.STONE(), 45), new Crafts(StardewItems.HARDWOOD(), 10), new Crafts(StardewItems.COPPER_BAR(), 1)}, StardewMachines.CHEESE_PRESS()),
	PRESERVES_JAR(new Crafts[] {new Crafts(StardewItems.WOOD(), 50), new Crafts(StardewItems.STONE(), 40), new Crafts(StardewItems.COAL(), 8)}, StardewMachines.PRESERVES_JAR()),
	BEE_HOUSE(new Crafts[] {new Crafts(StardewItems.WOOD(), 40), new Crafts(StardewItems.COAL(), 8), new Crafts(StardewItems.IRON_BAR(), 1), new Crafts(StardewItems.MAPLE_SYRUP(), 1)}, StardewMachines.BEE_HOUSE()),
	MAYONAISE_MACHINE(new Crafts[] {new Crafts(StardewItems.WOOD(), 15), new Crafts(StardewItems.STONE(), 15), new Crafts(StardewItems.EARTH_CRYSTAL(), 1), new Crafts(StardewItems.COPPER_BAR(), 1)}, StardewMachines.MAYONNAISE_MACHINE()),
	WOOD_FENCE(new Crafts[] {new Crafts(StardewItems.WOOD(), 2)}, StardewItems.WOOD_FENCE()),
	GATE(new Crafts[] {new Crafts(StardewItems.WOOD(), 10)}, StardewItems.GATE()),
	CHERRY_BOMB(new Crafts[] {new Crafts(StardewItems.COPPER_CLUSTER(), 4), new Crafts(StardewItems.COAL(), 1)}, CherryBomb.CHERRY_BOMB());
	
	private List<Crafts> ingre;
	private ItemStack result;
	
	RecipeType(Crafts[] ingre, ItemStack result){
		this.ingre = Arrays.asList(ingre);
		this.result = result;
	}
	
	public List<Crafts> getIngredients(){
		return this.ingre;
	}
	
	public ItemStack getResult() {
		return this.result;
	}
	
	public boolean hasEnough(Player p) {
		for(Crafts c : getIngredients()) {
			if(p.getInventory().containsAtLeast(c.getItemStack(), c.getAmount())) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public void removeItems(Player p) {
		for(Crafts c : getIngredients()) {
			for (int so = 0; so < c.getAmount(); so++) {
			p.getInventory().removeItem(c.getItemStack());
			}
		}
	}
	
	public static RecipeType getByResultName(ItemStack item) {
		if(item.hasItemMeta() == false || item.getItemMeta().hasDisplayName() == false) {
			return null;
		}
		
		String name = item.getItemMeta().getDisplayName();
		
		for(RecipeType c : RecipeType.values()) {
			if(c.getResult().hasItemMeta() && c.getResult().getItemMeta().hasDisplayName()
					&& c.getResult().getItemMeta().getDisplayName().equalsIgnoreCase(name)) {
				return c;
			}else {
				continue;
			}
		}
		
		return null;
	}
}
