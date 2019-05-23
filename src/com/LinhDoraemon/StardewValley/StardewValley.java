package com.LinhDoraemon.StardewValley;

import java.io.File;
import java.io.IOException;

import org.black_ixx.playerpoints.PlayerPoints;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.LinhDoraemon.KitPack.OpenPackListener;
import com.LinhDoraemon.Shops.MarnieShop;
import com.LinhDoraemon.Shops.OpenShopListener;
import com.LinhDoraemon.Shops.PierreShop;
import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.animals.AnimalsListener;
import com.LinhDoraemon.antithings.AntiBreakBlock;
import com.LinhDoraemon.antithings.AntiCraftItem;
import com.LinhDoraemon.antithings.AntiPlaceBlock;
import com.LinhDoraemon.antithings.BreakFurniture;
import com.LinhDoraemon.antithings.itemdrop.DropEvent;
import com.LinhDoraemon.book.BookAPI;
import com.LinhDoraemon.cheat.CheatEvent;
import com.LinhDoraemon.cooking.FoodListener;
import com.LinhDoraemon.crafting.CraftingManager;
import com.LinhDoraemon.crafting.Recipe;
import com.LinhDoraemon.crops.FruitStorage;
import com.LinhDoraemon.crops.PlantsListener;
import com.LinhDoraemon.crops.WateringCrops;
import com.LinhDoraemon.data.CropStorage;
import com.LinhDoraemon.data.LoadingData;
import com.LinhDoraemon.data.PlayerData;
import com.LinhDoraemon.energy.EnergyEvent;
import com.LinhDoraemon.fishing.FishEvent;
import com.LinhDoraemon.fruit.FruitListener;
import com.LinhDoraemon.fruit.TreeStorage;
import com.LinhDoraemon.machenics.Backpack;
import com.LinhDoraemon.machenics.Campfire;
import com.LinhDoraemon.machenics.CherryBomb;
import com.LinhDoraemon.machenics.ChestS;
import com.LinhDoraemon.machenics.DropThings;
import com.LinhDoraemon.machenics.KillMobModule;
import com.LinhDoraemon.machenics.Scythe;
import com.LinhDoraemon.machines.CheesePress;
import com.LinhDoraemon.machines.CrabPot;
import com.LinhDoraemon.machines.Keg;
import com.LinhDoraemon.machines.Loom;
import com.LinhDoraemon.machines.MachineAPI;
import com.LinhDoraemon.machines.MayonaiseMach;
import com.LinhDoraemon.machines.OilMaker;
import com.LinhDoraemon.machines.PreservesJar;
import com.LinhDoraemon.machines.SeedMaker;
import com.LinhDoraemon.machines.Tapper;
import com.LinhDoraemon.mining.MineResources;
import com.LinhDoraemon.mining.PreSmelt;
import com.LinhDoraemon.mining.SmeltRecipe;
import com.LinhDoraemon.npc.NPCEvent;
import com.LinhDoraemon.quest.QuestEvent;
import com.LinhDoraemon.quest.QuestHall;
import com.LinhDoraemon.quest.Quests;
import com.LinhDoraemon.ring.RingGUI;
import com.LinhDoraemon.ring.RingListener;
import com.LinhDoraemon.season.DaysAndTimes;
import com.LinhDoraemon.season.InfoScoreboard;
import com.LinhDoraemon.shipping.ShippingListener;
import com.LinhDoraemon.television.OpenTVListener;
import com.LinhDoraemon.utils.TimeConvert;
import com.LinhDoraemon.wiki.WikiEvent;;

public class StardewValley extends JavaPlugin implements Listener {

