package task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Input a");
		a = sc.nextDouble();
		double b;
		System.out.println("Input b");
		b = sc.nextDouble();
		double c;
		System.out.println("Input c");
		c = sc.nextDouble();
		if((a+b)>c&(a+c)>b&(b+c)>a) {
			 System.out.println("This is a triangle");
		}else{
		
			System.out.println("This isn't a triangle");
		}
		
		
		
	}

}
