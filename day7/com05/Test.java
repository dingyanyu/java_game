


/* class Info {
	public int sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

}

class  Test {
	public static void main(String[] args) {
		Info d = new Info();
		int result = d.sum();
		System.out.println(result);
	}
} */

/* class Info {
	public int sum(int a, int b) {
		return a + b;
	}

}

class  Test {
	public static void main(String[] args) {
		Info d = new Info();
		int a = 10;
		int b = 40;
		int result = d.sum(a, b);
		System.out.println(result);
	}
} */
/* 
class Info {
	int a;
	int b;
	public int sum() {
		return a + b;
	}

}

class  Test {
	public static void main(String[] args) {
		Info d = new Info();
		d.a = 60;
		d.b = 2;
		int result = d.sum();
		System.out.println(result);
	}
} */

import java.util.Scanner;


class Rectangle {
	private int length;
	private int width;
	
	public Rectangle() {
		
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getPerimeter() {
		return (length + width)*2;
	}
	
	public int getArea() {
		return length * width;
	}
	
}

class  Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长方形的长");
		int length = sc.nextInt();
		System.out.println("请输入长方形的宽");
		int width = sc.nextInt();
		
		Rectangle rt = new Rectangle();
		rt.setLength(length);
		rt.setWidth(width);
		
		System.out.println("Perimeter:"+rt.getPerimeter());
		System.out.println("Area:"+rt.getArea());
	}
}	
