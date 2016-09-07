

class Demo {
	public static void main(String []args){
	/*
	 * 根据用户的选择，生成相应的打印机对象
	 * 并且向上转型为Printer类型
	 */

		Printer printer = PrinterFactory.getPrinter(2);
		printer.open();
		printer.print("test");
		printer.close();
	}
}


