class Demo {
	public static void main(String args[]) {
		//�����߳���Ķ���
		FirstThread ft = new FirstThread();
		//�����߳�
		ft.start();
		
		//ft.run();		//ǧ��������д
		for(int i = 0; i < 100; i++) {
			System.out.println("main--->" + i);
		}
	}
	
}