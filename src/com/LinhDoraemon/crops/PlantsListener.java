package com.LinhDoraemon.crops;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.world.StructureGrowEvent;

import com.LinhDoraemon.cropstype.Artichoke;
import com.LinhDoraemon.cropstype.BlueBerry;
import com.LinhDoraemon.cropstype.BlueJazz;
import com.LinhDoraemon.cropstype.Cauliflower;
import com.LinhDoraemon.cropstype.CoffeeBean;
import com.LinhDoraemon.cropstype.Corn;
import com.LinhDoraemon.cropstype.Cranberries;
import com.LinhDoraemon.cropstype.EggPlant;
import com.LinhDoraemon.cropstype.Garlic;
import com.LinhDoraemon.cropstype.Grape;
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

public class PlantsListener implements Listener {

	@EventHandler
	public void caylonlenthanhchin(StructureGrowEvent e) {

		Location loc = e.getLocation();
		Block b = loc.getBlock();

		if (b == null) {
			return;
		}

		if (BlueBerry.isBlBerryBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.BLUE_BERRY, b);
			return;
		}

		if (BlueJazz.isJazzBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.BLUE_JAZZ, b);
			return;
		}

		if (Cauliflower.isCauliBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.CAULIFLOWER, b);
			return;
		}

		if (CoffeeBean.isCoffBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.COFFEE_BEAN, b);
			return;
		}

		if (Corn.isCornBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.CORN, b);
			return;
		}

		if (Garlic.isGarlBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.GARLIC, b);
			return;
		}

		if (Kale.isKaleBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.KALE, b);
			return;
		}

		if (Melon.isMelonBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.MELON, b);
			return;
		}

		if (Parsnip.isParsBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.PARSNIP, b);
			return;
		}

		if (Poppy.isPoppyBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.POPPY, b);
			return;
		}

		if (Potato.isPotaBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.POTATO, b);
			return;
		}

		if (Radish.isRadishBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.RADISH, b);
			return;
		}

		if (RedCabbage.isRCabbageBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.RED_CABBAGE, b);
			return;
		}

		if (Strawberry.isStraBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.STRAWBERRY, b);
			return;
		}

		if (Sunflower.isSFlowerBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.SUNFLOWER, b);
			return;
		}

		if (Tomato.isTomatoBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.TOMATO, b);
			return;
		}

		if (Artichoke.isArtichokeBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.ARTICHOKE, b);
			return;
		}

		if (Cranberries.isCranberriesBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.CRANBERRIES, b);
			return;
		}

		if (EggPlant.isEggPlantBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.EGGPLANT, b);
			return;
		}

		if (Pumpkin.isPumpkinBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.PUMPKIN, b);
			return;
		}

		if (Grape.isGrapeBlock(b)) {
			e.setCancelled(true);
			CropsData.setRipe(CropsData.GRAPE, b);
			return;
		}

		return;

	}

	@EventHandler
	public void nguoichoithuhoachcaicay(PlayerInteractEvent e) {

		Block b = e.getClickedBlock();

		if (b == null) {
			return;
		}

		if (b.getType() != Material.LEAVES) {
			return;
		}

		Location loc = b.getRelative(BlockFace.UP).getLocation();

		if (BlueBerry.isBlBerryBlock(b)) {
			BlueBerry.harvestBlBerry(b, loc);
			return;
		}

		if (BlueJazz.isJazzBlock(b)) {
			BlueJazz.harvestJazz(b, loc);
			return;
		}

		if (Cauliflower.isCauliBlock(b)) {
			Cauliflower.harvestCauli(b, loc);
			return;
		}

		if (CoffeeBean.isCoffBlock(b)) {
			CoffeeBean.harvestCoff(b, loc);
			return;
		}

		if (Corn.isCornBlock(b)) {
			Corn.harvestCorn(b, loc);
			return;
		}

		if (Garlic.isGarlBlock(b)) {
			Garlic.harvestGarl(b, loc);
			return;
		}

		if (Kale.isKaleBlock(b)) {
			Kale.harvestKale(b, loc);
			return;
		}

		if (Melon.isMelonBlock(b)) {
			Melon.harvestMelon(b, loc);
			return;
		}

		if (Parsnip.isParsBlock(b)) {
			Parsnip.harvestPars(b, loc);
			return;
		}

		if (Poppy.isPoppyBlock(b)) {
			Poppy.harvestPoppy(b, loc);
			return;
		}

		if (Potato.isPotaBlock(b)) {
			Potato.harvestPota(b, loc);
			return;
		}

		if (Radish.isRadishBlock(b)) {
			Radish.harvestRadish(b, loc);
			return;
		}

		if (RedCabbage.isRCabbageBlock(b)) {
			RedCabbage.harvestRCabbage(b, loc);
			return;
		}

		if (Strawberry.isStraBlock(b)) {
			Strawberry.harvestStra(b, loc);
			return;
		}

		if (Sunflower.isSFlowerBlock(b)) {
			Sunflower.harvestSFlower(b, loc);
			return;
		}

		if (Tomato.isTomatoBlock(b)) {
			Tomato.harvestTomato(b, loc);
			return;
		}

		if (Artichoke.isArtichokeBlock(b)) {
			Artichoke.harvestArtichoke(b, loc);
			return;
		}

		if (Cranberries.isCranberriesBlock(b)) {
			Cranberries.harvestCranberries(b, loc);
			return;
		}

		if (EggPlant.isEggPlantBlock(b)) {
			EggPlant.harvestEggPlant(b, loc);
			return;
		}

		if (Pumpkin.isPumpkinBlock(b)) {
			Pumpkin.harvestPumpkin(b, loc);
			return;
		}

		if (Grape.isGrapeBlock(b)) {
			Grape.harvestGrape(b, loc);
			return;
		}

	}

}
