package com.LinhDoraemon.crafting;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.machenics.Campfire;
import com.LinhDoraemon.machenics.CherryBomb;
import com.LinhDoraemon.machenics.ChestS;
import com.LinhDoraemon.machines.StardewMachines;;

public enum Recipe {

	BEE_HOUSE(StardewMachines.BEE_HOUSE(), new ItemStack[] { StardewItems.WOOD(), StardewItems.WOOD(),
			StardewItems.WOOD(), StardewItems.COAL(), StardewItems.MAPLE_SYRUP(), StardewItems.COAL(),
			StardewItems.IRON_BAR(), StardewItems.IRON_BAR(), StardewItems.IRON_BAR() }), MAYONAISE_MACHINE(
					StardewMachines.MAYONNAISE_MACHINE(),
					new ItemStack[] { StardewItems.WOOD(), StardewItems.WOOD(), StardewItems.WOOD(),
							StardewItems.COPPER_BAR(), StardewItems.EARTH_CRYSTAL(), StardewItems.COPPER_BAR(),
							StardewItems.STONE(), StardewItems.STONE(), StardewItems.STONE() }), CRAB_POT(
									StardewMachines.CRAB_POT(),
									new ItemStack[] { StardewItems.WOOD(), StardewItems.IRON_BAR(), StardewItems.WOOD(),
											StardewItems.IRON_BAR(), StardewItems.WOOD(), StardewItems.IRON_BAR(),
											StardewItems.WOOD(), StardewItems.IRON_BAR(),
											StardewItems.WOOD() }), CHERRY_BOMB(
													CherryBomb.CHERRY_BOMB(),
													new ItemStack[] { null, StardewItems.COPPER_CLUSTER(), null,
															StardewItems.COPPER_CLUSTER(), StardewItems.COAL(),
															StardewItems.COPPER_CLUSTER(), null,
															StardewItems.COPPER_CLUSTER(), null }), WOOD_FENCE(
																	StardewItems.WOOD_FENCE(),
																	new ItemStack[] { null, null, null,
																			StardewItems.WOOD(), StardewItems.SAP(),
																			StardewItems.WOOD(), null, null,
																			null }), BAIT(
																					StardewItems.BAIT(),
																					new ItemStack[] { null, null, null,
																							null,
																							StardewItems.BUG_MEAT(),
																							null, null, null,
																							null }), GATE(
																									StardewItems.GATE(),
																									new ItemStack[] {
																											null, null,
																											null,
																											StardewItems
																													.WOOD(),
																											null,

																											StardewItems
																													.WOOD(),
																											StardewItems
																													.WOOD(),
																											null,
																											StardewItems
																													.WOOD() }), STONE_PATH(
																															StardewItems
																																	.STONE_PATH(),
																															new ItemStack[] {
																																	null,
																																	null,
																																	null,
																																	null,
																																	StardewItems
																																			.STONE(),
																																	null,
																																	null,
																																	null,
																																	null }), WOODEN_PATH(
																																			StardewItems
																																					.WOOD_PATH(),
																																			new ItemStack[] {
																																					null,
																																					null,
																																					null,
																																					null,
																																					StardewItems
																																							.WOOD(),
																																					null,
																																					null,
																																					null,
																																					null }), TORCH(
																																							StardewItems
																																									.TORCH(),
																																							new ItemStack[] {
																																									null,
																																									null,
																																									null,
																																									null,
																																									StardewItems
																																											.SAP(),
																																									null,
																																									null,
																																									StardewItems
																																											.WOOD(),
																																									null }), CHEST(
																																											ChestS.getChest(),
																																											new ItemStack[] {
																																													StardewItems
																																															.WOOD(),
																																													StardewItems
																																															.WOOD(),
																																													StardewItems
																																															.WOOD(),
																																													StardewItems
																																															.WOOD(),
																																													null,
																																													StardewItems
																																															.WOOD(),
																																													StardewItems
																																															.WOOD(),
																																													StardewItems
																																															.WOOD(),
																																													StardewItems
																																															.WOOD() }), WOOD_SIGN(
																																																	StardewItems
																																																			.WOOD_SIGN(),
																																																	new ItemStack[] {
																																																			null,
																																																			null,
																																																			null,
																																																			StardewItems
																																																					.WOOD(),
																																																			StardewItems
																																																					.WOOD(),
																																																			StardewItems
																																																					.WOOD(),
																																																			null,
																																																			null,
																																																			null }), CAMFIRE(
																																																					Campfire.getCamfire(),
																																																					new ItemStack[] {
																																																							null,
																																																							StardewItems
																																																									.FIBER(),
																																																							null,
																																																							null,
																																																							StardewItems
																																																									.WOOD(),
																																																							null,
																																																							null,
																																																							StardewItems
																																																									.STONE(),
																																																							null });

	private ItemStack result;
	private ItemStack[] list;

	Recipe(ItemStack result, ItemStack[] list) {
		this.list = list;
		this.result = result;
	}

