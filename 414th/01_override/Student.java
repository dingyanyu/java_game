
//1.�ھ��и��ӹ�ϵ����������
//2.������������һ�������������������Ķ���(����ֵ���͡��������Ͳ����б�)��ȫ��ͬ
class Student extends Person {
	String address;

	//override  ��д ���� ��д
	void introduce(){
	//	System.out.println("�ҵ�������"+name+"���ҵ�������"+age);
		super.introduce();
		System.out.println("�ҵļ���"+address);
	}
}


