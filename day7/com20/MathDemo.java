
import java.util.Scanner;

class MyMath {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtraction(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
}

class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个操作数");
		int num1 = sc.nextInt();
				
		System.out.println("请输入第二个操作数");
		int num2 = sc.nextInt();
		
		MyMath mm = new MyMath();
		
		System.out.println("加法结果："+mm.add(num1, num2));
		System.out.println("减法结果："+mm.subtraction(num1, num2));
		System.out.println("乘法结果："+mm.multiply(num1,num2));
		System.out.println("除法结果："+mm.div(num1,num2));
		
	}
}


