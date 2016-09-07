
//实现是特殊的继承
class Phone implements USB,WiFi{
	public void read(){
		System.out.println("USB is reading!");
	}

	public void write(){
		System.out.println("USB is writing!");
	}

	public void open(){
		System.out.println("WiFi is opening!");
	}

	public void close(){
		System.out.println("WiFi is closing!");
	}
}

