
/*
		�������Ǻ������������Ƿ���
 */

import java.util.Scanner;
class Demo1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();

		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		
	//	int result = getMax(a, b);
	//	System.out.println("��������"+result);
		boolean flag = compare(a, b);
		System.out.println(flag);
	}	

	public static int sum(int x, int y) {
		return x + y;
	}

	public static int getMax(int a, int b) {
		return ((a > b) ? a : b);
	}

	public static boolean compare(int a, int b) {
		return (a==b);
	}
}


