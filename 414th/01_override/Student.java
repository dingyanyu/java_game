
//1.在具有父子关系的两个类中
//2.父类和子类各有一个函数，这两个函数的定义(返回值类型、函数名和参数列表)完全相同
class Student extends Person {
	String address;

	//override  复写 覆盖 重写
	void introduce(){
	//	System.out.println("我的姓名是"+name+"，我的年龄是"+age);
		super.introduce();
		System.out.println("我的家在"+address);
	}
}


