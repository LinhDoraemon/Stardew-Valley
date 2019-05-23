package com.LinhDoraemon.Shops;

import java.util.HashMap;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.SimpleItem;

public class ClintShop {

	private static Inventory inv = Bukkit.createInventory(null, 27, "§0§lTiệm rèn của Clint >>");

	private static HashMap<String, Inventory> data = new HashMap<String, Inventory>();

	public static void mainClintShop(Player p) {

		ItemStack nangcap = new ItemStack(Material.GOLD_PICKAXE);
		ItemMeta nangcapmt = nangcap.getItemMeta();
		nangcapmt.setDisplayName("§e§lNÂNG CẤP ITEM TRÊN TAY");
		SimpleItem.addLore(nangcapmt, "", "§fDùng 5 quặng tương ứng để nâng cấp",
				"§fvật phẩm bạn cầm trên tay. Cụ thể :", "", "§aĐồ khởi đầu §7+ §65 thỏi đồng §7= §6§lĐồ đồng",
				"§6Đồ đồng §7+ §f5 thỏi sắt §7= §f§lĐồ sắt", "§fĐồ sắt §7+ §e5 thỏi vàng §7= §e§lĐồ vàng",
				"§eĐồ vàng §7+ §55 thỏi iriđium §7= §5§lĐồ iridium", "", "§c§lCLICK ĐỂ NÂNG CẤP >");
		nangcap.setItemMeta(nangcapmt);

		ItemStack dapquang = new ItemStack(Material.COAL_ORE);
		ItemMeta dapquangmt = dapquang.getItemMeta();
		dapquangmt.setDisplayName("§a§lĐẬP QUẶNG VỚI GIÁ §e§l25đ");
		SimpleItem.addLore(dapquangmt, "", "§fChi ra §a25đ §fđể đập quặng.", "");
		dapquang.setItemMeta(dapquangmt);

		inv.setItem(12, nangcap);
		inv.setItem(14, dapquang);

		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null) {
				inv.setItem(i, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			}
		}

		p.openInventory(inv);
	}

	public static void openBreakOreInv(Player p) {

		Inventory breakore = data.get(p.getName());

		if (breakore == null) {
			
			breakore = Bukkit.createInventory(null, 18, "§0§lĐập quặng >>");
			
			ItemStack info = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
			CSkull.skullWithBase64(info,
					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6I" + "mh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cm"
							+ "UvZDAxYWZlOTczYzU0ODJmZGM3MWU2YWExMD" + "Y5ODgzM2M3OWM0MzdmMjEzMDhlYTlhM"
							+ "WEwOTU3NDZlYzI3NGEwZiJ9fX0=");
			ItemMeta infomt = info.getItemMeta();
			infomt.setDisplayName("§e§lMột số quặng có thể đập");
			SimpleItem.addLore(infomt, "", "§6§lTinh thể đá", "§b§lTinh thể Omni");
			info.setItemMeta(infomt);

			@SuppressWarnings("deprecation")
			ItemStack done = new ItemStack(Material.WOOL, 1, DyeColor.LIME.getWoolData());
			ItemMeta mt = done.getItemMeta();
			mt.setDisplayName("§a§lĐẬP THÔI");
			SimpleItem.addLore(mt, "", "§cNhớ bỏ quặng cần đập lên ô trên !");
			done.setItemMeta(mt);

			breakore.setItem(0, info);
			breakore.setItem(13, done);

			for (int i = 0; i < breakore.getSize(); i++) {
				if (breakore.getItem(i) == null) {
					breakore.setItem(i, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
				}
			}

			breakore.setItem(4, null);
			
			data.put(p.getName(), breakore);
		}
		
		p.openInventory(breakore);

	}

	public static ItemStack[] resources = { StardewItems.AMETHYST(), StardewItems.AQUAMARINE(),
			StardewItems.COPPER_CLUSTER(), StardewItems.DIAMOND(), StardewItems.EARTH_CRYSTAL(), StardewItems.EMERALD(),
			StardewItems.GOLD_CLUSTER(), StardewItems.IRIDIUM_CLUSTER(), StardewItems.IRON_CLUSTER(),
			StardewItems.QUARTZ(), StardewItems.RUBY(), StardewItems.STONE(), StardewItems.TOPAZ() };

	public static ItemStack getRandomResource() {
		Random rand = new Random();
		int so = rand.nextInt(resources.length);

		return resources[so];
	}

}
