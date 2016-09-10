
class ArrayTool {
		
	public static void printArray(int[] arr) {
			for(int x = 0; x < arr.length; x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]);
			} else {
				System.out.print(arr[x]+", ");
			}
		}	
	}
}