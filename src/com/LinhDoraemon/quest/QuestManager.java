package com.LinhDoraemon.quest;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;

public class QuestManager {

	public static List<String> QUESTS = new ArrayList<>();

	String name;
	QuestType type;
	String[] content;
	int reward_money;
	String require;

	public QuestManager(String name, QuestType type) {
		this.name = name;
		this.type = type;
	}

	public QuestManager() {

	}

	private boolean hasQuestYet(String quest_need_checking) {
		for (String s : QUESTS) {
			String[] part = s.split("•");
			String name = part[1];
			if (name.equalsIgnoreCase(quest_need_checking)) {
				return true;
			}
		}
		return false;
	}

	public QuestManager getQuest(String name) {
		for (String s : QUESTS) {
			Bukkit.getConsoleSender().sendMessage("S : " + s);
			String[] part = s.split("•");
			String name1 = part[1];
			Bukkit.getConsoleSender().sendMessage("name : " + name);
			String require = part[9];
			Bukkit.getConsoleSender().sendMessage("require : " + require);
			QuestType type = QuestType.valueOf(part[3]);
			Bukkit.getConsoleSender().sendMessage("type : " + type.toString());
			int reward = Integer.parseInt(part[7]);
			Bukkit.getConsoleSender().sendMessage("reward : " + reward);
			String[] content = part[5].split("◘");
			if (name.contains(name1)) {
				Bukkit.getConsoleSender().sendMessage("getQuest() : true");
				this.name = name1;
				this.type = type;
				this.content = content;
				this.reward_money = reward;
				this.require = require;
				return this;
			}
		}
		Bukkit.getConsoleSender().sendMessage("getQuest() : false");
		return null;
	}

	public void create() {
			QUESTS.add(toString());
	}

	public String getName() {
		return this.name;
	}

	public QuestType getType() {
		return this.type;
	}

	public void setContent(String... content) {
		this.content = content;
	}

	public String[] getContent() {
		return this.content;
	}

	public int getRewardMoney() {
		return this.reward_money;
	}

	public void setRewardMoney(int money) {
		this.reward_money = money;
	}

	public String getRequire() {
		return this.require;
	}

	public void setRequire(String require) {
		this.require = require;
	}

	public String toString() {
		return "QuestManager{name=•" + getName() + "•;type=•" + type.toString() + "•;content=•"
				+ String.join("◘", getContent()) + "•;money=•" + getRewardMoney() + "•;require=•" + getRequire() + "•}";
	}
}
