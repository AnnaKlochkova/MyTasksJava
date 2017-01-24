package task1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		System.out.println("Input a");
		a = sc.nextInt();
		System.out.println("Input b");
		b = sc.nextInt();
		System.out.println("Input c");
		c = sc.nextInt();
		System.out.println("Input d");
		d = sc.nextInt();
		if ((a > b) & (a > d)) {
			int max = a;
			System.out.println("Max a =" + a);
		} else {
			if (b > c) {
				int max = b;
				System.out.println("Max b=" + b);
			} else {
				if (c > d) {
					int max = c;
					System.out.println("Max c=" + c);
				} else {
					int max = d;
					System.out.println("Max d=" + d);
				}
			}
		}
	}

}
