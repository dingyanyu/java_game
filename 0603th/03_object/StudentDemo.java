/*
	如何使用类?
 */
class Student {
	private String name;
	private int age;
	private String address;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void study() {
		System.out.println("I am study");
	}
	
	public void eat() {
		System.out.println("I like eating");
	}
	
	public void sleep() {
		System.out.println("I am sleeping");
	}
	
}


class StudentDemo {
	public static void main(String[] args) {
		//创建学生类对象
		Student stu = new Student();
		stu.eat();

		stu.setName("林青霞");
		stu.setAge(27);
		stu.setAddress("北京");
		System.out.println(stu.getName()+"---"+stu.getAge()+"---"+stu.getAddress());

	}	
}

