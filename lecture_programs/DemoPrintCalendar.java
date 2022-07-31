package lecture_programs;

import java.util.Scanner;

public class DemoPrintCalendar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter full year (e.g. 2020): ");
		int year = input.nextInt();
		System.out.print("Please enter month number: ");
		int month = input.nextInt();

		printCalendar(year,month);
	}

	public static void printCalendar(int year, int month) {
		printHeader(year,month);
		printMonthBody(year,month);
		printFooter();
	}
	
	public static void printHeader(int year, int month) {
		System.out.println("----------------------------");
		System.out.println("\t"+getMonthName(month)+" "+year);
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	public static String getMonthName(int month) {
		switch(month) {
			case 1: return "January";
			case 2: return "Febuary";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
		}
		return "";
	}
	
	public static void printMonthBody(int year,int month) {
		
		int startDay = getStartDay(year,month);
		
		for(int i=1;i<=startDay;i++)
		{
			System.out.print("    ");
		}
		for(int i=1;i<=getMonthDays(year,month);i++)
		{
			System.out.printf("%4d",i);
			if((startDay+i)%7==0)
				System.out.println();
		}
		
	}
	
	public static int getMonthDays(int year,int month) {
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			return 31;
		else if(month==4 || month==6 || month==9 || month==11)
			return 30;
		else if(isLeapYear(year))
			return 29;
		else 
			return 28;
	}
	
	public static int getStartDay(int year, int month) {
		int startDay=(year-1) + ((year-1)*97/400) +1;
		
		for(int i=1;i<month;i++)
			startDay+=getMonthDays(year,i);
		
		return startDay%7;
	}
	
	public static void printFooter() {
		System.out.println("\n----------------------------");
		System.out.println("Created by 4PC1 class");
	}
	
	public static boolean isLeapYear(int year) {
		if(year%400==0 || (year%4==0 && year%100!=0))
			return true;
		else
			return false;
	}
}
