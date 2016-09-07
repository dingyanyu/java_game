/*
   同步代码块可以非常清楚我要锁住哪一个对象
   synchronize方法锁住的是调用这个方法的对象
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

