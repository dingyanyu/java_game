
/*
	一个引用能够调用哪些成员(变量和方法)，取决于这个引用的类型
	一个引用调用的是哪一个方法，取决于这个引用所指向的对象
 */

class Demo {
	public static void main(String []args){

	Person p = new Person();
	Student s = (Student)p;
	}
}
	
