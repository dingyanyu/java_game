/*
需求:写一个java程序，把"hello world"这句话输出到控制台

不同进制的数据表现
二进制:	由0, 1组成 以0b开头
八进制: 由0,1...7组成 以0开头
十进制: 由0,1...9组成，默认整数是十进制
十六进制:由0,1...9,b,c,d,e,f(大小写均可)组成


*/

class Comment {
	public static void main(String[] args) { 
	System.out.println("hello" + 'a' + 1);
	System.out.println('a' + 1 + "hello");
	System.out.println("5+5="+5+5);
	System.out.println(5+5+"=5+5");

	}
}


