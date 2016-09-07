
//数组元素逆序(就是把元素对调)

import java.util.Scanner;
class ArrayDemo5 {
	public static void main(String[] args) {
		int[] arr = {12, 98, 50, 34, 76};
		String[] strArray = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday",
			"Sunday"};

		Scanner sc = new Scanner(System.in);
		System.out.println("please input a data(0-6):");
		int index = sc.nextInt();
		System.out.println("你要查找的日期是: "+ strArray[index]);
			
	}

	public static void reverse(int[] array) {

		for(int i = 0; i < array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
	}

	public static void reverse2(int[] array) {

		for(int start=0,end = array.length -1; start <= end; start++,end--){
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
		}
	}

}


