
/*
C#��ģ��java����

����:�洢ͬһ���������͵Ķ��Ԫ�ص�����

int[] a;	//����һ��int���͵�����a����
int a[];	//����һ��int���͵�a������� 	


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


