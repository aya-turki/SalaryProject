package org.mma.training.java;

import java.util.Random;
import java.util.Scanner;

	public class SalaryCalculator {

		static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {
			
			//initialize known values
			int salary =1000;
			int bonus1 = 250;
			int quota10 = 0;
			int quota20 = 20;
			int bonus2 = 500;
			int total1= salary+bonus1;
			int total2 = salary+bonus2;
			double tax = 20;

			//Get values of unknown 
			System.out.println("How many sales did the employee make this week?");
			int sales=scanner.nextInt();
			
			switch(sales) {
			
				   case 10:  case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:			  
				   System.out.println("Base Salary:"+salary);
				   System.out.println("Sale Bonus:" +bonus1);
				   System.out.println("Gross Total:" +total1);
				   System.out.println("Net Salary:" +(total1-tax));
				       break;	
				   case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
				   System.out.println(salary +bonus2);	
				       break;
				   default:
					   System.out.println("You need to work harder to get the bonus");
					   System.out.println(salary);   
				}
		}
	}
	
