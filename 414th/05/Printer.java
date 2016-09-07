//如果一段代码在语意上是由错误的，那么在语法上也应该是有错误的

abstract class Printer {
	void open(){
		System.out.println("open");
	}

	void close(){
		System.out.println("close");
	}
/*
	void print(){

	}
*/
	abstract void print();

}
