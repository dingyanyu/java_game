class Demo {
	public static void main(String[] args) {
		//生成一个Runnable接口实现类的对象
		RunnableImpl ri = new RunnableImpl();
		//生成一个Thread对象，并将Runnable接口实现类的对象作为参数
		//传递给该Thread对象
		Thread t = new Thread(ri);
		//线程的最大优先级最大是10，最小是1，可以使用Thread所提供的静态常量
		//来设置线程的优先级，优先级越高，执行的概率越大！
		t.setPriority(Thread.MAX_PRIORITY);
		//通知Thread对象，执行start方法
		t.start();
		System.out.println(t.getPriority());
	}
}