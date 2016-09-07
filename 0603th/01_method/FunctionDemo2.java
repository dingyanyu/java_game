

import java.util.Scanner;

class FunctionDemo2 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("请输入行数");
	int m = sc.nextInt();

	System.out.println("请输入列数");
	int n = sc.nextInt();

	printStar(m, n);
		
	}

	public static void printStar(int row, int column) {
		for(int x = 0; x < row; x++) {
			for(int y = 0; y < column; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


