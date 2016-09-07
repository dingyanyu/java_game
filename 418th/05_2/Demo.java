
class Demo {
	public static  void main(String[] args){
		
		// 生成一个Runnable接口实现类的对象
		RunnableImpl ri = new RunnableImpl();
		//生成一个Thread对象，并将Runnbale实现接口实现类的对象作为参数
		//传递给该Thread对象
		Thread t = new Thread(ri);

		//线程的优先级最大是10，最小是1，可以使用Thread所提供的
		//静态常量来设置线程的优先级
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority());
		//通知Thread对象，执行start方法
		t.start();
	}
}

