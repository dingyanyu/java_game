
/*
	��ֵ�����:
	�����ĸ�ֵ�����:
	��չ�ĸ�ֵ�����:

 */

class Demo2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		 System.out.println("����ǰ");
		 System.out.println(a);
		 System.out.println(b);

		 System.out.println("������");

		 //��ʽ1:ʹ�õ���������
		 /*
		 int c = a;
		 a = b;
		 b = c;
		 System.out.println(a);
		 System.out.println(b);
		*/

		 //��ʽ2 : �����ʵ��
		 a = a ^ b;
		 b = a ^ b;
		 a = a ^ b;

		 System.out.println(a);
		 System.out.println(b);
		 
	}
	 
}


