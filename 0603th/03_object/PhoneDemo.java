

class Phone {
	//品牌
	 String brand;
	//颜色
	 String color;
	//价格
	 int price;

	public void call(String name) {
		System.out.println("给"+name+"打电话");
	}

	public void sendMessage() {
		System.out.println("群发短信");
	}

	public void playGame() {
		System.out.println("玩游戏");
	}
	
}

class PhoneDemo {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "诺基亚";
		p.price = 100;
		p.color = "灰色";

		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		p.call("林财明");
		p.sendMessage();
		p.playGame();
	}
}


