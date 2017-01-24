package task2s;

import java.util.Scanner;

public class Task2S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int flat;
		System.out.println("Input apartment number");
		flat = sc.nextInt();
		int floor;
		int enter;
		x = flat % 4;
		if (x == 0){
			floor = x;
			System.out.println("Floor =" + floor);
		}else{
			x = flat / 4;
			floor=x+1;
			System.out.println("Floor =" + floor);
			y = flat % 36;
			if (y == 0){
				enter=y;
				System.out.println("Enter =" + enter);
			}else{	
				y=flat/36;
				enter=y+1;
				System.out.println("Enter =" + enter);
			}
		}
	}

}
