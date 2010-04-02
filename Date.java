class Date {
	public static void printAmerican(String day,int date,String month,int year) {
		System.out.printf("American format:\n");
		System.out.printf("%s, %s %d, %d\n",day,month,date,year);
	}

	public static void printEuropean(String day,int date,String month,int year) {
		System.out.printf("European format:\n");
		System.out.printf("%s %d %s, %d\n",day,date,month,year);
	}

	public static void main(String[] args) {
		String day, month;
		int date, year;
		day = "Thursday";
		date = 1;
		month = "April";
		year = 2010;
		printAmerican(day,date,month,year);
		printEuropean(day,date,month,year);
	}
}