	public static List<ItemStack> getAllResults() {
		List<ItemStack> l = new ArrayList<ItemStack>();
		for (Recipe rc : Recipe.values()) {
			l.add(rc.getResult());
		}
		return l;
	}

	public ItemStack[] getIngredients() {
		return list;
	}

	public ItemStack getResult() {
		return result;
	}

	public static Recipe getRecipe(String resultname) {
		for (Recipe rc : Recipe.values()) {
			ItemStack i = rc.getResult();
			if(i.hasItemMeta() && i.getItemMeta().hasDisplayName() && 
					i.getItemMeta().getDisplayName().equalsIgnoreCase(resultname)) {
				return rc;
			}else {
				continue;
			}
		}
		return null;
	}
	
	public static void inalization() {
		ShapedRecipe campfire = new ShapedRecipe(CAMFIRE.getResult());
		campfire.shape(" F ", " W ", " S ");
		campfire.setIngredient('F', StardewItems.FIBER().getData());
		campfire.setIngredient('W', StardewItems.WOOD().getData());
		campfire.setIngredient('S', StardewItems.WOOD().getData());
		Bukkit.addRecipe(campfire);

		ShapedRecipe chest = new ShapedRecipe(CHEST.getResult());
		chest.shape("WWW", "W W", "WWW");
		chest.setIngredient('W', StardewItems.WOOD().getData());
		Bukkit.addRecipe(chest);

		ShapedRecipe sign = new ShapedRecipe(WOOD_SIGN.getResult());
		sign.shape("   ", "WWW", "   ");
		sign.setIngredient('W', StardewItems.WOOD().getData());
		Bukkit.addRecipe(sign);

		ShapedRecipe torch = new ShapedRecipe(TORCH.getResult());
		torch.shape("   ", " S ", " W ");
		torch.setIngredient('W', StardewItems.WOOD().getData());
		torch.setIngredient('S', StardewItems.WOOD().getData());
		Bukkit.addRecipe(torch);

		ShapedRecipe wpath = new ShapedRecipe(WOODEN_PATH.getResult());
		wpath.shape("   ", " W ", "   ");
		wpath.setIngredient('W', StardewItems.WOOD().getData());
		Bukkit.addRecipe(wpath);

		ShapedRecipe spath = new ShapedRecipe(STONE_PATH.getResult());
		spath.shape("   ", " S ", "   ");
		spath.setIngredient('S', StardewItems.WOOD().getData());
		Bukkit.addRecipe(spath);

		ShapedRecipe gate = new ShapedRecipe(GATE.getResult());
		gate.shape("   ", "W W", "W W");
		gate.setIngredient('W', StardewItems.WOOD().getData());
		Bukkit.addRecipe(gate);

		ShapedRecipe bait = new ShapedRecipe(BAIT.getResult());
		bait.shape("   ", " S ", "   ");
		bait.setIngredient('S', Material.ROTTEN_FLESH);
		Bukkit.addRecipe(bait);

		ShapedRecipe wfence = new ShapedRecipe(WOOD_FENCE.getResult());
		wfence.shape("   ", "WSW", "   ");
		wfence.setIngredient('W', StardewItems.WOOD().getData());
		wfence.setIngredient('S', StardewItems.SAP().getData());
		Bukkit.addRecipe(wfence);

		ShapedRecipe cbomb = new ShapedRecipe(CHERRY_BOMB.getResult());
		cbomb.shape(" C ", "CMC", " C ");
		cbomb.setIngredient('C', Material.CLAY_BALL);
		cbomb.setIngredient('M', Material.COAL);
		Bukkit.addRecipe(cbomb);

		ShapedRecipe crabpot = new ShapedRecipe(CRAB_POT.getResult());
		crabpot.shape("WIW", "IWI", "WIW");
		crabpot.setIngredient('W', StardewItems.WOOD().getData());
		crabpot.setIngredient('I', Material.IRON_INGOT);
		Bukkit.addRecipe(crabpot);

		ShapedRecipe mayonaise = new ShapedRecipe(MAYONAISE_MACHINE.getResult());
		mayonaise.shape("WWW", "CEC", "SSS");
		mayonaise.setIngredient('C', StardewItems.COPPER_BAR().getType());
		mayonaise.setIngredient('W', StardewItems.WOOD().getData());
		mayonaise.setIngredient('S', StardewItems.WOOD().getData());
		mayonaise.setIngredient('E', StardewItems.WOOD().getData());
		Bukkit.addRecipe(mayonaise);

		ShapedRecipe beehouse = new ShapedRecipe(BEE_HOUSE.getResult());
		beehouse.shape("WWW", "CMC", "III");
		beehouse.setIngredient('C', StardewItems.COAL().getType());
		beehouse.setIngredient('W', StardewItems.WOOD().getData());
		beehouse.setIngredient('I', Material.IRON_INGOT);
		beehouse.setIngredient('M', StardewItems.WOOD().getData());
		Bukkit.addRecipe(beehouse);

		Bukkit.getConsoleSender().sendMessage("§aREGISTERED CRAFTING RECIPES !");
	}
}
