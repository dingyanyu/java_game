

class Demo {
	public static void main(String args[]){
		//�����߳���Ķ���
		FirstThread ft = new FirstThread();
		//start Thread
		ft.start();

		for(int i = 0; i < 100; i++){
			System.out.println("main-->"+i);
		}
		
	}
}


