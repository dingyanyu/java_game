class Demo {
	public static void main(String[] args) {
		//����һ��Runnable�ӿ�ʵ����Ķ���
		RunnableImpl ri = new RunnableImpl();
		//����һ��Thread���󣬲���Runnable�ӿ�ʵ����Ķ�����Ϊ����
		//���ݸ���Thread����
		Thread t = new Thread(ri);
		//֪ͨThread����ִ��start����
		t.start();
	}
}