

abstract class Person{
	String name;
	int age;


	Person(){
		System.out.println("Person的构造方法");
	}

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void introduce(){
			System.out.println("我的名字是"+name+"，我的年龄是"+age);
	}
		abstract void eat();
	
}

