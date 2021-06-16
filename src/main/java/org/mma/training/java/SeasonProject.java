package org.mma.training.java;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

public class SeasonProject {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in the format of YYYYMMDD (e.g. 20210615)");
//		Date d = new Date(0,0,0);
		String dateStr= sc.nextLine(); 
		String month =dateStr;	
		month = dateStr.substring(4, 6); 
		int mcase = Integer.valueOf(month);
	
		switch(mcase) {
		case 12: case 1: case 2:
			System.out.println("This is Winter season");
			break;
		case 3: case 4: case 5:
			System.out.println("This is Spring Season");
			break;
		case 6: case 7: case 8:
			System.out.println("This is Summer Season");
			break;
		case 9: case 10: case 11:
			System.out.println("This is the Autum Season");
			break;
		default:
			System.out.println("Please enter a valid Date");
			break;
	
		}
	}
}


