package paint;

public class ColorPoint extends Point{
	private String color;

	public ColorPoint(int x, int y, String color) {
//		setX(x);
//		setY(y);
		super(x,y);
		this.color = color;
	}
	
	@Override // 컴파일러가 컴파일할때 이 메서드가 오버라이드 한게 맞는지 확인함
	public void show() {
		System.out.println("점(x=" + x + ", y=" + y +", color=" + color + ")을 그렸습니다.");
	}
}
