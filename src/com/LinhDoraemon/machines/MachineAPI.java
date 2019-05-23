package com.LinhDoraemon.machines;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

public class MachineAPI implements Listener {

	@EventHandler
	public void breakmachine(BlockBreakEvent e) {

		Block b = e.getBlock();

		if(b.getWorld().getName() == "world") {
			return;
		}
		
		if (b.getType() == Material.HAY_BLOCK) {
			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewMachines.BEE_HOUSE());
			BeeHouse.removeBeeHouse(b);
		}
		
		if(b.getType() == Material.STAINED_CLAY && b.getData() == 3) {
			e.setCancelled(true);
			b.setType(Material.AIR);
			
			b.getWorld().dropItemNaturally(b.getLocation(), StardewMachines.SEED_MAKER());
			SeedMaker.removeSeedMachine(b);
		}
		
		if(b.getType() == Material.STAINED_CLAY && b.getData() == 0) {
			e.setCancelled(true);
			b.setType(Material.AIR);
			
			b.getWorld().dropItemNaturally(b.getLocation(), StardewMachines.LOOM());
			Loom.removeLoomMachine(b);
		}
		
		if (b.getType() == Material.IRON_BLOCK) {
			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewMachines.MAYONNAISE_MACHINE());
			MayonaiseMach.removeMatonaiseMachine(b);
		}

		if (b.getType() == Material.GOLD_BLOCK) {
			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewMachines.OIL_MAKER());
			OilMaker.removeBeeHouse(b);
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == 12) {
			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewMachines.KEG());
			Keg.removeKegMachine(b);
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == 1) {
			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewMachines.CHEESE_PRESS());
			CheesePress.removeCheeseMachine(b);
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == 14) {
			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewMachines.CRAB_POT());
			CrabPot.removeCrabPot(b);
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == DyeColor.GREEN.getDyeData()) {
			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewMachines.PRESERVES_JAR());
			PreservesJar.removePreservesMachine(b);
		}
		
		try {
			if (b.getType() == Material.SKULL && CustomSkull.getTexture(b)
					.equals("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly" + "90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR"
							+ "1cmUvNzY4ODMyYzA1NjRkOWFiNTk0MDczNDBlND" + "UxOTBjN2VlNDM5NTFhNzc2Zjg1YmQ3MzEzYTI"
							+ "yYzE1YTllIn19fQ==")) {
				e.setCancelled(true);
				b.setType(Material.AIR);

				b.getWorld().dropItemNaturally(b.getRelative(BlockFace.UP).getLocation(), StardewMachines.TAPPER());
				Tapper.removeTapper(b);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@EventHandler
	public void openmachineinv(PlayerInteractEvent e) {

		Block b = e.getClickedBlock();
		Player p = e.getPlayer();

		if (b == null) {
			return;
		}

		if (e.getAction() != Action.RIGHT_CLICK_BLOCK) {
			return;
		}
		
		if(b.getWorld().getName() == "world") {
			return;
		}

		Location loc = b.getLocation();

		if (b.getType() == Material.HAY_BLOCK) {
			p.openInventory(BeeHouse.getBeeInventory(loc));
		}

		if (b.getType() == Material.IRON_BLOCK) {
			e.setCancelled(true);
			p.openInventory(MayonaiseMach.getMayonaiseInventory(loc));
		}

		if (b.getType() == Material.GOLD_BLOCK) {
			e.setCancelled(true);
			p.openInventory(OilMaker.getOilInventory(loc));
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == 12) {
			e.setCancelled(true);
			p.openInventory(Keg.getKegInventory(loc));
		}
		
		if (b.getType() == Material.STAINED_CLAY && b.getData() == 3) {
			e.setCancelled(true);
			p.openInventory(SeedMaker.getSeedInventory(loc));
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == 1) {
			e.setCancelled(true);
			p.openInventory(CheesePress.getCheeseInventory(loc));
		}
		
		if (b.getType() == Material.STAINED_CLAY && b.getData() == 0) {
			e.setCancelled(true);
			p.openInventory(Loom.getLoomInventory(loc));
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == 14) {
			e.setCancelled(true);
			p.openInventory(CrabPot.getCrabPotInventory(loc));
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == DyeColor.GREEN.getDyeData()) {
			e.setCancelled(true);
			p.openInventory(PreservesJar.getPreservesInventory(loc));
		}
		
		try {
			if (b.getType() == Material.SKULL && CustomSkull.getTexture(b)
					.equals("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly" + "90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR"
							+ "1cmUvNzY4ODMyYzA1NjRkOWFiNTk0MDczNDBlND" + "UxOTBjN2VlNDM5NTFhNzc2Zjg1YmQ3MzEzYTI"
							+ "yYzE1YTllIn19fQ==")) {
				e.setCancelled(true);
				p.openInventory(Tapper.getBeeInventory(loc));
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@EventHandler
	public void nguoichoidattapper(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Block b = e.getClickedBlock();
		ItemStack i = e.getItem();

		if (b == null || i == null) {
			return;
		}

		if(b.getWorld().getName() == "world") {
			return;
		}
		
		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals(StardewMachines.TAPPER.getDisplayName())
				) {
			if(b.getType() == Material.LOG) {
				
			}else {
				e.setCancelled(true);
				p.sendMessage("§c§lPhải đặt lên thân cây hoặc gỗ !");
			}
		}
	}

	@EventHandler
	public void placemachineeve(BlockPlaceEvent e) {

		Block b = e.getBlock();
		
		if(b.getWorld().getName() == "world") {
			return;
		}

		if (b.getType() == Material.HAY_BLOCK) {
			BeeHouse.addBeeHouse(b);
		}

		if (b.getType() == Material.IRON_BLOCK) {
			MayonaiseMach.addMayonaiseMachine(b);
		}

		if (b.getType() == Material.GOLD_BLOCK) {
			OilMaker.addOilMaker(b);
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == 12) {

			Keg.addKegMachine(b);
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == 1) {
			CheesePress.addCheeseMachine(b);
		}

		if (b.getType() == Material.STAINED_CLAY && b.getData() == 14) {
			CrabPot.addCrabPot(b);
		}
		
		if (b.getType() == Material.STAINED_CLAY && b.getData() == 0) {
			Loom.addLoomMachine(b);
		}
		
		if (b.getType() == Material.STAINED_CLAY && b.getData() == 3) {
			SeedMaker.addSeedMachine(b);
		}
		
		if (b.getType() == Material.STAINED_CLAY && b.getData() == DyeColor.GREEN.getDyeData()) {
			PreservesJar.addPreservesMachine(b);
		}

		try {
			if (b.getType() == Material.SKULL && CustomSkull.getTexture(b)
					.equals("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly" + "90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR"
							+ "1cmUvNzY4ODMyYzA1NjRkOWFiNTk0MDczNDBlND" + "UxOTBjN2VlNDM5NTFhNzc2Zjg1YmQ3MzEzYTI"
							+ "yYzE1YTllIn19fQ==")) {
				Tapper.addTapper(b);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
