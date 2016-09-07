

import java.util.Scanner;
class SwitchDemo4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入你要判断的字符串");
		String s = sc.nextLine();
		
		switch(s) {
			case "hello" :
				System.out.println("你输入的是hello");
				break;
			case "world" :
				System.out.println("你输入的是world");
				break;
			case "java" :
				System.out.println("你输入的是java");
				break;
			default:
				System.out.println("没有找到你输入的数据");
			//	break;
		}
	}
}


