/*

��ѭ�����Ƶ��Ƕ�ά����ĳ��ȣ���ʵ����һά����ĸ���
��ѭ�����Ƶ���һά����ĳ��ȡ�

*/

class Array2Test {
	public static void main(String[] args) {
		//����һ����ά����
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{1,2,3},{4,5},{6}};
		int[][] arr3 = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};

		int sum;
		sum = getSum(arr3);

		System.out.println("sum="+sum);
		
	//	printArray(arr2);
	}

/*
	����:������ά����
	������ȷ
	����ֵ����:void
	�����б�:int[][] arr

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


