

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
		System.out.println("Ա�������:"+staffId+"���������:"+name+"��������:"+age);
	}
	
}

class StaffDemo {
	public static void main(String[] args) {
		//��������
		Staff st = new Staff();
		
		st.setStaffId("1001");
		st.setName("�ֲ���");
		st.setAge(25);
		st.show();
	}
}