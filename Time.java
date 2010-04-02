class Time {
	public static void main(String[] args) {
		int hour, minute, second, secondsSinceMidnight;
		hour = 19;
		minute = 8;
		second = 7;
		System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
		secondsSinceMidnight = second + (60 * minute) + (3600 * hour);
		System.out.printf("Seconds since midnight: %d\n",secondsSinceMidnight);
	}
}
