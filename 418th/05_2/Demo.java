
class Demo {
	public static  void main(String[] args){
		
		// ����һ��Runnable�ӿ�ʵ����Ķ���
		RunnableImpl ri = new RunnableImpl();
		//����һ��Thread���󣬲���Runnbaleʵ�ֽӿ�ʵ����Ķ�����Ϊ����
		//���ݸ���Thread����
		Thread t = new Thread(ri);

		//�̵߳����ȼ������10����С��1������ʹ��Thread���ṩ��
		//��̬�����������̵߳����ȼ�
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority());
		//֪ͨThread����ִ��start����
		t.start();
	}
}

