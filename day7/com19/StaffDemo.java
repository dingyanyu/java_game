

class Staff {
	private String staffId;
	private String name;
	private int age;
	
	public Staff() {
		
	}
	
	public String getStaffId(){
		return staffId;
	}
	
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
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
	
	public void show() {
		System.out.println("员工编号是:"+staffId+"的这个人是:"+name+"的年龄是:"+age);
	}
	
}

class StaffDemo {
	public static void main(String[] args) {
		//创建对象
		Staff st = new Staff();
		
		st.setStaffId("1001");
		st.setName("林财明");
		st.setAge(25);
		st.show();
	}
}