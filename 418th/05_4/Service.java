/*
   ͬ���������Էǳ������Ҫ��ס��һ������
   synchronize������ס���ǵ�����������Ķ���
 */
class Service {
	public synchronized void fun1(){
		try{
			Thread.sleep(3 * 1000);
		}
		catch(Exception e){
			System.out.println(e);
		}

		System.out.println("fun1");
	}

	public void fun2(){
		synchronized(this){
			System.out.println("fun2");
		}
	}
}

