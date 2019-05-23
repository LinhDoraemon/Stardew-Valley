package com.LinhDoraemon.antithings;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.machenics.ChestS;
import com.LinhDoraemon.season.DaysAndTimes;

public class AntiBreakBlock implements Listener {

	@EventHandler
	public void maybugditaoxem(BlockBreakEvent e) {

		Player p = e.getPlayer();
		Block b = e.getBlock();

		if (b == null) {
			return;
		}

		if (p.getGameMode() != GameMode.SURVIVAL) {
			return;
		}

		if (b.getWorld().getName().equals("stardewhome") || b.getWorld().getName().equals("world")) {
			e.setCancelled(true);

			if (Bukkit.getPlayer("Fuisloy").isOnline()) {
				Bukkit.getPlayer("Fuisloy")
						.sendMessage("§e§l[DEBUG] §a§l" + p.getName() + " §bđang cố bug ra ngoài sur !");
			} else {
				Bukkit.getConsoleSender()
						.sendMessage("§e§l[DEBUG] §a§l" + p.getName() + " §bđang cố bug ra ngoài sur !");
			}

			return;
		}

	}

	@EventHandler
	public void antiBreakBlock(BlockBreakEvent e) {
		Player p = e.getPlayer();
		Block b = e.getBlock();

		if (b == null) {
			return;
		}

		if (b.getWorld().getName().equalsIgnoreCase("world")) {
			e.setCancelled(true);
			return;
		}
		
		switch (b.getType()) {
		case WOOD_PLATE:

			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.WOOD_PATH());

			break;
		case JACK_O_LANTERN:
			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getRelative(BlockFace.UP).getLocation(), StardewItems.JACK_O_LANTERN());

			break;
		case STONE_PLATE:

			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.STONE_PATH());

			break;
		case LOG:
		case LOG_2:
			e.setCancelled(true);
			b.setType(Material.AIR);
			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.WOOD());

			break;
		case SIGN_POST:

			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.WOOD_SIGN());

			break;
		case FENCE:

			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.WOOD_FENCE());

			break;
		case FENCE_GATE:

			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.GATE());

			break;
		case TORCH:

			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.TORCH());

			break;
		case CHEST:

			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), ChestS.getChest());

			break;
		case GRASS_PATH:

			e.setCancelled(true);
			b.setType(Material.AIR);

			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.GRASS_PATH());

			break;
		case COBBLESTONE:
		case STONE:
			e.setCancelled(true);
			b.setType(Material.AIR);

			p.getInventory().addItem(StardewItems.STONE());
			break;
		case LEAVES:
			e.setCancelled(true);
			if (p.getInventory().getItemInMainHand().getType() == Material.SHEARS) {
				return;
			}

			b.setType(Material.AIR);

			Random rand = new Random();
			int so = rand.nextInt(20);
			if (so == 5) {
				b.getWorld().dropItemNaturally(b.getRelative(BlockFace.UP).getLocation(), StardewItems.ACORN());
			}
			if (so == 10) {
				b.getWorld().dropItemNaturally(b.getRelative(BlockFace.UP).getLocation(), StardewItems.MAPLE_SEED());
			}

			switch (so) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 6:
				b.getWorld().dropItemNaturally(b.getRelative(BlockFace.UP).getLocation(), StardewItems.SAP());
				break;
			default:
				break;
			}

			break;
		case LONG_GRASS:

			e.setCancelled(true);
			b.setType(Material.AIR);

			if (20 > new Random().nextInt(100)) {
				p.getInventory().addItem(StardewItems.FIBER());
			}
			check(b);
			break;
		default:
			break;
		}

	}

	public static void check(Block b) {
		Location loc = b.getRelative(BlockFace.UP).getLocation();

		if (DaysAndTimes.isSpring()) {
			Random rand = new Random();
			int so = rand.nextInt(200) + 1;

			switch (so) {
			case 12:
				loc.getWorld().dropItemNaturally(loc, StardewItems.SALMONBERRY());
				break;
			case 5:
				loc.getWorld().dropItemNaturally(loc, StardewItems.COMMON_MUSHROOM());
				break;
			case 15:
				loc.getWorld().dropItemNaturally(loc, StardewItems.WILD_HORSERADISH());
				break;
			case 25:
				loc.getWorld().dropItemNaturally(loc, StardewItems.LEEK());
				break;
			case 35:
				loc.getWorld().dropItemNaturally(loc, StardewItems.SPRING_ONION());
				break;
			case 45:
				loc.getWorld().dropItemNaturally(loc, StardewItems.DAFFODIL());
				break;
			default:
				break;
			}
		}

		if (DaysAndTimes.isSummer()) {
			Random rand = new Random();
			int so = rand.nextInt(200) + 1;
			switch (so) {
			case 15:
				loc.getWorld().dropItemNaturally(loc, StardewItems.SPICE_BERRY());
				break;
			case 25:
				loc.getWorld().dropItemNaturally(loc, StardewItems.GRAPE());
				break;
			case 35:
				loc.getWorld().dropItemNaturally(loc, StardewItems.SWEET_PEA());
				break;
			case 45:
				loc.getWorld().dropItemNaturally(loc, StardewItems.RED_MUSHROOM());
				break;
			default:
				break;
			}
		}

		if (DaysAndTimes.isFall()) {
			Random rand = new Random();
			int so = rand.nextInt(200) + 1;
			switch (so) {
			case 5:
				loc.getWorld().dropItemNaturally(loc, StardewItems.RED_MUSHROOM());
				break;
			case 15:
				loc.getWorld().dropItemNaturally(loc, StardewItems.WILD_PLUM());
				break;
			case 25:
				loc.getWorld().dropItemNaturally(loc, StardewItems.HAZELNUT());
				break;
			case 35:
				loc.getWorld().dropItemNaturally(loc, StardewItems.BLACKBERRY());
				break;
			case 45:
				loc.getWorld().dropItemNaturally(loc, StardewItems.COMMON_MUSHROOM());
				break;
			default:
				break;
			}
		}

		if (DaysAndTimes.isWinter()) {
			Random rand = new Random();
			int so = rand.nextInt(200) + 1;
			switch (so) {
			case 15:
				loc.getWorld().dropItemNaturally(loc, StardewItems.WINTER_ROOT());
				break;
			case 25:
				loc.getWorld().dropItemNaturally(loc, StardewItems.CRYSTAL_FRUIT());
				break;
			case 35:
				loc.getWorld().dropItemNaturally(loc, StardewItems.CROCUS());
				break;
			case 45:
				loc.getWorld().dropItemNaturally(loc, StardewItems.HOLLY());
				break;
			default:
				break;
			}
		}
	}

}
