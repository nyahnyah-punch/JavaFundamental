package java_20200520;

public class ShapeDemo {
	//추상 클래스의 다형성 
	public static void run(Shape s) { //Shape s = 공통부모
		s.draw(); //Shape의 하위클래스에서만 가능 
	}
	
	/* 이렇게 번잡하게 살지 말자..
	public static void run(Triangle t) {
		t.draw();
	}
	
	public static void run(Circle c) {
		r.draw();
	}
	
	public static void run(Rectangle r) {
		r.draw();
	}
	*/

	public static void main(String[] args) {
		// 추상클래스는 객체를 생성할 수 없다
		// Shape s1 = new Shape();
		
		Rectangle r1 = new Rectangle();
		run(r1);
		
		Circle c1 = new Circle();
		run(c1);
		
		Triangle t1 = new Triangle();
		run(t1);
	}

}
