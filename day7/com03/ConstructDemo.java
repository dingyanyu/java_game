

class Student {
	private String name;
	private int age;
	
	public Student() {
		System.out.println("public Student()");
	}
	
	public Student(String name) {
		System.out.println("public Student(String name)");
		this.name = name;
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
}

class ConstructDemo {
	public static void main(String[]args) {
		Student s = new Student();
		s.show();
		
		System.out.println("--------------");
		
		Student s2 = new Student("∂°—‡Ë§");
		s2.show();
	}
	
}