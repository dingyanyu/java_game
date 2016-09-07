
class Demo {
	public static void main(String[] args){
		//生成一个A公司水管工对象
		Plumber plumber = new Plumber();
		AWorker aWorker1 = new AWorker(plumber);
		aWorker1.doSomeWork();

		Carpenter carpenter = new Carpenter();
		AWorker aWorker2 = new AWorker(carpenter);
		aWorker2.doSomeWork();
	} 
}

