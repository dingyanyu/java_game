class Demo {
	public static void main(String[] args) {
		//����һ��Runnable�ӿ�ʵ����Ķ���
		RunnableImpl ri = new RunnableImpl();
		//����һ��Thread���󣬲���Runnable�ӿ�ʵ����Ķ�����Ϊ����
		//���ݸ���Thread����
		Thread t = new Thread(ri);
		//�̵߳�������ȼ������10����С��1������ʹ��Thread���ṩ�ľ�̬����
		//�������̵߳����ȼ������ȼ�Խ�ߣ�ִ�еĸ���Խ��
		t.setPriority(Thread.MAX_PRIORITY);
		//֪ͨThread����ִ��start����
		t.start();
		System.out.println(t.getPriority());
	}
}