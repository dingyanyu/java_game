/*
ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
	���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
	��󽫵�һλ�����һλ���ֽ��������������һ��С��8λ��������
	Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������

��ĿҪ��
A: 	������С��8λ������
	����һ��int���͵�����
	int number = 123456;
B:���ܹ���
	a:���Ƚ����ݵ���
		���:654321
	b:Ȼ��ÿλ���ֶ�����5�����úͳ���10���������������
		�����109876
	c:��󽫵�һλ�����һλ���ֽ���
		�����609871
C:�Ѽ��ܺ�Ľ������ڿ���̨

����:�����ǰ�����ת��������

*/

import java.util.Scanner;

class EncryptDemo1 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//������һ������
		System.out.println("������һ������(С��8λ):");
		int number = sc.nextInt();
		
		String result = encrypt(number);
		System.out.println("���ܺ�Ľ����:"+result);
		
	}
	/*
		����дһ�����ܣ�������numberʵ�ּ���
		������ȷ
		����ֵ����: String ��һ���ַ�����ƴ��
		�����б�: int number
	 */
	 
	 public static String encrypt(int number) {
		 int[] arr = new int[8];
		 
		 //��������
		 int index = 0;
		 //��number�е����ݷŵ�������
		 while(number > 0) {
			 arr[index] = number%10;
			 index++;
			 number/= 10;
		 }
		 
		 //�����ݼ�5��Ȼ���10ȡ������
		 for(int x = 0; x < index; x++) {
			 arr[x] += 5;
			 arr[x] %= 10;
		 }
		 
		 //�ѵ�һλ�����һλ����
		 int temp = arr[0];
		 arr[0] = arr[index - 1];
		 arr[index -1] = temp;
		 
		 //�������Ԫ��ƴ�ӳ�һ���ַ�������
		 //����һ�������ݵ��ַ���
		 String s = "";
		 
		 for(int x = 0; x < index; x++) {
			 s += arr[x];
		 }
		 
		 return s;
	 }
	
}



