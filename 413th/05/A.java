
class A {

	A(){
		System.out.println("这是一个构造方法");
	}
	void funA() {
		System.out.println("没有参数的funA函数");
	}

	void funA(int i){
		System.out.println("拥有一个int型参数的funA函数");
	}

	void funA(int x, double y){
		System.out.println("拥有两个参数的funA函数");
	}
}

