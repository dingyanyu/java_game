


class Student {
	String name;
	int age;

	public void show() {
		System.out.println("����:"+name);
		System.out.println("����:"+age);
	}
}

class Demo {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		System.out.println("-------------------");
	}
}

