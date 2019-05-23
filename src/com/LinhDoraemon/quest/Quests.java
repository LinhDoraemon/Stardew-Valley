package com.LinhDoraemon.quest;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.cropstype.Cauliflower;
import com.LinhDoraemon.cropstype.Parsnip;
import com.LinhDoraemon.fishing.Fishes;

public class Quests {

	public static void register() {
		GETTING_STARTED();
		TO_THE_BEACH();
		DEEPER_IN_THE_MINE();
		EXPLORE_THE_MINES();
		JODI_REQUEST();
		MARNIE_REQUEST();
		PAM_IS_THIRSTY();
		RAISING_ANIMAL();
	}

	public static void GETTING_STARTED() {
		QuestManager q = new QuestManager("Khởi đầu", QuestType.DELIVERY_ITEM);
		q.setRequire(Parsnip.getParsnip().getItemMeta().getDisplayName());
		q.setRewardMoney(100);
		q.setContent("Nếu bạn muốn trở thành một nông dân, bạn sẽ phải bắt đầu từ những thứ cơ bản."
				+ " Sử dụng cuốc để cuốc đất lên. Dùng bình tưới nước để làm ướt mảnh đất vừa tưới."
				+ " Sau đó phải chuột vào mảnh đất với hạt giống trong tay để trồng nó ! Đợi nó lớn và thu hoạch thôi !");
		q.create();
	}

	public static void TO_THE_BEACH() {
		QuestManager q = new QuestManager("Tập làm ngư dân", QuestType.DELIVERY_ITEM);
		q.setRequire(Fishes.CARP().getItemMeta().getDisplayName());
		q.setRewardMoney(100);
		q.setContent("Xin chào ! Thời tiết dạo này thất thường quá, bạn cũng thấy vậy,"
				+ " phải không ? Hôm nay tôi vừa thu hoạch một số rau xà lách nên muốn"
				+ " nấu một chén canh cá chép. Nhưng tôi quên mua cá chép mất rồi ! Bạn"
				+ " có thể giúp tôi bắt một con không ? \n - Willy");
		q.create();
	}

	public static void RAISING_ANIMAL() {
		QuestManager q = new QuestManager("Chăn nuôi #1", QuestType.DELIVERY_ITEM);
		q.setRequire(StardewItems.EGG().getItemMeta().getDisplayName());
		q.setRewardMoney(210);
		q.setContent("Xây dựng một cái chuồng nho nhỏ cho mấy chú gà con lon ton. "
				+ "Sau đó đến nhà Marnie mua một con gà nhé. Giá cũng kha khá đó,"
				+ " đảm bảo bạn có đủ tiền nha ! Thêm nữa, bọn chúng ăn lúa mì nhé,"
				+ " hãy cố gắng trồng chúng thật nhiều vào mùa hè !");
		q.create();
	}

	public static void EXPLORE_THE_MINES() {
		QuestManager q = new QuestManager("Khám phá khu mỏ", QuestType.DELIVERY_ITEM);
		q.setRequire(StardewItems.COPPER_BAR().getItemMeta().getDisplayName());
		q.setRewardMoney(150);
		q.setContent("Khám phá những dãy hang động kỳ bí, từng thung lũng đá trong lòng đất,"
				+ " và đôi khi còn là khu mỏ bỏ hoang nữa ! Nhưng hãy coi chừng nhé, cũng "
				+ "không ít nguy hiểm đâu, rất nhiều loại quái vật đang chờ bạn đấy \n - Marlon");
		q.create();
	}
	
	public static void DEEPER_IN_THE_MINE() {
		QuestManager q = new QuestManager("Sâu trong khu mỏ", QuestType.DELIVERY_ITEM);
		q.setRequire(StardewItems.QUARTZ().getItemMeta().getDisplayName());
		q.setRewardMoney(150);
		q.setContent("Một số khoáng sản quý chỉ có thể kiếm được với"
				+ " phần trăm rất nhỏ từ mấy cục đá. Tại sao không cố"
				+ " gắng kiên trì để có hẳn một bộ sưu tập giá trị nhỉ ?"
				+ " \n - Blacksmiths");
		q.create();
	}

	public static void JODI_REQUEST() {
		QuestManager q = new QuestManager("Yêu cầu của Jodi", QuestType.DELIVERY_ITEM);
		q.setRequire(Cauliflower.getCauliflower().getItemMeta().getDisplayName());
		q.setRewardMoney(350);
		q.setContent("Chào bạn ! Nông trại của bạn dạo này thế nào ? Mọi "
				+ "thứ vẫn tốt cả chứ. Hôm nay tôi muốn hỏi bạn một vài cây"
				+ " súp lơ trắng được không ? Tôi đang cần một vài cây thật"
				+ " tươi để nấu trong công thức ! Cảm ơn bạn rất nhiều \n - Jodi");
		q.create();
	}
	
	public static void MARNIE_REQUEST() {
		QuestManager q = new QuestManager("Yêu cầu của Marnie", QuestType.DELIVERY_ITEM);
		q.setRequire(StardewItems.CAVE_CARROT().getItemMeta().getDisplayName());
		q.setRewardMoney(150);
		q.setContent("Bạn khỏe chứ ? Dạo này tôi đang nuôi thêm một vài"
				+ " con dê nhỏ và đang cố hết sức huấn luyện cho chúng "
				+ "biết nói vài từ đơn giản. Vì vậy cần phải chiều chúng một chút"
				+ " ! Bạn có cà rốt hang động không ? Cho tôi xin một ít nhé ! \n - Marnie");
		q.create();
	}
	
	public static void PAM_IS_THIRSTY() {
		QuestManager q = new QuestManager("Pam đang khát", QuestType.DELIVERY_ITEM);
		q.setRequire(StardewItems.WINE().getItemMeta().getDisplayName());
		q.setRewardMoney(250);
		q.setContent("Dạo này tôi hơi bị khát nước một chút, cho nên tôi "
				+ "nghĩ uống nước thì lại khát ngay thôi ! Cho nên tôi thử"
				+ " hỏi xem bạn có rượu nho không ? Tôi sẽ cảm kích vô cùng nếu bạn"
				+ " có thể cho tôi xin vài chai <3 \n - Pam");
		q.create();
	}
	
	
	
	
}
