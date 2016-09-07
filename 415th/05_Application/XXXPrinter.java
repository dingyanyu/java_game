
class XXXPrinter implements Printer {
	public void open(){
		System.out.println("XXX open!");
	}

	public void close(){
		System.out.println("XXX close!");
	}

	public void print(String s){
		System.out.println("XXX print --->"+s);
	}	
}
