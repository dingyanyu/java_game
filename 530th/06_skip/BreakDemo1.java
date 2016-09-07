

//跳出单层循环
//跳出多层循环


class BreakDemo1 {
	public static void main(String[] args) {
		
		for(int x = 0; x < 10; x++) {
			if(x == 3) {
				break;
			}

			System.out.println("hello world");
		}

		System.out.println("over");
		System.out.println("------------------------");

	 wc:for(int x = 0; x < 3; x++) {
			nc:for(int y = 0; y < 4; y++) {
				if(y == 2){
					break wc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
