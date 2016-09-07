

import java.util.Scanner;

class FunctionDemo3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("«Î ‰»Î1-9");
	int n = sc.nextInt();
	
	printNN(n);

	}

	public static void printNN(int n) {
		for(int x = 1; x <= n; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}


