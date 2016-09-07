
/*
	赋值运算符:
	基本的赋值运算符:
	扩展的赋值运算符:

 */

class Demo2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		 System.out.println("交换前");
		 System.out.println(a);
		 System.out.println(b);

		 System.out.println("交换后");

		 //方式1:使用第三方变量
		 /*
		 int c = a;
		 a = b;
		 b = c;
		 System.out.println(a);
		 System.out.println(b);
		*/

		 //方式2 : 用异或实现
		 a = a ^ b;
		 b = a ^ b;
		 a = a ^ b;

		 System.out.println(a);
		 System.out.println(b);
		 
	}
	 
}


