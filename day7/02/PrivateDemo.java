

class Demo {
	private int num = 10;
	
	public void show() {
		System.out.println(num);
	}
}

class PrivateDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();
	}
	
}