

class ReturnDemo {
	public static void main(String[] args) {
		for(int x = 0; x < 10; x++) {
			if(x == 2) {
				System.out.println("exit");
				return;
			}
			System.out.println(x);
		}

		System.out.println("over");
	}
}


