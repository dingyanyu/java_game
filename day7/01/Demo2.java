

//
class Person {
	public int sum(int a, int b) {
		return a + b;
	}
	
}

class Student {
	public void show(){
		System.out.println("I love style");
	}
}

class StudentDemo {
	public void method(Student s) {
		s.show();
	}
}

class Demo2 {
	public static void main(String[] args) {
		Person person = new Person();
	int result = person.sum(10, 20);
		System.out.println("result:"+result);
		
		System.out.println("----------------------");
		StudentDemo sd = new StudentDemo();
		sd.method(new Student());
		
	}
}