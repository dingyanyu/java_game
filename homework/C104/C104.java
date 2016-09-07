
import java.util.Scanner;

public class C104{
	public static int gbaPrice = 320;
	public static int gbaAmount = 5;
	public static int mp3Price = 260;
	public static int mp3Amount = 13;
	public static int people = 18;

	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		showInfo();

		System.out.print("Please input the gba price:");
		gbaPrice = myScanner.nextInt();
		System.out.print("Please input the mp3 price:");
		mp3Price = myScanner.nextInt();
		people = 30;
		showInfo();

		System.out.print("please input the gba amount:");
		gbaAmount = myScanner.nextInt();
		System.out.print("please input the mp3 amount");
		mp3Amount = myScanner.nextInt();
		gbaPrice = 320;
		mp3Price = 260;
		showInfo();
	}

	public static void showInfo(){
		int total = gbaPrice * gbaAmount + mp3Price * mp3Amount;
		float average = (float)total/people;
		System.out.printf("the total cost is %d, the average cost is %f.\n",total,average);
	}
}
