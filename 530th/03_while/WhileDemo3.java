

class WhileDemo3 {
	public static void main(String[] args) {
		//����һ��ͳ�Ʊ�����Ĭ��ֵ��0
		int count = 0;

		int end = 884800;
		int start = 1;

		while(start < end) {
			count++;
			start <<= 1;      //����һλ�൱�ڳ���2
		//	System.out.println(start);
		}

		System.out.println("Ҫ��"+count+"��");
	}
}

