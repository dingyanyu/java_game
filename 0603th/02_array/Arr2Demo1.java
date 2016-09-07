
/*
二维数组:就是元素为一维数组的一个数组。
格式1:
	数据类型[][] 数组名 = new 数据类型[m][n];
	m:表示这个二维数组有多少个一维数组。
	n:表示每一个一维数组的元素有多少个。

注意:
	A. 以下格式也可以表示二维数组
		a. 数据类型 数组名[][] = new 数据类型[m][n];
		b. 数据类型[] 数组名[] = new 数据类型[m][n];
	B. 注意下面定义的区别
		int x, y;
		int[]x, y[];    //x是一维数组，y是二维数组
		
	
*/

class Arr2Demo1 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
	
		System.out.println(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
	}
}



