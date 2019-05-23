package com.LinhDoraemon.cutscenes;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public enum SoundType {

	CLEARING_THROAT("ENTITY_VILLAGER_AMBIENT", "§e§lTiếng hắng giọng"),
	CLOSE_DOOR("BLOCK_WOODEN_DOOR_CLOSE", "§c§lTiếng đóng cửa"),
	OPEN_DOOR("BLOCK_WOODEN_DOOR_OPEN", "§e§lTiếng mở cửa");
	
	private String sound;
	private String title;
	
	SoundType(String sound, String title) {
		this.sound = sound;
	}
	
	public void play(Player p) {
		p.playSound(p.getLocation(), Sound.valueOf(sound), 1, 1);
	}
	
	public String getTitle() {
		return title;
	}
}
