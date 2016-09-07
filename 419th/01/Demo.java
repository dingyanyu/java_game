
/* 数组和对象都属于引用数据类型
 * 
 */
class Demo {
	public static void main(String args[]){
		//二位数组的定义方法
		int arr[][] = {{1,2,3,4},{4,5,6,4},{7,8,9,1}};

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}


