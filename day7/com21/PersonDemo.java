

class Person {
	String name;
	int age;
	static String country;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country =country;
	}
	
	public void show() {
		System.out.println("����:"+name+",����:"+age+"��������"+country);
	}
}

class PersonDemo {
	public static void main(String[] args) {
		Person p1 = new Person("�ֲ���", 25, "�й�");
		p1.show();
		
		Person p2 = new Person("�����", 24);
		p2.show();
		
		Person p3 = new Person("�ʵ�", 100);
		p3.country = "����";
		p3.show();
		p1.show();
		p2.show();
	}
	
}