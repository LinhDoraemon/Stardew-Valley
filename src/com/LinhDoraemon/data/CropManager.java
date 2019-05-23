package com.LinhDoraemon.data;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.metadata.FixedMetadataValue;

import com.LinhDoraemon.crops.Crops;
import com.LinhDoraemon.crops.CropsData;
import com.LinhDoraemon.crops.CropsMeta;

public class CropManager {

	private CropsData type;
	private int current_state;
	private Block block;

	public CropManager(CropsData type, Block b) {
		this.block = b;
		this.type = type;
	}

	public CropManager(Block b) {
		
	}
	
	private boolean hasMetaData() {
		Block b = block;
		if(b.hasMetadata("" + 1) || b.hasMetadata("" + 2) || b.hasMetadata("" + 3) || b.hasMetadata("" + 4)
				|| b.hasMetadata("" + 5) || b.hasMetadata("" + 6) || b.hasMetadata("" + 7)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static CropManager get(Location loc, CropsData type) {
		Block b = loc.getBlock();
		return new CropManager(type, b);
	}
	
	public boolean setMetaData() {
		try {
			this.current_state = 0;
			Block b = block;
			b.setMetadata("" + getCurrentState(),
					new FixedMetadataValue(Bukkit.getPluginManager().getPlugin("StardewValley"), this));
			register();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update() {
		this.current_state = current_state + 1;
		Block b = block;
		if (current_state == Crops.valueOf(getType().toString()).getGrowingDay()) {
			CropsData.setRipe(getType(), b);
			return true;
		} else {
			setMetaData();
		}
		return true;
	}

	public CropsData getType() {
		return type;
	}

	public int getCurrentState() {
		return current_state;
	}

	public void setCurrentState(int state) {
		this.current_state = state + current_state;
	}

	public CropsData getCropType(String data) {
		for(List<String> list : CropStorage.getAlls()) {
			String loc = new CropsMeta(data).getMetaData();
			if(list.contains(loc)) {
				return CropsData.valueOf(list.toString());
			}
		}
	}
	
	private void register() {
		if (type == null) {
			System.out
					.println("CropsData or Location must not be null ! " + "Class : com.LinhDoraemon.data.CropManager");
			return;
		}

		switch (type) {
		case ARTICHOKE:
			CropStorage.ARTICHOKE.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case BLUE_BERRY:
			CropStorage.BLUE_BERRY.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case BLUE_JAZZ:
			CropStorage.BLUE_JAZZ.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case CAULIFLOWER:
			CropStorage.CAULIFLOWER.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case COFFEE_BEAN:
			CropStorage.COFFEE_BEAN.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case CORN:
			CropStorage.CORN.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case CRANBERRIES:
			CropStorage.CRANBERRIES.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case EGGPLANT:
			CropStorage.EGGPLANT.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case GARLIC:
			CropStorage.GARLIC.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case GRAPE:
			CropStorage.GRAPE.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case KALE:
			CropStorage.KALE.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case MELON:
			CropStorage.MELON.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case PARSNIP:
			CropStorage.PARSNIP.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case POPPY:
			CropStorage.POPPY.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case POTATO:
			CropStorage.POTATO.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case PUMPKIN:
			CropStorage.PUMPKIN.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case RADISH:
			CropStorage.RADISH.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case RED_CABBAGE:
			CropStorage.RED_CABBAGE.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case STRAWBERRY:
			CropStorage.STRAWBERRY.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case SUNFLOWER:
			CropStorage.SUNFLOWER.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		case TOMATO:
			CropStorage.TOMATO.add(new CropsMeta(block.getLocation()).getMetaData());
			break;
		default:
			break;
		}
	}

}
