

class Student extends Person { 
	//������Ĺ��췽������,������ø���Ĺ��췽��
	
	int grade;
	Student(){
		super();
		System.out.println("Student���޲ι��췽��");
	}

	Student(int grade){
		this();
	}

	Student(String name, int age, int grade){
		super(name,age);
		this.grade = grade;
	}
}
