/*
某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
在传递过程中需要加密，加密规则如下：
	首先将数据倒序，然后将每位数字都加上5，在用和除以10的余数代替该数字，
	最后将第一位和最后一位数字交换。请任意给定一个小于8位的整数，
	然后，把加密后的结果在控制台打印出来。

题目要求：
A: 	数据是小于8位的整数
	定义一个int类型的数据
	int number = 123456;
B:加密规则
	a:首先将数据倒序，
		结果:654321
	b:然后将每位数字都加上5，再用和除以10的余数代替该数字
		结果：109876
	c:最后将第一位和最后一位数字交换
		结果：609871
C:把加密后的结果输出在控制台

分析:最难是把数据转换成数组

*/

import java.util.Scanner;

class EncryptDemo1 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//请输入一个数据
		System.out.println("请输入一个数据(小于8位):");
		int number = sc.nextInt();
		
		String result = encrypt(number);
		System.out.println("加密后的结果是:"+result);
		
	}
	/*
		需求：写一个功能，把数据number实现加密
		两个明确
		返回值类型: String 做一个字符串的拼接
		参数列表: int number
	 */
	 
	 public static String encrypt(int number) {
		 int[] arr = new int[8];
		 
		 //定义索引
		 int index = 0;
		 //把number中的数据放到数组中
		 while(number > 0) {
			 arr[index] = number%10;
			 index++;
			 number/= 10;
		 }
		 
		 //把数据加5，然后对10取得余数
		 for(int x = 0; x < index; x++) {
			 arr[x] += 5;
			 arr[x] %= 10;
		 }
		 
		 //把第一位和最后一位交换
		 int temp = arr[0];
		 arr[0] = arr[index - 1];
		 arr[index -1] = temp;
		 
		 //把数组的元素拼接成一个字符串返回
		 //定义一个空内容的字符串
		 String s = "";
		 
		 for(int x = 0; x < index; x++) {
			 s += arr[x];
		 }
		 
		 return s;
	 }
	
}



