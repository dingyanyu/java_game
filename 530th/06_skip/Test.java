
/*
	����:С��������ÿ�����2.5ԪǮ�������������������
	ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ
	���ʣ����������죬С���ſ��Դ浽100ԪǮ

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
				System.out.println("������"+dayCount+"��洢��100Ԫ");
				break;
			}

			if(dayCount%5 == 0) {
				daySum -= 6;
				System.out.println("��"+dayCount+"�컨��6ԪǮ");
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
				System.out.println("��"+day+"�컨��6ԪǮ");
			}

			if(pocket_money == 100) {
				System.out.println("��"+day+"�죬С���洢��"+pocket_money+"Ԫ");
				break;
			}
		}

		System.out.println("����"+day+"�죬С���ſ��Դ浽"+pocket_money+"Ԫ");

	}
}


