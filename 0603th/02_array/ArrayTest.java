


class ArrayTest {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};

//		printArray(arr);

		int max = getArrayMax(arr);
		int min = getArrayMin(arr);

		System.out.println(max);

		System.out.println("-------------");
	}

	public static void printArray(int[] arr) {
		for(int x = 0; x < arr.length; x++) {
			if(x == arr.length-1){
				System.out.println(arr[x]);
			} else {
				System.out.print(arr[x]+",");
			}
		}
	}

	public static int getArrayMax(int[] arr) {
		int[] array = arr;
		int max = array[0];

		for(int x = 1; x < array.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}

		return max;
	}

	public static int getArrayMin(int[] arr) {
		int[] array = arr;
		int min = array[0];

		for(int x = 1; x < array.length; x++) {
			if(arr[x] < min) {
				min = arr[x];
			}
		}

		return min;
	}
	
}

