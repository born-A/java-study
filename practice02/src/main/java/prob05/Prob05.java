package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		
		while( true ) {
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
			int min = 1;
			int max = 100;
			int count = 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println(min + "-" + max);
			
			while(true) {
				
				System.out.print(count + ">>");
				
				count++;
				int k = scanner.nextInt();
				
				if(k < correctNumber) {
					System.out.println("더 높게");
					min = k;
					System.out.println(min + "-" + max);
				} else if(k > correctNumber){
					max = k;
					System.out.println("더 낮게");
					System.out.println(min + "-" + max);
				} else {
					System.out.println("맞았습니다.");
					//새 게임 여부 확인하기
					System.out.print( "다시 하겠습니까(y/n)>>" );
					String answer = scanner.next();
					if( "y".equals( answer ) == false ) {
						scanner.close();
						return;
					} else {
						break;
					}
				}
				
				
			}
		}
	}

}