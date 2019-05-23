package com.LinhDoraemon.crops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Skull;

import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

public enum CropsData {

	EGGPLANT("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJl" + "cy5taW5lY3JhZnQubmV0L3RleHR1cmUvO"
			+ "DgyNTUzNmE0NGYxODYxNjMzNDg0NzUzODM1ZTU4NzN"
			+ "lZDU2NjdlYzViNjBlZjQxNzU3YTE2YTc2OGFhNzYifX19"), CRANBERRIES(
					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0" + "dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3"
							+ "RleHR1cmUvNDBhYjVmN2I3NWI2NjIzNzg3Njgx" + "MWVjOTRjMjcyMjgzOWY3MGRiMWRjYzY3ZGUzN"
							+ "2Q3NjdmMmU5NDFiZiJ9fX0="), ARTICHOKE(
									"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5"
											+ "taW5lY3JhZnQubmV0L3RleHR1cmUvMTUxNGM4YjQ2MT"
											+ "I0N2FiMTdmZTM2MDZlNmUyZjRkMzYzZGNjYWU5ZWQ"
											+ "1YmVkZDAxMmI0OThkN2FlOGViMyJ9fX0="), BLUE_BERRY(
													"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6I"
															+ "mh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQub"
															+ "mV0L3RleHR1cmUvMWIxODcwNGFhMGM5MmFi"
															+ "N2YzMDY1YjNlMzg0OTZkZDFjZDQyZjkzYj"
															+ "ExODNhM2ZiNGYyNmI0ZThkOTk5YWUifX19"), BLUE_JAZZ(
																	"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6"
																			+ "Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQyM2"
																			+ "IxMTllM2FlMGNmODhiYTg4ZThmOTRkNTM1N2MyODYyNDk4NTBjMWQ1MmQz"
																			+ "MjU1ZjNmZjE0OTVhM2QzYyJ9fX0="), CAULIFLOWER(
																					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp"
																							+ "7InVybCI6Imh0dHA6Ly90ZXh0dXJl"
																							+ "cy5taW5lY3JhZnQubmV0L3RleHR1cmU"
																							+ "vNjE2NGNjNzYwODE1OTlhMjBhNjg5NmEzOD"
																							+ "E4MzIyYTBjZGMwODA2OWZmOTYwYmJkNzlmZj"
																							+ "U0ZmM0NWUzNWVlNiJ9fX0="), COFFEE_BEAN(
																									"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InV"
																											+ "ybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5"
																											+ "lY3JhZnQubmV0L3RleHR1cmUvMjExNmI5"
																											+ "ZDhkZjM0NmEyNWVkZDA1Zjg0MmU3YTkzND"
																											+ "ViZWFmMTZkY2E0MTE4YWJmNWE2OGM3NWJj"
																											+ "YWFlMTAifX19"), CORN(
																													"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI"
																															+ "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3Jh"
																															+ "ZnQubmV0L3RleHR1cmUvZDM5MWRmZmJlYT"
																															+ "JmYzNmMmFkNzhhNjIzZjQ5YmY3ZTExMjE2"
																															+ "OTQxMTJjMzc1OWZlZWQ0MTU2ZmMyYmE"
																															+ "0NmMwIn19fQ=="), GARLIC(
																																	"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7I"
																																			+ "nVybCI6Imh0dHA6Ly90ZXh0dXJlc"
																																			+ "y5taW5lY3JhZnQubmV0L3RleHR1cm"
																																			+ "UvMzA1MmQ5YzExODQ4ZWJjYzlmODM0"
																																			+ "MDMzMjU3N2JmMWQyMmI2NDNjMzRjNmF"
																																			+ "hOTFmZTRjMTZkNWE3M2Y2ZDgifX19"), KALE(
																																					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InV"
																																							+ "ybCI6Imh0dHA6Ly90ZXh0dXJlcy5t"
																																							+ "aW5lY3JhZnQubmV0L3RleHR1cmUvZ"
																																							+ "TUxOTY5NjlhZmNjMTk0OWMzNTM4Nj"
																																							+ "k3Y2RkNWIxOTE5N2ZhMzg1MTYxMzQ"
																																							+ "2OGRiZDU1ZDAzMTUzODk5YjYifX19"), MELON(
																																									"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI"
																																											+ "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3Jh"
																																											+ "ZnQubmV0L3RleHR1cmUvOTYzNmRlZTgw"
																																											+ "NmJhNDdhMmM0MGU5NWI1N2ExMmYzN2Rl"
																																											+ "NmMyZTY3N2YyMTYwMTMyYTA3ZTI0ZWV"
																																											+ "mZmE2In19fQ=="), PARSNIP(
																																													"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh"
																																															+ "0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3Rle"
																																															+ "HR1cmUvYmYxYzUyY2IxNWRjMmE3MTkyYjE1NWU1MjI"
																																															+ "0MWU3ODE5YjU2NWYzYTY0OTJjYzRkZjEyN2Qy"
																																															+ "YTFjNDJhIn19fQ=="), POPPY(
																																																	"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6"
																																																			+ "Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L"
																																																			+ "3RleHR1cmUvZDMzMTFjZTQ4MDdlZmNmMzk5Mjk5Zm"
																																																			+ "FkYzk1ZjMyYjQzOGY1MTBjOThlZmRmNjM5Y2U5"
																																																			+ "MTdmMjdlYjVlMDg0OSJ9fX0="), POTATO(
																																																					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6"
																																																							+ "Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3"
																																																							+ "RleHR1cmUvZGJmYjZkNGE1NGMxN2UyNzQ4NDM3YW"
																																																							+ "NjNzA5OGZiYjFhM2ExMmE0MDdmNTFiM2U0OTU0Mj"
																																																							+ "MzMjcxNDg0NmZkOCJ9fX0="), RADISH(
																																																									"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVyb"
																																																											+ "CI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZn"
																																																											+ "QubmV0L3RleHR1cmUvMThmMzZlYTIyOGM0ZmQ5"
																																																											+ "YWZlZDVhZGQ2ZDA1MjZkZTcxYjdhYzA1NTllYWJ"
																																																											+ "mYzJmNjBkZTZjNGFhNzMzZjUifX19"), RED_CABBAGE(
																																																													"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh"
																																																															+ "0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0"
																																																															+ "L3RleHR1cmUvOTVjMjdlOWUwNzQ0NjgyNWZhN"
																																																															+ "2VjYmFjMTkyNTEwOWUyYzE2MjUzNTY0YTQ2Mjg"
																																																															+ "yMDJkODk0NDkyZDJjMzZmOCJ9fX0="), STRAWBERRY(
																																																																	"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7In"
																																																																			+ "VybCI6Imh0dHA6Ly90ZXh0dXJlcy5"
																																																																			+ "taW5lY3JhZnQubmV0L3RleHR1cmUv"
																																																																			+ "Yjk3MDhkODE4YmU5N2RjN2UyYzNiY"
																																																																			+ "jVjMzU2NjNlYjM2MjY5MjM2ZTliYzk"
																																																																			+ "4Mjg2ZjQyOWRmZGYzNzVhYTkifX19"), SUNFLOWER(
																																																																					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVyb"
																																																																							+ "CI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZn"
																																																																							+ "QubmV0L3RleHR1cmUvMTEwMTMyNDNlOWQ4Zjc"
																																																																							+ "5ZWI2MjIxYmMzMDIzNmUxOWQ4YWMyOTU1NzQ5"
																																																																							+ "ZjY3N2I0OWE5OTE3ZDk4NmM3ODFlMCJ9fX0="), TOMATO(
																																																																									"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVy"
																																																																											+ "bCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmU"
																																																																											+ "vYzhiNzUyZTUyMzJiMDM5YjFlNzVlNDU0M"
																																																																											+ "TgzYTE5MmQ0MDU3YjdjYTgzMmY3YzI0YTVmZDg2Nzk2OWNiNGQifX19"), PUMPKIN(
																																																																													"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA"
																																																																															+ "6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cm"
																																																																															+ "UvYjQxYWQxNDhlMzNjODFkY2EzZjFhNmNlMTNhYTcw"
																																																																															+ "ZTRmZTZiYzJjNzllODcxODVkOGQxNzZiZGRhMWM5OGEzIn19fQ=="),

