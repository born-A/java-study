package chapter03;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName( "nikon");
		camera.setPrice(400000);
		camera.setCountSold(10);
		camera.setCountStock(20);
		
		
		
		System.out.println("상품이름: " + camera.getName());
		camera.showInfo();
		
		// static 변수(클래스 변수)
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		System.out.println(Goods.countOfGoods);
		
		System.out.println(camera.calcDiscountPrice(0.5f));
		
	}
}
