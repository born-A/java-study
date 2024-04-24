package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액: ");
		int money = scanner.nextInt();
		System.out.println();
		
		for(int a : MONEYS) {
			System.out.print(a + "원: ");
			if(money / a > 0) {
				System.out.print(money / a + "개");
			}
			
			money %= a;
			System.out.println();
		}
		
		scanner.close();
 	}
}