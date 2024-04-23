package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* 코드 작성 */
		int cnt = 1;
		
		while(cnt < 4) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scanner.nextInt();
			
			if(num % 2 == 1) {
				System.out.println("결과 값 : " + getOddSum(num));
			} else {
				System.out.println("결과 값 : " + getEvenSum(num));
			}
			
			System.out.println();
			
			cnt++;
		}
		
		scanner.close();
	}
	
	private static int getOddSum(int odd) {
		int sum = 0;
		for(int i = 0; i <= odd; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	private static int getEvenSum(int even) {
		int sum = 0;
		for(int i = 0; i <= even; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
}
