package chapter03;

public class Goods2App {

	public static void main(String[] args) {
		Goods2 goods = new Goods2();
		
		//public은 접근 제한이 없다.
		goods.name = "camera";
		
		//protected눈 같은 패키지 접근이 가능하
		// 더 중요한 것은 자식에서 접근이 가능하다.
		//goods.price = 20000;
		
		//디폴트는 같은 패키지에서 접근이 가능하다.
		// goods.countStock = 10;

	}

}