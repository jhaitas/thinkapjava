class Date {
	public static void main(String[] args) {
		String day, month;
		int date, year;
		day = "Thursday";
		date = 1;
		month = "April";
		year = 2010;
		System.out.printf("American format:\n");
		System.out.printf("%s, %s %d, %d\n",day,month,date,year);
		System.out.printf("European format:\n");
		System.out.printf("%s %d %s, %d\n",day,date,month,year);
	}
}
