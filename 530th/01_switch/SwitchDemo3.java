

import java.util.Scanner;
class SwitchDemo3 {
	public static void main(String[] args) {
		
		System.out.println("����ļ����������˭?");
		System.out.println("65 ����ϼ");
		System.out.println("66 ������");
		System.out.println("67 ���»�");
		System.out.println("68 ������");

		Scanner sc = new Scanner(System.in);

		System.out.println("���������ѡ��:");
		int choiceNumber = sc.nextInt();

		//ǿ��ת��Ϊ�ַ�����
		char choice = (char)choiceNumber;

		switch(choice) {
			case 'A' :
				System.out.println("��ϲ�㣬ѡ����ȷ");
				break;
			case 'B' :
				System.out.println("������˼����ѡ����");
				break;
			case 'C' :
				System.out.println("������˼����ѡ����");
				break;
			case 'D' :
				System.out.println("������˼����ѡ����");
				break;
			default :
				System.out.println("û�и�ѡ��");
				break;
		}
		
	}
}


