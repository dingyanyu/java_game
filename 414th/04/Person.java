

abstract class Person{
	String name;
	int age;


	Person(){
		System.out.println("Person�Ĺ��췽��");
	}

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void introduce(){
			System.out.println("�ҵ�������"+name+"���ҵ�������"+age);
	}
		abstract void eat();
	
}

