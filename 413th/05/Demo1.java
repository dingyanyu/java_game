


class Demo1 {
	public static void main(String args[]) { 

		Person person1 = new Person();
		person1.name = "zhangsan";
		person1.age = 10;

		Person person2 = new Person();
		person2.name = "lisi";
		person2.age = 20;

		Person person3 = new Person("wangwu",23);
		System.out.println("person1的name是: "+person1.name+", age是:"+person1.age);
		System.out.println("person2的name是: "+person2.name+", age是:"+person2.age);
		System.out.println("person3的name是: "+person3.name+", age是:"+person3.age);
	}

}
