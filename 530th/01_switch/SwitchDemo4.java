

import java.util.Scanner;
class SwitchDemo4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("��������Ҫ�жϵ��ַ���");
		String s = sc.nextLine();
		
		switch(s) {
			case "hello" :
				System.out.println("���������hello");
				break;
			case "world" :
				System.out.println("���������world");
				break;
			case "java" :
				System.out.println("���������java");
				break;
			default:
				System.out.println("û���ҵ������������");
			//	break;
		}
	}
}


