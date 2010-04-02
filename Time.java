class Time {
	public static void main(String[] args) {
		int hour, minute, second;
		int secondsSinceMidnight, secondsRemainingInDay;
		double percentageDayPassed;
		hour = 19;
		minute = 24;
		second = 8;
		System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
		secondsSinceMidnight = second + (60 * minute) + (3600 * hour);
		System.out.printf("Seconds since midnight: %d\n",secondsSinceMidnight);
		secondsRemainingInDay = 86400-secondsSinceMidnight;
		System.out.printf("Seconds remaining in the day: %d\n",secondsRemainingInDay);
		percentageDayPassed = ( secondsSinceMidnight / 86400.0 ) * 100;
		System.out.printf("Percentage of day passed: %.2f%%\n",percentageDayPassed);
	}
}
