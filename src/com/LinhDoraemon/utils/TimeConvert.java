package com.LinhDoraemon.utils;

public class TimeConvert {

	public static String timeLeft(int timeoutSeconds) {
		int days = (int) (timeoutSeconds / 86400);
		int hours = (int) (timeoutSeconds / 3600) % 24;
		int minutes = (int) (timeoutSeconds / 60) % 60;
		int seconds = timeoutSeconds % 60;
		return (days > 0 ? " " + days + " ngày" + (days != 1 ? "" : "") : "")
				+ (hours > 0 ? " " + hours + " giờ" + (hours != 1 ? "" : "") : "")
				+ (minutes > 0 ? " " + minutes + " phút" + (minutes != 1 ? "" : "") : "")
				+ (seconds > 0 ? " " + seconds + " giây" + (seconds != 1 ? "" : "") : "");
	}

	public static String MCTime(long time) {
		int hours = (int) ((time / 1000 + 8) % 24);
		int minutes = (int) (60 * (time % 1000) / 1000);
		return String.format("%02d:%02d", hours, minutes);
	}

}
