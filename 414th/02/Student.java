
class Student extends Person {
	String address;

	void study(){
		System.out.println("我正在学习");
	}
	void introduce(){
	//	System.out.println("我的姓名是"+name+"，我的年龄是"+age);
		super.introduce();
		System.out.println("我的家在"+address);
	}
}


