
/*
	所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身

 */

class ForDemo3 {
	public static void main(String[] args) {

		int count = 0;

		for(int x = 100; x < 1000; x++) {
			int unit = x%10;
			int ten = x/10%10;
			int hundred = x/10/10%10;

			if(x == (unit*unit*unit + ten*ten*ten + hundred*hundred*hundred)) {
			//	System.out.println(x);
				count++;
			}
		}

		System.out.println(count);

	}
}


