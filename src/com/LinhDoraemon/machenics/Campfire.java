package com.LinhDoraemon.machenics;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

public class Campfire implements Listener {

	private static String CAMFIRE_OFF = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA"
			+ "6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmQ"
			+ "3NDI4MzlkMzQxMjVkMTI4ZGY0ZTIzZWI2Mzc0OTgyYWM2N"
			+ "2Q3MmNiZjYzOTI1ZWQ2OTFlOTNjMjRlZmMzNyJ9fX0=";
	private static String CAMFIRE_ON = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InV" + "ybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3Rl"
			+ "eHR1cmUvYTBkN2FiMmMxYzhiNDlmMWM2ZTgxMmExOTBlOWQyY"
			+ "Tg3N2U4NjE0ZmM1YzVmMmNlNjNhNWE1ZDhhYzZiMGQ0In19fQ==";

	private static String getData(boolean onoff) {
		if (onoff == true) {
			return CAMFIRE_ON;
		} else {
			return CAMFIRE_OFF;
		}
	}

	public static ItemStack getCamfire() {
		
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		
		CSkull.skullWithBase64(i,"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh"
				+ "0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L"
				+ "3RleHR1cmUvYmQ3NDI4MzlkMzQxMjVkMTI4ZGY0ZT"
				+ "IzZWI2Mzc0OTgyYWM2N2Q3MmNiZjYzOTI1ZWQ2OTFl"
				+ "OTNjMjRlZmMzNyJ9fX0=");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lLửa trại");
		SimpleItem.addLore(mt, "", "§fCung cấp lượng ánh sáng vừa đủ.", "", HashTag.TYPE_FURNITURE);
		i.setItemMeta(mt);
		return i;
		
	}
	
	@EventHandler
	public void nguoichoiinteractvoicamfire(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		Block b = e.getClickedBlock();
		
		if(b == null) {
			return;
		}
		
		if(b.getType() != Material.SKULL) {
			return;
		}
		
		if(isCamfire(b)) {
			if(isOff(b)) {
				try {
					CustomSkull.setSkull(b, CAMFIRE_ON);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				p.playSound(p.getLocation(), Sound.ITEM_FIRECHARGE_USE, 1, 1);
				return;
			}
			if(isOn(b)) {
				try {
					CustomSkull.setSkull(b, CAMFIRE_OFF);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				p.playSound(p.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 1, 1);
				return;
			}
		}
		
	}

	@EventHandler
	public void dapcaicampfirera(BlockBreakEvent e) {
		
		Block b = e.getBlock();
		
		if(b == null) {
			return;
		}
		
		if(b.getType() != Material.SKULL) {
			return;
		}
		
		if(isCamfire(b) == true) {
			e.setCancelled(true);
			b.setType(Material.AIR);
			b.getWorld().dropItemNaturally(b.getLocation(), getCamfire());
		}
		
	}

	private boolean isCamfire(Block b) {
		try {
			if (CustomSkull.getTexture(b).equals(CAMFIRE_OFF) || CustomSkull.getTexture(b).equals(CAMFIRE_ON)) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		
	}
	
	private boolean isOff(Block b) {
		try {
			if (CustomSkull.getTexture(b).equals(getData(false))) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		
	}
	
	private boolean isOn(Block b) {
		try {
			if (CustomSkull.getTexture(b).equals(getData(true))) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		
	}

}
