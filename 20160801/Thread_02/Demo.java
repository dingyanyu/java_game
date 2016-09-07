class Demo {
	public static void main(String[] args) {
		//生成一个Runnable接口实现类的对象
		RunnableImpl ri = new RunnableImpl();
		//生成一个Thread对象，并将Runnable接口实现类的对象作为参数
		//传递给该Thread对象
		Thread t = new Thread(ri);
		//通知Thread对象，执行start方法
		t.start();
	}
}