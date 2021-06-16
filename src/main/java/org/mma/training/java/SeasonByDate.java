package org.mma.training.java;
import java.util.Scanner;
public class SeasonByDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter Day");
		int day = sc.nextInt();
		System.out.println("Enter year");
		int year = sc.nextInt();
	
		switch(month) {
		case 12: case 1: case 2:
			System.out.println("Entered Date is  " + month+ '/'+day+'/'+year+    "This is Winter Season.");
		break;
		case 3: case 4: case 5:
			System.out.println("Entered Date is  " + month+ '/'+day+'/'+year+    "This is Spring Season.");
		break;case 6: case 7: case 8:
			System.out.println("Entered Date is  " + month+ '/'+day+'/'+year+    "This is Summer Season.");
		break;
		case 9: case 10: case 11:
			System.out.println("Entered Date is  " + month+ '/'+day+'/'+year+    "This is Autumn Season.");
		break;
		default:
		System.out.println("The entered Date is   "  + month+ '/'+day+'/'+year   +"is unvalid");
		break;
		}
		if (month > 12 && month <= 0) {
			System.out.println("Invalid Month.");		
			
		} else if (day > 31 && day <= 0);{
			System.out.println("Invalid Date");
//		}	else if (year > 1400 && year < 3000);}
//		System.out.println("Invalid year");
		}
		}
		}
		

