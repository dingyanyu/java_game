
class Demo {
	public static void main(String [] args){
		AImpl al = new AImpl();
		A a = al;
		B b = new B();
		b.fun(new A(){
			public void doSomething(){
				System.out.println("匿名内部类");
			}
		});
	}
}


