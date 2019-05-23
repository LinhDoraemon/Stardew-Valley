package com.LinhDoraemon.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.TextComponent;

public class Messenger {

	public static void sendAllMessages(String msg) {
		for (Player p : Bukkit.getOnlinePlayers()) {
			p.sendMessage(msg);
		}
	}

	public static void sendAllActionBar(String msg) {

		for (Player p : Bukkit.getOnlinePlayers()) {
			p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(msg));
		}
	}

	public static void sendActionBar(Player p, String msg) {

		p.spigot().sendMessage(ChatMessageType.ACTION_BAR,
				new ComponentBuilder(msg)
						.create());

	}

	public static void sendAllActionBar(int msg) {

		for (Player p : Bukkit.getOnlinePlayers()) {
			p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(Integer.toString(msg)));
		}

	}

}
