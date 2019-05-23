package com.LinhDoraemon.cutscenes;

import org.bukkit.entity.Player;

public class Scenes {

	private static final String PIERRE = "§6§lPierre §7§l> §f";
	private static final String JOJA = "§9§lÔng chủ Joja §7§l> §f";

	public static final void SCENES_1(Player p) {
		API.startScenes(p);
		API.sendMessage(p, PIERRE + "Chào mừng bạn đã đến với cửa hàng tạp hóa của Pierre. Muốn mua gì nào ?", 2);
		API.sendMessage(p, "", 4);
		API.playSound(p, SoundType.OPEN_DOOR);
		API.sendMessage(p, JOJA + "Ahem !", 6);
		API.playSound(p, SoundType.CLEARING_THROAT);
		API.sendMessage(p, "§d*Mọi người xung quanh chú ý vào ông ta*", 8);
		API.sendMessage(p, JOJA
				+ "Hãy lại đây nào, cơ hội ngàn năm có một đấy ! Phiếu giảm giá 50% cho tất cả các mặt hàng ở siêu thị Joja. Hãy nhận lấy đi !",
				10);
		API.sendMessage(p, PIERRE + "CÁI GÌ !?!? 50 PHẦN TRĂM ?", 12);
		API.sendMessage(p, "§d*Mọi người nhao nhao đi về phía ông ta, nhận lấy phiếu giảm giá*", 14);
		API.sendMessage(p, "§6*Ông ta cũng rời đi*", 16);
		API.playSound(p, SoundType.CLOSE_DOOR);
		API.sendMessage(p, PIERRE
				+ "Ôi trời ! Tôi sẽ chẳng thể nào có thể chạy theo cái giá vô lý đó được. Nếu bán thì chắc chắn tôi sẽ phải chịu lỗ ! §a§o*thở dài*",
				18);
		API.endScenes(p, 20);
		return;
	}

}
