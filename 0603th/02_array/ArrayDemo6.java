
/*
需求:数组元素查找(查找指定元素第一次在数组中出现的索引)

	分析:
		定义一个数组，并静态初始化
		写一个功能实现
			遍历数组，依次获取数组中的每一个元素，和已知的数据进行比较
			如果相等，就返回当前的索引值。


*/
class ArrayDemo6 {
	public static void main(String[] args){ 
		int[] arr = {200, 250, 38, 888, 444};

		int index = getIndex2(arr, 250);
		System.out.println("index:"+index);
		
	}

	/*
		需求:查找指定数据在数组中第一次出现的索引
		两个明确:
			返回值类型:int
			参数列表:int[] arr, int value
	*/
	public static int getIndex(int[] arr, int value) {
		for(int x = 0; x < arr.length; x++) {
			if(arr[x] == value) {
				return x;
			}
		}
		return -1;
	}

	public static int getIndex2(int[] arr, int value) {
		int index = -1;
		
		for(int x = 0; x < arr.length; x++) {
			if(arr[x] == value) {
				index = x;
				break;
			}
		}
			return index;
	}
}


