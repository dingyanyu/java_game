
/*
	��������:����û�����ֵĶ���
	���������Ӧ�ó���:
	A:���÷���������ֻ����һ�ε�ʱ��
	  ע��:���ö�ε�ʱ�򣬲��ʺ�
	  ��ô����������������ʲô�ô���?
	  	�У��������������Ͼ������������Ա�����������
	B:�������������Ϊʵ�ʲ�������
*/

class Student {
	public void show() {
		System.out.println("�Ұ�ѧϰ");
	}
}

class StudentDemo {
	public void method(Student s) {
		s.show();
	}
}

class AnonymousDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();

		new Student().show();
		System.out.println("------------");
		StudentDemo sd = new StudentDemo();
	//	Student s2 = new Student();
		sd.method(new Student());

		System.out.println("==============");
		new StudentDemo().method(new Student());
	}
}

