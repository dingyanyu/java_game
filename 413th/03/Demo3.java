

public class Demo3 {

public static final boolean FOR_DEBUG = false;
	public static void main(String args[]){


	//ʹ��final����Ĳ�������������ɺ����������Ч��һ��
	// ��Ӧ�Ĳ��ֲ��������ֽ���
		if(FOR_DEBUG){
			System.out.println("��ʼforѭ��");

			for(int i = 0; i < 10; i++){
				System.out.println(i);
			}

			System.out.println("����forѭ��");
		}

		int i = 0;
		while(i < 10){
			System.out.println(i);
			i++;
		}

		
	}
}

