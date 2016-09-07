

import java.util.Scanner;

class SwitchDemo5 {
	public static void main(String[] args) {
		//´´½¨¼üÅÌÂ¼Èë¶ÔÏó
		Scanner sc = new Scanner(System.in);

		//Â¼ÈëÊı¾İ
		System.out.println("ÇëÊäÈëÔÂ·İ(1-12): ");
		int month = sc.nextInt();
/*
		switch(month) {
			case 1:
				System.out.println("¶¬¼¾");
				break;
			case 2:
				System.out.println("¶¬¼¾");
				break;
			case 3:
				System.out.println("´º¼¾");
				break;
			case 4: 
				System.out.println("´º¼¾");
				break;
			case 5:
				System.out.println("´º¼¾");
				break;
			case 6:
				System.out.println("ÏÄ¼¾");
				break;
			case 7:
				System.out.println("ÏÄ¼¾");
				break;
			case 8:
				System.out.println("ÏÄ¼¾");
				break;
			case 9:
				System.out.println("Çï¼¾");
				break;
			case 10:
				System.out.println("Çï¼¾");
				break;
			case 11:
				System.out.println("Çï¼¾");
				break;
			case 12:
				System.out.println("¶¬¼¾");
				break;
			default:
				System.out.println("ÊäÈëµÄÔÂ·İÓĞÎó");
		}
*/
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("¶¬¼¾");
				break;
			case 3:
			case 4: 
			case 5:
				System.out.println("´º¼¾");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("ÏÄ¼¾");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("Çï¼¾");
				break;
			default:
				System.out.println("ÊäÈëµÄÔÂ·İÓĞÎó");
		}

	}
}


