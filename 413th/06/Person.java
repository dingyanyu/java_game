

class Person {
	String name;
	int age;
	String address;
	Person(){
		System.out.println("无参数的构造方法");
	}

	Person(String name, int age, String address){
		this();
		this(name,age);
	//	this(name,age);
		this.address = address;
		System.out.println("三个参数的构造方法");
	}

	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("两个参数的构造方法");
	}

	
	void talk() {
		System.out.println("my name is "+this.name);
	}
}

