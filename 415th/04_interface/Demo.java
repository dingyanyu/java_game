
class Demo {
	public static void main(String[] args){
		Phone phone = new Phone();

		USB usb = phone;
		usb.read();
	 	usb.write();
		
		WiFi wifi = phone;
		phone.open();
		phone.close();
	}
}


