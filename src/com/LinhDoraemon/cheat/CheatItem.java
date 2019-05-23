package com.LinhDoraemon.cheat;

import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.Footwear;
import com.LinhDoraemon.SpecialItem.StardewFruits;
import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.SpecialItem.StardewSeeds;
import com.LinhDoraemon.cropstype.Artichoke;
import com.LinhDoraemon.cropstype.BlueBerry;
import com.LinhDoraemon.cropstype.BlueJazz;
import com.LinhDoraemon.cropstype.Cauliflower;
import com.LinhDoraemon.cropstype.Corn;
import com.LinhDoraemon.cropstype.Cranberries;
import com.LinhDoraemon.cropstype.EggPlant;
import com.LinhDoraemon.cropstype.Garlic;
import com.LinhDoraemon.cropstype.Kale;
import com.LinhDoraemon.cropstype.Melon;
import com.LinhDoraemon.cropstype.Parsnip;
import com.LinhDoraemon.cropstype.Poppy;
import com.LinhDoraemon.cropstype.Potato;
import com.LinhDoraemon.cropstype.Pumpkin;
import com.LinhDoraemon.cropstype.Radish;
import com.LinhDoraemon.cropstype.RedCabbage;
import com.LinhDoraemon.cropstype.Strawberry;
import com.LinhDoraemon.cropstype.Sunflower;
import com.LinhDoraemon.cropstype.Tomato;
import com.LinhDoraemon.machenics.Campfire;
import com.LinhDoraemon.machenics.CherryBomb;
import com.LinhDoraemon.machenics.ChestS;
import com.LinhDoraemon.machenics.WateringCan;
import com.LinhDoraemon.machines.StardewMachines;
import com.LinhDoraemon.television.OpenTVListener;

public class CheatItem {

	public static ItemStack[] PAGE_1 = { StardewItems.ACORN(), StardewItems.AMETHYST(), StardewItems.AQUAMARINE(),
			StardewItems.BAIT(), StardewItems.BEER(), StardewItems.BUG_MEAT(), StardewItems.CAVE_CARROT(),
			StardewItems.CLAM(), StardewItems.COAL(), StardewItems.COFFEE(), StardewItems.COMMON_MUSHROOM(),
			StardewItems.COPPER_CLUSTER(), StardewItems.COPPER_BAR(), StardewItems.CORAL(), StardewItems.CRAB_POT(),
			StardewItems.DAFFODIL(), StardewItems.DELUXE_SPEED_GROW(), StardewItems.DIAMOND(),
			StardewItems.EARTH_CRYSTAL(), StardewItems.EMERALD(), StardewItems.FLOUR(), StardewItems.FURNACE(),
			StardewItems.GATE(), StardewItems.GOLD_BAR(), StardewItems.GOLD_CLUSTER(), StardewItems.GRAPE(),
			StardewItems.GRASS_PATH(), StardewItems.HARDWOOD(), StardewItems.HAZELNUT(), StardewItems.HOLLY(),
			StardewItems.HONEY(), StardewItems.IRIDIUM_CLUSTER(), StardewItems.IRIDIUM_BAR(), StardewItems.JAM(),
			StardewItems.IRON_BAR(), StardewItems.IRON_CLUSTER(), StardewItems.JUICE(), StardewItems.LEEK(),
			StardewItems.MAPLE_SYRUP(), StardewItems.MAYONNAISE(), StardewItems.MILK_CHEESE(), StardewItems.OAK_RESIN(),
			StardewItems.OIL(), StardewItems.OMNI_ORE(), StardewItems.PICKLES(), StardewItems.PINE_TAR(),
			StardewItems.PUPPER_FISH(), StardewItems.PURPLE_MUSHROOM(), StardewItems.QUARTZ(),
			StardewItems.RED_MUSHROOM(), StardewItems.RICE(), StardewItems.RUBY(), };

	public static ItemStack[] PAGE_2 = { StardewItems.SALMONBERRY(), StardewItems.SLIME(), StardewItems.SOLAR_ESSENCE(),
			StardewItems.SPICE_BERRY(), StardewItems.SPRING_ONION(), StardewItems.STAIRCASE(), StardewItems.SWEET_PEA(),
			StardewItems.TOPAZ(), StardewItems.VOID_ESSENCE(), StardewItems.WILD_HORSERADISH(), StardewItems.WINE(),
			StardewItems.STARTER_SCYTHE(), OpenTVListener.getTelevision(), Campfire.getCamfire(), ChestS.getChest(),
			CherryBomb.CHERRY_BOMB(), WateringCan.getWateringCan(), Footwear.COMBAT_BOOT(), Footwear.DARK_BOOT(),
			Footwear.GENIE_BOOT(), Footwear.LEATHER_BOOT(), Footwear.RUBBER_BOOT(), Footwear.SNEAKERS(),
			Footwear.SPACE_BOOT(), Footwear.THERMAL_BOOT(), Footwear.WORK_BOOT(), StardewMachines.BEE_HOUSE(),
			StardewMachines.CHEESE_PRESS(), StardewMachines.CRAB_POT(), StardewMachines.KEG(), StardewMachines.LOOM(),
			StardewMachines.MAYONNAISE_MACHINE(), StardewMachines.OIL_MAKER(), StardewMachines.PRESERVES_JAR(),
			StardewMachines.SEED_MAKER(), StardewMachines.TAPPER(), StardewSeeds.ATICHOKE_SEED(),
			StardewSeeds.BLUE_JAZZ_SEED(), StardewSeeds.BLUEBERRY_SEED(), StardewSeeds.CAULIFLOWER_SEED(),
			StardewSeeds.COFFEE_SEED(), StardewSeeds.CORN_SEED(), StardewSeeds.CRANBERRIES_SEED(),
			StardewSeeds.EGGPLANT_SEED(), StardewSeeds.GARLIC_SEED(), StardewSeeds.KALE_SEED(),
			StardewSeeds.MELON_SEED(), StardewSeeds.PARSNIP_SEED(), StardewSeeds.POPPY_SEED(),
			StardewSeeds.POTATO_SEED(), StardewSeeds.RADISH_SEED(), StardewSeeds.RED_CABBAGE_SEED(), };

	public static ItemStack[] PAGE_3 = { StardewSeeds.STRAWBERRY_SEED(), StardewSeeds.SUNFLOWER_SEED(),
			StardewSeeds.TOMATO_SEED(), StardewSeeds.PUMPKIN_SEED(), Artichoke.getArtichoke(), BlueBerry.getBlueBerry(),
			BlueJazz.getBlueJazz(), Cauliflower.getCauliflower(), Corn.getCorn(), Cranberries.getCranberries(),
			EggPlant.getEggPlant(), Garlic.getGarlic(), Kale.getKale(), Melon.getMelon(), Parsnip.getParsnip(),
			Poppy.getPoppy(), Potato.getPotato(), Radish.getRadish(), RedCabbage.getRedCabbage(),
			Strawberry.getStrawberry(), Sunflower.getSunflower(), Tomato.getTomato(), Pumpkin.getPumpkin(),
			StardewFruits.APPLE(), StardewFruits.APPLE_SEED(), StardewFruits.CHERRY(), StardewFruits.CHERRY_SEED(),
			StardewFruits.ORANGE(), StardewFruits.ORANGE_SEED(), StardewFruits.PEACH(), StardewFruits.PEACH_SEED(),
			StardewFruits.POMEGRANATE(), StardewFruits.POMEGRANATE_SEED(), StardewItems.BED(),
			StardewItems.SHIPPING_BIN() };

}
