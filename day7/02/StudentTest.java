/*
	��װ��private��Ӧ��
	a. �ѳ�Ա������private����
	b. �ṩ��Ӧ��getXXX()��setXXX()����
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
		 //����ѧ������
		 Student s = new Student();
		 
		 s.setName("lincaiming");
		 s.setAge(25);
		System.out.println(s.getName()+"---"+s.getAge());
	}
 }
 
 