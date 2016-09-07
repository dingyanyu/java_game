class Demo {
	public static void main(String args[]) {
		//生成线程类的对象
		FirstThread ft = new FirstThread();
		//启动线程
		ft.start();
		
		//ft.run();		//千万不能这样写
		for(int i = 0; i < 100; i++) {
			System.out.println("main--->" + i);
		}
	}
	
}