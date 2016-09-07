
/*
C#是模仿java来的

数组:存储同一种数据类型的多个元素的容器

int[] a;	//定义一个int类型的数组a变量
int a[];	//定义一个int类型的a数组变量 	


*/
class ArrayDemo1 {
	public static void main(String[] args) {
		int[] array = new int[10];

		array[0] = 100;
		array[2] = 200;

	System.out.println(array);
	for(int x = 0; x < array.length; x++) {
			System.out.println(array[x]);
		}
	}
	
}


