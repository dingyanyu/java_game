
class Demo {
	public static void main(String[] args){
		//����һ��A��˾ˮ�ܹ�����
		Plumber plumber = new Plumber();
		AWorker aWorker1 = new AWorker(plumber);
		aWorker1.doSomeWork();

		Carpenter carpenter = new Carpenter();
		AWorker aWorker2 = new AWorker(carpenter);
		aWorker2.doSomeWork();
	} 
}

