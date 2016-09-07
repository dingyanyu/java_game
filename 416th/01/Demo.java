

class Demo {
	public static void main(String[] args){
		System.out.println("11111111111111");
		try{
		//	Thread.sleep(1000);
			System.out.println("aaaaaaaaaaaaaa");
			Thread.sleep(1000);
		//	int i = 1/1;
			System.out.println("bbbbbbbbbbbbbb");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("cccccccccccccccc");
		}finally{
			System.out.println("finally");
		}
		System.out.println("22222222222");
	}
}


