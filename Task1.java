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
		if (a > b)  {
			int max = a;
			System.out.println("Max a =" + a);
		} else {
			max=b;
			System.out.println("Max b =" + b);
			if (c > max) {
				System.out.println("Max c=" + c);
			} else {
					System.out.println("Max d=" + d);
				}
			}
		}
	}

}
