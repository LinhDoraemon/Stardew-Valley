package com.LinhDoraemon.machines;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.SimpleItem;

public enum StardewMachines {

	SEED_MAKER("§a§lMáy làm hạt giống", Material.STAINED_CLAY), LOOM("§f§lMáy dệt",
			Material.STAINED_CLAY), PRESERVES_JAR("§a§lThùng lên men", Material.STAINED_CLAY), TAPPER(
					"§9§lMáy lấy nhựa cây",
					Material.SKULL_ITEM), BEE_HOUSE("§e§lTổ nuôi ong", Material.HAY_BLOCK), MAYONNAISE_MACHINE(
							"§6§lMáy làm sốt trứng",
							Material.IRON_BLOCK), OIL_MAKER("§e§lMáy ép dầu", Material.GOLD_BLOCK), KEG("§6§lThùng ủ",
									Material.STAINED_CLAY), CHEESE_PRESS("§e§lMáy làm phô mai",
											Material.STAINED_CLAY), CRAB_POT("§c§lBẫy cua", Material.STAINED_CLAY);

	StardewMachines(String displayname, Material type) {
		this.displayname = displayname;
		this.type = type;
	}

	private String displayname;
	private Material type;

	public static ItemStack BEE_HOUSE() {

		ItemStack item = new ItemStack(Material.HAY_BLOCK);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§e§lTổ nuôi ong");
		SimpleItem.addLore(mt, "", "§fĐặt ngoài trời và chờ thu", "§fhoạch mật ong ngon tuyệt.");
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack SEED_MAKER() {

		ItemStack item = new ItemStack(Material.STAINED_CLAY, 1, (byte) 3);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName(StardewMachines.SEED_MAKER.getDisplayName());
		SimpleItem.addLore(mt, "", "§fChuyển nông sản thành hạt giống tương ứng.");
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack LOOM() {

		ItemStack item = new ItemStack(Material.STAINED_CLAY);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName(StardewMachines.LOOM.getDisplayName());
		SimpleItem.addLore(mt, "", "§fDệt những miếng lông cừu thành vải.");
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack MAYONNAISE_MACHINE() {

		ItemStack item = new ItemStack(Material.IRON_BLOCK);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName("§6§lMáy làm sốt trứng");
		SimpleItem.addLore(mt, "", "§fChuyển mấy quả trứng thành sốt ma-yo-ne.");
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack OIL_MAKER() {

		ItemStack item = new ItemStack(Material.GOLD_BLOCK);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName(StardewMachines.OIL_MAKER.getDisplayName());
		SimpleItem.addLore(mt, "", "§fLàm nên những chai dầu ăn thượng hạng.");
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack KEG() {

		ItemStack item = new ItemStack(Material.STAINED_CLAY, 1, (byte) 12);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName(StardewMachines.KEG.getDisplayName());
		SimpleItem.addLore(mt, "", "§fỦ mọi thứ thành thực phẩm tuyệt vời.");
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack CHEESE_PRESS() {

		ItemStack item = new ItemStack(Material.STAINED_CLAY, 1, (byte) 1);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName(StardewMachines.CHEESE_PRESS.getDisplayName());
		SimpleItem.addLore(mt, "", "§fBiến sữa động vật thành phô mai.");
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack CRAB_POT() {

		ItemStack item = new ItemStack(Material.STAINED_CLAY, 1, (byte) 14);
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName(StardewMachines.CRAB_POT.getDisplayName());
		SimpleItem.addLore(mt, "", "§fĐặt sâu dưới nước và bỏ mồi vào, ", "§fchờ đến sáng hôm sau thu hoạch.");
		item.setItemMeta(mt);
		return item;

	}

	@SuppressWarnings("deprecation")
	public static ItemStack PRESERVES_JAR() {

		ItemStack item = new ItemStack(Material.STAINED_CLAY, 1, DyeColor.GREEN.getDyeData());
		ItemMeta mt = item.getItemMeta();

		mt.setDisplayName(StardewMachines.PRESERVES_JAR.getDisplayName());
		SimpleItem.addLore(mt, "", "§fỦ hoa quả thành mứt, ủ nông sản ", "§fthành dưa muối.");
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack TAPPER() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly" + "90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR"
						+ "1cmUvNzY4ODMyYzA1NjRkOWFiNTk0MDczNDBlND" + "UxOTBjN2VlNDM5NTFhNzc2Zjg1YmQ3MzEzYTI"
						+ "yYzE1YTllIn19fQ==");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName(StardewMachines.TAPPER.getDisplayName());
		SimpleItem.addLore(mt, "", "§fĐặt lên thân cây để lấy nhựa sau 3", "§fngày. Không hoạt động vào mùa đông.");
		item.setItemMeta(mt);
		return item;
	}

	public String getDisplayName() {
		return displayname;
	}

	public Material getType() {
		return type;
	}
}
