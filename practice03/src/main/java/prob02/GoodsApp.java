package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i = 0; i < 3; i++) {
			String input = scanner.nextLine();
			String[] inputChange = input.split(" ");
			String name = inputChange[0];
			int price = Integer.parseInt(inputChange[1]);
			int stock = Integer.parseInt(inputChange[2]);
			Goods one = new Goods(name, price, stock);
			
			goods[i] = one;
		}
		// 상품 출력
		for(Goods a : goods) {
			System.out.println(a.getName() + "(가격:" + a.getPrice() + "원)이 " + a.getStock() +"개 입고 되었습니다.");
		}
		
		// 자원정리
		scanner.close();
	}
}
