package exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Input a");
		a = sc.nextInt();
		int b = a / 10000;
		int c = a % 10000 / 1000;
		int d = a % 1000 / 100;
		int e = a % 100 / 10;
		int f = a % 10;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
