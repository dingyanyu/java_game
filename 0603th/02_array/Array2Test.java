/*

外循环控制的是二维数组的长度，其实就是一维数组的个数
内循环控制的是一维数组的长度。

*/

class Array2Test {
	public static void main(String[] args) {
		//定义一个二维数组
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{1,2,3},{4,5},{6}};
		int[][] arr3 = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};

		int sum;
		sum = getSum(arr3);

		System.out.println("sum="+sum);
		
	//	printArray(arr2);
	}

/*
	需求:遍历二维数组
	两个明确
	返回值类型:void
	参数列表:int[][] arr

 */
	public static void printArray(int[][] arr) {
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}		
	}

	public static int getSum(int[][] arr) {
		int sum = 0;

		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				sum += arr[x][y];
			}
		}		

		return sum; 
	}
}


