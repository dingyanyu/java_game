
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
		
		System.out.println("�������һ��������");
		int num1 = sc.nextInt();
				
		System.out.println("������ڶ���������");
		int num2 = sc.nextInt();
		
		MyMath mm = new MyMath();
		
		System.out.println("�ӷ������"+mm.add(num1, num2));
		System.out.println("���������"+mm.subtraction(num1, num2));
		System.out.println("�˷������"+mm.multiply(num1,num2));
		System.out.println("���������"+mm.div(num1,num2));
		
	}
}


