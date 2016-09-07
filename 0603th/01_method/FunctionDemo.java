

class FunctionDemo {
	public static void main(String[] args) {
	
		System.out.println("---------------------");
		printStar(3, 6);
		System.out.println("---------------------");
		printStar(6, 7);
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