	public void onEnable() {

		Recipe.inalization();
		SmeltRecipe.register();
		CropStorage.loadAllCropsData();
		TreeStorage.loadAll();

		hookPlayerPoints();

		Quests.register();

		QuestHall.update();

		// Quests.register();

		getConfig().options().copyDefaults(true);
		saveConfig();

		getCommand("savedata").setExecutor(new CropStorage());

		Bukkit.getPluginManager().registerEvents(new Scythe(), this);
		Bukkit.getPluginManager().registerEvents(new MineResources(), this);
		Bukkit.getPluginManager().registerEvents(new AntiPlaceBlock(), this);
		Bukkit.getPluginManager().registerEvents(new AntiBreakBlock(), this);
		Bukkit.getPluginManager().registerEvents(new FishEvent(), this);
		// Bukkit.getPluginManager().registerEvents(new FishingMinigame(), this);
		Bukkit.getPluginManager().registerEvents(new DaysAndTimes(), this);
		Bukkit.getPluginManager().registerEvents(new InfoScoreboard(), this);
		Bukkit.getPluginManager().registerEvents(new OpenTVListener(), this);
		Bukkit.getPluginManager().registerEvents(new PlantsListener(), this);
		Bukkit.getPluginManager().registerEvents(new FruitStorage(), this);
		Bukkit.getPluginManager().registerEvents(new WateringCrops(), this);

		Bukkit.getPluginManager().registerEvents(new MachineAPI(), this);
		Bukkit.getPluginManager().registerEvents(new FoodListener(), this);
		Bukkit.getPluginManager().registerEvents(new LoadingData(), this);
		Bukkit.getPluginManager().registerEvents(new ShippingListener(), this);
		Bukkit.getPluginManager().registerEvents(new Backpack(), this);
		Bukkit.getPluginManager().registerEvents(new PreservesJar(), this);
		Bukkit.getPluginManager().registerEvents(new FruitListener(), this);
		Bukkit.getPluginManager().registerEvents(new DropThings(), this);
		Bukkit.getPluginManager().registerEvents(new BookAPI(), this);

		Bukkit.getPluginManager().registerEvents(new CraftingManager(), this);
		Bukkit.getPluginManager().registerEvents(new WikiEvent(), this);
		Bukkit.getPluginManager().registerEvents(new EnergyEvent(), this);
		Bukkit.getPluginManager().registerEvents(new NPCEvent(), this);
		Bukkit.getPluginManager().registerEvents(new QuestEvent(), this);
		Bukkit.getPluginManager().registerEvents(new QuestHall(), this);
//		Bukkit.getPluginManager().registerEvents(new FastTreeModule(), this);
		Bukkit.getPluginManager().registerEvents(new CheatEvent(), this);
		Bukkit.getPluginManager().registerEvents(new DropEvent(), this);
		Bukkit.getPluginManager().registerEvents(new KillMobModule(), this);

		MayonaiseMach.registerMayonaise();
		OilMaker.registerOilMaker();
		Keg.registerKeg();
		CheesePress.registerCheese();
		CrabPot.registerCrabPot();
		Tapper.registerTapper();
		Loom.registerLoom();
		SeedMaker.registerSeed();

		Bukkit.getPluginManager().registerEvents(new Campfire(), this);
		Bukkit.getPluginManager().registerEvents(new ChestS(), this);
		Bukkit.getPluginManager().registerEvents(new CherryBomb(), this);
		Bukkit.getPluginManager().registerEvents(new RingGUI(), this);
		Bukkit.getPluginManager().registerEvents(new RingListener(), this);

		Bukkit.getPluginManager().registerEvents(new BreakFurniture(), this);

		Bukkit.getPluginManager().registerEvents(new OpenShopListener(), this);
		Bukkit.getPluginManager().registerEvents(new PierreShop(), this);
		Bukkit.getPluginManager().registerEvents(new OpenPackListener(), this);
		Bukkit.getPluginManager().registerEvents(new AntiCraftItem(), this);

		Bukkit.getPluginManager().registerEvents(new AnimalsListener(), this);
		Bukkit.getPluginManager().registerEvents(new MarnieShop(), this);
		Bukkit.getPluginManager().registerEvents(new PreSmelt(), this);

		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "seasons.yml");

		if (file.exists() == false) {
			try {
				file.createNewFile();
				FileConfiguration config = YamlConfiguration.loadConfiguration(file);
				config.set("Day", 1);
				config.set("Season", "SPRING");
				config.save(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (World w : Bukkit.getWorlds()) {
			w.setGameRuleValue("doMobSpawning", "false");
		}

	}

	private static PlayerPoints playerPoints;

	/**
	 * Validate that we have access to PlayerPoints
	 *
	 * @return True if we have PlayerPoints, else false.
	 */
	private boolean hookPlayerPoints() {
		final Plugin plugin = this.getServer().getPluginManager().getPlugin("PlayerPoints");
		playerPoints = PlayerPoints.class.cast(plugin);
		return playerPoints != null;
	}

	/**
	 * Accessor for other parts of your plugin to retrieve PlayerPoints.
	 *
	 * @return PlayerPoints plugin instance
	 */
	public static PlayerPoints getPlayerPoints() {
		return playerPoints;
	}

	public void onDisable() {

		CropStorage.saveAllCropsData();
		TreeStorage.saveAll();

	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("cheatgui")) {
			if (p.isOp()) {
				CheatEvent.open(p);
			} else {
				p.sendMessage("§cYou do not have permissions to do this action !");
			}
		}
		
		if(cmd.getName().equalsIgnoreCase("chotien")) {
			if(p.isOp()) {
				if(args.length > 0) {
					String name = args[0];
					PlayerData.addPlayerMoney(name, Integer.parseInt(args[1]));
					p.sendMessage("§aSuccessful !");
				}
			}else {
			}
		}

		if(cmd.getName().equalsIgnoreCase("kit")) {
			p.sendTitle("§a§lĐÃ NHẬN KIT", "");
			p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
			p.getInventory().addItem(StardewItems.STARTER_PACK_CHEST());
		}
		
		if (cmd.getName().equals("thongtin")) {
			p.sendMessage("§e§l" + TimeConvert.MCTime(p.getWorld().getTime()) + " §7- §b§l" + DaysAndTimes.getThu());
			p.sendMessage("§b§l" + DaysAndTimes.currentDay() + " §7- §d§l" + DaysAndTimes.currentSeason());
			p.sendMessage("§c§lSố tiền hiện tại của bạn là : §a" + PlayerData.getPlayerMoney(p.getName()) + "đ");
		}
		return true;
	}

}
