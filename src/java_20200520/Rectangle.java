package java_20200520;

public class Rectangle extends Shape {

	int w; //x y는 가져다쓰기
	int h;
	
	public void draw() { //오버라이딩
		System.out.println("Rectangle draw()");
	}
	
}
