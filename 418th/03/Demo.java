

class Demo {
	public static void main(String[] args){
		A a = new A();

	//	A.B b = new A().new B();
		A.B b1 =  a.new B();
		a.i = 3;
		b1.j = 4;
		b1.funB();
	}
}


