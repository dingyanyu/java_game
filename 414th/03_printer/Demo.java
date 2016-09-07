

class Demo {
	public static void main(String []args){
		int flag = 1;
		if(flag == 0){
			HPPrinter hpPrinter = new HPPrinter();
			hpPrinter.open();
			hpPrinter.print("abc");
			hpPrinter.close();
		}
		else if(flag == 1){
			CanonPrinter cannonPrinter = new CanonPrinter();
			cannonPrinter.open();
			cannonPrinter.print("123");
			cannonPrinter.close();
		}

	}
}
