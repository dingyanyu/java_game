
/*
	匿名对象:就是没有名字的对象
	匿名对象的应用场景:
	A:调用方法，仅仅只调用一次的时候
	  注意:调用多次的时候，不适合
	  那么，这种匿名调用有什么好处吗?
	  	有，匿名对象调用完毕就是垃圾，可以被垃圾回收器
	B:匿名对象可以作为实际参数传递
*/

class Student {
	public void show() {
		System.out.println("我爱学习");
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

