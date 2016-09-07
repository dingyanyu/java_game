

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
		System.out.println("姓名:"+name+",年龄:"+age+"，国籍："+country);
	}
}

class PersonDemo {
	public static void main(String[] args) {
		Person p1 = new Person("林财明", 25, "中国");
		p1.show();
		
		Person p2 = new Person("丁燕瑜", 24);
		p2.show();
		
		Person p3 = new Person("皇帝", 100);
		p3.country = "美国";
		p3.show();
		p1.show();
		p2.show();
	}
	
}