	GRAPE("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh" + "0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L"
			+ "3RleHR1cmUvNjhhMTFiNGNjNmY2OTJmOWI1NjA3" + "ZDA4MWNhNjJiY2UyNmY0Y2ZiMmMzY2JkNDU"
			+ "yYTg3NjkzMTVkOTg0ZCJ9fX0=");

	private String data;

	CropsData(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public static List<String> getAllData() {
		List<String> i = new ArrayList<String>();
		CropsData[] list = CropsData.values();

		for (int so = 0; so < list.length; so++) {
			i.add(list[so].getData());
		}

		return i;
	}

	private static BlockFace[] bf = { BlockFace.NORTH, BlockFace.NORTH_EAST, BlockFace.EAST, BlockFace.SOUTH_EAST,
			BlockFace.SOUTH, BlockFace.SOUTH_WEST, BlockFace.WEST, BlockFace.NORTH_WEST };

	@SuppressWarnings("deprecation")
	public static boolean setRipe(CropsData type, Block block) {

		Block b = block.getRelative(BlockFace.UP);

		block.setType(Material.LEAVES);
		block.setData((byte) 0x4);

		b.setType(Material.SKULL);

		Skull s = (Skull) b.getState();
		s.setSkullType(SkullType.PLAYER);
		s.setRotation(bf[new Random().nextInt(bf.length)]);
		s.setRawData((byte) 1);
		s.update();

		try {
			CustomSkull.setSkull(b, type.getData());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

}
