package com.LinhDoraemon.quest;

public enum QuestType {

	GATHERING("§a§lThu thập"), SLAY_MONSTER("§3§lGiết quái"), FISHING("§e§lCâu cá"), DELIVERY_ITEM("§c§lGiao hàng");

	private String name;
	
	QuestType(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
