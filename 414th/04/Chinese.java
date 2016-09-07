
class Chinese extends Person {
	String address;
	Chinese(){
		super();
		System.out.println("Chinese的构造方法");
	}

	Chinese(String name, int age){
		super(name,age);
		this.address = address;
	}
	void eat(){
		System.out.println("我喜欢吃苹果");
	}
}
