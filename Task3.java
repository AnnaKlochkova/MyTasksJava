package task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int days;
		int year;
		System.out.println("Input year");
		year = sc.nextInt();
		int C = year/100;
	   if((year%4==0)&(C % 400>0)){
			days= 366;
			System.out.println("Days="+days);
		}else{
			days=365;
			System.out.println("Days="+days);
		}
	}
	
}
