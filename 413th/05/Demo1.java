


class Demo1 {
	public static void main(String args[]) { 

		Person person1 = new Person();
		person1.name = "zhangsan";
		person1.age = 10;

		Person person2 = new Person();
		person2.name = "lisi";
		person2.age = 20;

		Person person3 = new Person("wangwu",23);
		System.out.println("person1��name��: "+person1.name+", age��:"+person1.age);
		System.out.println("person2��name��: "+person2.name+", age��:"+person2.age);
		System.out.println("person3��name��: "+person3.name+", age��:"+person3.age);
	}

}
