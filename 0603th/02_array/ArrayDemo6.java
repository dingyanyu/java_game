
/*
����:����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)

	����:
		����һ�����飬����̬��ʼ��
		дһ������ʵ��
			�������飬���λ�ȡ�����е�ÿһ��Ԫ�أ�����֪�����ݽ��бȽ�
			�����ȣ��ͷ��ص�ǰ������ֵ��


*/
class ArrayDemo6 {
	public static void main(String[] args){ 
		int[] arr = {200, 250, 38, 888, 444};

		int index = getIndex2(arr, 250);
		System.out.println("index:"+index);
		
	}

	/*
		����:����ָ�������������е�һ�γ��ֵ�����
		������ȷ:
			����ֵ����:int
			�����б�:int[] arr, int value
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


