class CanonPrinter implements Printer {
	private void clean(){
		System.out.println("Canon clean!");
	}
	public void open(){
		System.out.println("Canon open!");
	}

	public void close(){
		this.clean();
		System.out.println("Canon close!");
	}

	public void print(String s){
		System.out.println("Canon print--->"+s);
	}
}

