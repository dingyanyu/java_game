


class Variable {
	int num;
	
	public void show() {
		int num2 = 10;
		int num = 100;
		System.out.println(num2);

		System.out.println(num);
	}
}



class Demo {
	public static void main(String[] args) {
		Variable v = new Variable();
		System.out.println(v.num);	
		v.show();
	}
}