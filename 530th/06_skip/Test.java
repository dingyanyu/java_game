
/*
	需求:小芳的妈妈每天给她2.5元钱，她都会存起来，但是
	每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱
	请问，经过多少天，小芳才可以存到100元钱

*/

class Test {
	public static void main(String[] args) {
		/*
		double dayMoney = 2.5;
		double daySum = 0;
		double result = 100;

		int dayCount = 1;

		while(true) {
			daySum += dayMoney;

			if(daySum >= result) {
				System.out.println("共花了"+dayCount+"天存储了100元");
				break;
			}

			if(dayCount%5 == 0) {
				daySum -= 6;
				System.out.println("第"+dayCount+"天花了6元钱");
			}

			dayCount++;
		}

		System.out.println(daySum);
*/
		
		float pocket_money = 2.5F;
		int day = 1;
		
		while(true) {
			
			pocket_money += 2.5F;
			day++;
			if(day%5 == 0) {
				pocket_money -= 6;
				System.out.println("第"+day+"天花了6元钱");
			}

			if(pocket_money == 100) {
				System.out.println("第"+day+"天，小花存储了"+pocket_money+"元");
				break;
			}
		}

		System.out.println("经过"+day+"天，小芳才可以存到"+pocket_money+"元");

	}
}


