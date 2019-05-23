package com.LinhDoraemon.crops;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

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

public class FruitStorage implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST)
	public void luutrucaytrongcuanguoichoi(PlayerInteractEvent e) {

		Block soil = e.getClickedBlock();
		ItemStack i = e.getItem();
		Player p = e.getPlayer();

		if (soil == null) {
			return;
		}

		if (i == null) {
			return;
		}

		if (soil.getType() != Material.SOIL) {
			return;
		}

		Location loc = soil.getLocation();
		loc.setY(loc.getBlockY() + 1);

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.BLUE_JAZZ)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				BlueJazz.plantBlueJazz(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
				return;
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.CAULIFLOWER)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Cauliflower.plantCauliflower(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
				return;
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.COFFEE_BEAN)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				CoffeeBean.plantCoffeeBean(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
				return;
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.GARLIC)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Garlic.plantGarlic(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
				return;
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.KALE)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Kale.plantGarlic(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
				return;
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.PARSNIP)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Parsnip.plantParsnip(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
				return;
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.POTATO)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Potato.plantPotato(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
				return;
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.STRAWBERRY)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Strawberry.plantStrawberry(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
				return;
			}
		}

		// TODO SUMMER

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.BLUE_BERRY)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				BlueBerry.plantBlueBerry(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.CORN)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Corn.plantCorn(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.MELON)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Melon.plantMelon(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.POPPY)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Poppy.plantPoppy(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.RED_CABBAGE)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				RedCabbage.plantRedCabbage(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.TOMATO)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Tomato.plantTomato(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.SUNFLOWER)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Sunflower.plantSunflower(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}
		
		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.RADISH)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Radish.plantRadish(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}
		
		//FALL
		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.ARTICHOKE)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Artichoke.plantArtichoke(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}
		
		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.CRANBERRIES)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Cranberries.plantCranberries(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}
		
		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.EGGPLANT)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				EggPlant.plantEggPlant(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.PUMPKIN)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Pumpkin.plantPumpkin(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}
		
		if (i.getItemMeta() != null && i.getItemMeta().getLore() != null
				&& i.getItemMeta().getLore().contains(CropsTag.GRAPE)) {

			if (soil.getType() == Material.SOIL && soil.getData() == 7) {
				Grape.plantGrape(soil, i, p);
				return;
			} else {
				e.getPlayer().sendMessage("§cTưới nước cho đất đã !");
			}
		}
	}

}
