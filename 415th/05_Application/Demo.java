

class Demo {
	public static void main(String []args){
	/*
	 * �����û���ѡ��������Ӧ�Ĵ�ӡ������
	 * ��������ת��ΪPrinter����
	 */

		Printer printer = PrinterFactory.getPrinter(2);
		printer.open();
		printer.print("test");
		printer.close();
	}
}


