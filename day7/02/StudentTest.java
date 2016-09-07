/*
	封装和private的应用
	a. 把成员变量用private修饰
	b. 提供对应的getXXX()和setXXX()方法
 */
 
 class Student {
	 private String name;
	 private int age;
	 
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
	 
 }
 
 class StudentTest {
	 public static void main(String[] args) {
		 //创建学生对象
		 Student s = new Student();
		 
		 s.setName("lincaiming");
		 s.setAge(25);
		System.out.println(s.getName()+"---"+s.getAge());
	}
 }
 
 