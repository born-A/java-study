package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		
		char[] textArr = text.toCharArray();
		
		for(int i = 0; i < textArr.length; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(textArr[j]);
			}
			
			System.out.println();
		}

		
		scanner.close();
	}

}
