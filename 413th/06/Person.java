

class Person {
	String name;
	int age;
	String address;
	Person(){
		System.out.println("�޲����Ĺ��췽��");
	}

	Person(String name, int age, String address){
		this();
		this(name,age);
	//	this(name,age);
		this.address = address;
		System.out.println("���������Ĺ��췽��");
	}

	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("���������Ĺ��췽��");
	}

	
	void talk() {
		System.out.println("my name is "+this.name);
	}
}

