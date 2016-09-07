

class Demo {
	public static void main(String args[]){
		//生成线程类的对象
		FirstThread ft = new FirstThread();
		//start Thread
		ft.start();

		for(int i = 0; i < 100; i++){
			System.out.println("main-->"+i);
		}
		
	}
}


