
class Demo {
	public static void main(String[] args){
		Service service = new Service();
	//	Thread t1 = new Thread(new MyThread1(service));
		Thread t2 = new Thread(new MyThread2(service));
	//	t1.start();
		new Thread(new MyThread1(service)).start();
		t2.start();
	}
}

