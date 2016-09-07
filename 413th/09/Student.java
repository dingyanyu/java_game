

class Student extends Person { 
	//在子类的构造方法当中,必须调用父类的构造方法
	
	int grade;
	Student(){
		super();
		System.out.println("Student的无参构造方法");
	}

	Student(int grade){
		this();
	}

	Student(String name, int age, int grade){
		super(name,age);
		this.grade = grade;
	}
}
