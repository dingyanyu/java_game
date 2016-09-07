

import java.util.Scanner;
class SwitchDemo3 {
	public static void main(String[] args) {
		
		System.out.println("下面的几个人你最爱的谁?");
		System.out.println("65 林青霞");
		System.out.println("66 张曼玉");
		System.out.println("67 刘德华");
		System.out.println("68 王力宏");

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入你的选择:");
		int choiceNumber = sc.nextInt();

		//强制转换为字符类型
		char choice = (char)choiceNumber;

		switch(choice) {
			case 'A' :
				System.out.println("恭喜你，选择正确");
				break;
			case 'B' :
				System.out.println("不好意思，你选错了");
				break;
			case 'C' :
				System.out.println("不好意思，你选错了");
				break;
			case 'D' :
				System.out.println("不好意思，你选错了");
				break;
			default :
				System.out.println("没有该选项");
				break;
		}
		
	}
}


