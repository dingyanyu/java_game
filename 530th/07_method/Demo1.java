
/*
		方法就是函数，函数就是方法
 */

import java.util.Scanner;
class Demo1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据");
		int b = sc.nextInt();
		
	//	int result = getMax(a, b);
	//	System.out.println("最大的数是"+result);
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


