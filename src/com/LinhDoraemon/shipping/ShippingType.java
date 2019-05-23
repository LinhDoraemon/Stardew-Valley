package com.LinhDoraemon.shipping;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.cropstype.BlueBerry;
import com.LinhDoraemon.cropstype.BlueJazz;
import com.LinhDoraemon.cropstype.Cauliflower;
import com.LinhDoraemon.cropstype.CoffeeBean;
import com.LinhDoraemon.cropstype.Corn;
import com.LinhDoraemon.cropstype.Garlic;
import com.LinhDoraemon.cropstype.Kale;
import com.LinhDoraemon.cropstype.Melon;
import com.LinhDoraemon.cropstype.Parsnip;
import com.LinhDoraemon.cropstype.Potato;
import com.LinhDoraemon.cropstype.Strawberry;
import com.LinhDoraemon.data.PlayerData;
import com.LinhDoraemon.ocean.OceanItems;
import com.LinhDoraemon.utils.HashTag;

public class ShippingType {

	public static void sellAllFestives(Player p, ItemStack i) {
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getLore() !=null && i.getItemMeta().getLore().contains(HashTag.TYPE_FESTIVAL)) {
			sellItem(p, i, 350, 350, 350, 350);
		}

	}
	
	public static void sellFruits(Player p, ItemStack i) {
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§c§lTrái lựu")) {
			sellItem(p, i, 120, 155, 190, 260);
		}
		
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§d§lTrái sơ-ri")) {
			sellItem(p, i, 80, 100, 120, 160);
		}
		
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§6§lTrái cam")) {
			sellItem(p, i, 100, 125, 150, 200);
		}
	}
	
	public static void sellAllAnimals(Player p, ItemStack i) {
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§f§lSữa")) {
			sellItem(p, i, 100, 109, 115, 125);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§f§lTrứng gà")) {
			sellItem(p, i, 50, 62, 75, 100);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§6§lGà")) {
			sellItem(p, i, 2100, 2100, 2100, 2100);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§b§lBò")) {
			sellItem(p, i, 4800, 4800, 4800, 4800);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§f§lCừu")) {
			sellItem(p, i, 6400, 6400, 6400, 6400);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§f§lLông cừu")) {
			sellItem(p, i, 70, 82, 94, 102);
		}
	}

	public static void sellAllLinhtinh(Player p, ItemStack i) {

		if (i != null && i.getItemMeta() != null && i.getItemMeta().getLore() !=null && i.getItemMeta().getLore().contains(HashTag.TYPE_FOOD_AND_DRINK)) {
			sellItem(p, i, 50, 50, 50, 50);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getLore() !=null && i.getItemMeta().getLore().contains(HashTag.TYPE_FISH)) {
			sellItem(p, i, 50, 80, 95, 101);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getLore() !=null && i.getItemMeta().getLore().contains(HashTag.TYPE_RING)) {
			sellItem(p, i, 185, 185, 185, 185);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getLore() !=null && i.getItemMeta().getLore().contains(HashTag.TYPE_WILD_PLANT)) {
			sellItem(p, i, 25, 37, 46, 60);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getLore() !=null && i.getItemMeta().getLore().contains(HashTag.TYPE_MONSTER)) {
			sellItem(p, i, 40, 40, 40, 40);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getLore() !=null && i.getItemMeta().getLore().contains(HashTag.TYPE_FURNITURE)) {
			sellItem(p, i, 1, 1, 1, 1);
		}

	}

	public static void sellAllBuildingResource(Player p, ItemStack i) {

		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.FIBER().getItemMeta().getDisplayName())) {
			sellItem(p, i, 1, 1, 1, 1);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.SAP().getItemMeta().getDisplayName())) {
			sellItem(p, i, 2, 2, 2, 2);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.WOOD().getItemMeta().getDisplayName())) {
			sellItem(p, i, 2, 2, 2, 2);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.STONE().getItemMeta().getDisplayName())) {
			sellItem(p, i, 2, 2, 2, 2);
		}

	}

	public static void sellAllResources(Player p, ItemStack i) {

		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.AMETHYST().getItemMeta().getDisplayName())) {
			sellItem(p, i, 100, 100, 100, 100);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.COAL().getItemMeta().getDisplayName())) {
			sellItem(p, i, 15, 15, 15, 15);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.COPPER_BAR().getItemMeta().getDisplayName())) {
			sellItem(p, i, 60, 60, 60, 60);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.COPPER_CLUSTER().getItemMeta().getDisplayName())) {
			sellItem(p, i, 5, 5, 5, 5);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.DIAMOND().getItemMeta().getDisplayName())) {
			sellItem(p, i, 750, 750, 750, 750);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.EARTH_CRYSTAL().getItemMeta().getDisplayName())) {
			sellItem(p, i, 50, 50, 50, 50);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.EMERALD().getItemMeta().getDisplayName())) {
			sellItem(p, i, 250, 250, 250, 250);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.GOLD_BAR().getItemMeta().getDisplayName())) {
			sellItem(p, i, 250, 250, 250, 250);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.GOLD_CLUSTER().getItemMeta().getDisplayName())) {
			sellItem(p, i, 25, 25, 25, 25);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.IRIDIUM_BAR().getItemMeta().getDisplayName())) {
			sellItem(p, i, 1000, 1000, 1000, 1000);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.IRIDIUM_CLUSTER().getItemMeta().getDisplayName())) {
			sellItem(p, i, 100, 100, 100, 100);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.IRON_BAR().getItemMeta().getDisplayName())) {
			sellItem(p, i, 120, 120, 120, 120);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.IRON_CLUSTER().getItemMeta().getDisplayName())) {
			sellItem(p, i, 10, 10, 10, 10);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.QUARTZ().getItemMeta().getDisplayName())) {
			sellItem(p, i, 25, 25, 25, 25);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.RUBY().getItemMeta().getDisplayName())) {
			sellItem(p, i, 250, 250, 250, 250);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.TOPAZ().getItemMeta().getDisplayName())) {
			sellItem(p, i, 80, 80, 80, 80);
		}

	}

	public static void sellAllArtisan(Player p, ItemStack i) {
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.BEER().getItemMeta().getDisplayName())) {
			sellItem(p, i, 50, 50, 50, 50);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.FLOUR().getItemMeta().getDisplayName())) {
			sellItem(p, i, 50, 60, 70, 80);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.WINE().getItemMeta().getDisplayName())) {
			sellItem(p, i, 80, 90, 100, 110);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.HONEY().getItemMeta().getDisplayName())) {
			sellItem(p, i, 100, 110, 120, 130);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.JAM().getItemMeta().getDisplayName())) {
			sellItem(p, i, 60, 70, 80, 90);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.PICKLES().getItemMeta().getDisplayName())) {
			sellItem(p, i, 80, 90, 100, 110);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.JUICE().getItemMeta().getDisplayName())) {
			sellItem(p, i, 67, 77, 87, 97);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.MAPLE_SYRUP().getItemMeta().getDisplayName())) {
			sellItem(p, i, 200, 210, 220, 230);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.MAYONNAISE().getItemMeta().getDisplayName())) {
			sellItem(p, i, 190, 200, 210, 220);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.MILK_CHEESE().getItemMeta().getDisplayName())) {
			sellItem(p, i, 200, 212, 300, 350);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().startsWith(StardewItems.OAK_RESIN().getItemMeta().getDisplayName())) {
			sellItem(p, i, 190, 215, 230, 250);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.OIL().getItemMeta().getDisplayName())) {
			sellItem(p, i, 100, 100, 100, 100);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(StardewItems.RICE().getItemMeta().getDisplayName())) {
			sellItem(p, i, 100, 100, 100, 100);
		}
	}

	public static void sellAllOceans(Player p, ItemStack i) {

		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().equals(OceanItems.getItem(OceanItems.BROKEN_CD).getItemMeta().getDisplayName())) {
			sellItem(p, i, 0, 0, 0, 0);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().equals(OceanItems.getItem(OceanItems.CRAB).getItemMeta().getDisplayName())) {
			sellItem(p, i, 100, 100, 100, 100);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().equals(OceanItems.getItem(OceanItems.DRIFED_WOOD).getItemMeta().getDisplayName())) {
			sellItem(p, i, 0, 0, 0, 0);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().equals(OceanItems.getItem(OceanItems.LOBSTER).getItemMeta().getDisplayName())) {
			sellItem(p, i, 120, 120, 120, 120);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().equals(OceanItems.getItem(OceanItems.SHRIMP).getItemMeta().getDisplayName())) {
			sellItem(p, i, 60, 60, 60, 60);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().equals(OceanItems.getItem(OceanItems.SNAIL).getItemMeta().getDisplayName())) {
			sellItem(p, i, 65, 65, 65, 65);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName()
						.equals(OceanItems.getItem(OceanItems.SOGGY_NEWSPAPER).getItemMeta().getDisplayName())) {
			sellItem(p, i, 0, 0, 0, 0);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().equals(OceanItems.getItem(OceanItems.TRASH).getItemMeta().getDisplayName())) {
			sellItem(p, i, 0, 0, 0, 0);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().equals(StardewItems.CORAL().getItemMeta().getDisplayName())) {
			sellItem(p, i, 12, 15, 20, 35);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().equals(StardewItems.CLAM().getItemMeta().getDisplayName())) {
			sellItem(p, i, 12, 15, 20, 35);
		}
	}

	public static void sellAllCrops(Player p, ItemStack i) {
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(BlueJazz.getName)) {
			sellItem(p, i, 50, 62, 75, 80);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(BlueBerry.getName)) {
			sellItem(p, i, 50, 62, 75, 80);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(Cauliflower.getName)) {
			sellItem(p, i, 175, 218, 262, 270);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(CoffeeBean.getName)) {
			sellItem(p, i, 15, 18, 22, 30);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(Garlic.getName)) {
			sellItem(p, i, 60, 75, 90, 100);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(Corn.getName)) {
			sellItem(p, i, 50, 62, 75, 80);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(Kale.getName)) {
			sellItem(p, i, 50, 62, 75, 80);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(Melon.getName)) {
			sellItem(p, i, 80, 100, 120, 130);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(Parsnip.getName)) {
			sellItem(p, i, 35, 43, 52, 60);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(Potato.getName)) {
			sellItem(p, i, 80, 100, 120, 130);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith(Strawberry.getName)) {
			sellItem(p, i, 65, 70, 75, 80);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§c§lCà chua")) {
			sellItem(p, i, 30, 32, 41, 50);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§c§lCủ dền")) {
			sellItem(p, i, 20, 25, 32, 41);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§c§lHoa anh túc")) {
			sellItem(p, i, 30, 35, 46, 59);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§c§lCải bắp đỏ")) {
			sellItem(p, i, 120, 150, 180, 195);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§e§lHoa hướng dương")) {
			sellItem(p, i, 50, 54, 63, 74);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§a§lA ti sô")) {
			sellItem(p, i, 80, 85, 90, 95);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§c§lNam việt quất")) {
			sellItem(p, i, 75, 93, 112, 120);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§5§lCà tím")) {
			sellItem(p, i, 75, 93, 112, 120);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§6§lBí ngô")) {
			sellItem(p, i, 120, 125, 135, 145);
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().startsWith("§5§lNho")) {
			sellItem(p, i, 30, 40, 45, 55);
		}
	}

	public static void sellItem(Player p, ItemStack i, int normal, int silver, int gold, int iridium) {
		int amount = i.getAmount();

		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().contains(HashTag.IRON_QUALITY)) {
			PlayerData.addPlayerMoney(p.getName(), silver * amount);
			p.sendMessage("§f§l[§e§l❖§f§l] §c§lBạn vừa bán §ax" + amount + " " + i.getItemMeta().getDisplayName()
					+ " §c§lvới giá §6§l" + silver * amount + "đ");
			return;
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().contains(HashTag.GOLD_QUALITY)) {
			PlayerData.addPlayerMoney(p.getName(), gold * amount);
			p.sendMessage("§f§l[§e§l❖§f§l] §c§lBạn vừa bán §ax" + amount + " " + i.getItemMeta().getDisplayName()
					+ " §c§lvới giá §6§l" + gold * amount + "đ");
			return;
		}
		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().contains(HashTag.IDIRIUM_QUALITY)) {
			PlayerData.addPlayerMoney(p.getName(), iridium * amount);
			p.sendMessage("§f§l[§e§l❖§f§l] §c§lBạn vừa bán §ax" + amount + " " + i.getItemMeta().getDisplayName()
					+ " §c§lvới giá §6§l" + iridium * amount + "đ");
			return;
		}
		PlayerData.addPlayerMoney(p.getName(), normal * amount);
		p.sendMessage("§f§l[§e§l❖§f§l] §c§lBạn vừa bán §ax" + amount + " " + i.getItemMeta().getDisplayName()
				+ " §c§lvới giá §6§l" + normal * amount + "đ");
		return;
	}
}
