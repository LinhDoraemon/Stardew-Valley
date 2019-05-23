package com.LinhDoraemon.fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Skull;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewFruits;

import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

public enum FruitTreeAPI {
	
	APPLE("§c§lCây táo", StardewFruits.APPLE(), true, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly" + "90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMz"
			+ "VlMmUwOTU5NzEyZGNkMzM1N2NjM2NlYTg1Zjk5YjNmZD"
			+ "gwOTc4NTVjNzU0YjliMTcxZjk2MzUxNDIyNWQifX19"),
	PEACH("§d§lCây đào", StardewFruits.PEACH(), true, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6" + "Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQ"
			+ "ubmV0L3RleHR1cmUvOWJkMjgzNDA1MmZlZm" + "RiYTdiMTlkMDFkODYzNDI5YjI3MTVjNzExNG"
			+ "QzZjlmODFjZGI3ZTgyNjE3ZTdlOTgifX19"),
	ORANGE("§6§lCây cam", StardewFruits.ORANGE(), true, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dH" + "A6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1"
			+ "cmUvOWZkMGUzMzBhNjg4ZDhiYjk1MTliZWZlMWJmY" + "zM0MzM3YjM3MWFjNzUxNTAyMTZmZGQwMzk1OWViN2"
			+ "I0NCJ9fX0="),
	CHERRY("§d§lCây sơ-ri", StardewFruits.CHERRY(), true, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly" + "90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUy"
			+ "NTcwNzY5NmJjZDE1YTE3MzA1NmZhMzkyOTZlODBmZjQxMT"
			+ "Y4YmIwYWRkNTUyZjQ1MjNlMjU1OGEzMTE5In19fQ=="),
	POMEGRANATE("§d§lCây lựu", StardewFruits.POMEGRANATE(), true,
			"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7I" + "nVybCI6Imh0dHA6Ly90ZXh0dXJlcy" + "5taW5lY3JhZnQubmV0L3RleHR1cmUvM"
					+ "mQ5ZDNkZGQxZWJkOTQ0OGE2ZGM0ZWU0Z" + "mI5MTgzZDhmYzY4ZDQzNDY4ODE4OW"
					+ "E3MzU2MWZkNmZmODVmMDRiIn19fQ==");

	private String colorname;
	private ItemStack toItemStack;
	private boolean canbeplant;
	private String data;

	FruitTreeAPI(String colorname, ItemStack toItemStack, boolean canbeplant, String data) {
		this.colorname = colorname;
		this.toItemStack = toItemStack;
		this.canbeplant = canbeplant;
		this.data = data;
	}

	public String getName() {
		return this.colorname;
	}

	public ItemStack toItemStack() {
		return this.toItemStack;
	}

	public boolean canBePlanted() {
		return this.canbeplant;
	}
	
	public String getData() {
		return this.data;
	}

	private static BlockFace[] bf = { BlockFace.NORTH, BlockFace.NORTH_EAST, BlockFace.EAST, BlockFace.SOUTH_EAST,
			BlockFace.SOUTH, BlockFace.SOUTH_WEST, BlockFace.WEST, BlockFace.NORTH_WEST };
	
	private void setSkull(Block b, String data) {
		b.setType(Material.SKULL);

		Skull s = (Skull) b.getState();
		s.setSkullType(SkullType.PLAYER);
		s.setRotation(bf[new Random().nextInt(bf.length)]);
		s.setRawData((byte) 1);
		s.update();

		try {
			CustomSkull.setSkull(b, data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static List<String> getFruits(){
		List<String> l = new ArrayList<String>();
		FruitTreeAPI[] api = FruitTreeAPI.values();
		
		for(int i = 0; i < api.length; i++) {
			l.add(api[i].getData());
		}
		return l;
	}
	
	public void harvest(Block b) {
		Block up = b.getRelative(BlockFace.UP);
		
		b.setType(Material.AIR);
		b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, Material.LEAVES);
		up.getWorld().dropItemNaturally(up.getLocation(), toItemStack());
		return;
	}
	
	public void plant(Block log) {
		
		Block leaves1 = log.getRelative(BlockFace.UP);
		Block leaves1_up = leaves1.getRelative(BlockFace.UP);
		Block leaves1_n = leaves1.getRelative(BlockFace.NORTH);
		Block leaves1_s = leaves1.getRelative(BlockFace.SOUTH);
		Block leaves1_e = leaves1.getRelative(BlockFace.EAST);
		Block leaves1_w = leaves1.getRelative(BlockFace.WEST);
		
		Block fruit1 = leaves1_up.getRelative(BlockFace.UP);
		Block fruit2 = leaves1_n.getRelative(BlockFace.UP);
		Block fruit3 = leaves1_s.getRelative(BlockFace.UP);
		
		log.setType(Material.LOG);
		leaves1.setType(Material.LEAVES);
		leaves1_up.setType(Material.LEAVES);
		leaves1_n.setType(Material.LEAVES);
		leaves1_s.setType(Material.LEAVES);
		leaves1_e.setType(Material.LEAVES);
		leaves1_w.setType(Material.LEAVES);
		
		fruit1.setType(Material.LEAVES);
		setSkull(fruit1, getData());
		fruit2.setType(Material.LEAVES);
		setSkull(fruit2, getData());
		fruit3.setType(Material.SKULL);
		setSkull(fruit3, getData());
		
		return;
		
	}

}
