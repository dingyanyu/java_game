
class Student extends Person {
	String address;

	void study(){
		System.out.println("������ѧϰ");
	}
	void introduce(){
	//	System.out.println("�ҵ�������"+name+"���ҵ�������"+age);
		super.introduce();
		System.out.println("�ҵļ���"+address);
	}
}


