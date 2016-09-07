
//定义手机类
class Phone {
	//品牌
	private String brand;
	private int price;
	private String color;
	
	public Phone() {
		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
		public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}

class PhoneTest {
	public static void main(String[] args) {
		//创建对象
		Phone p = new Phone();
		p.setBrand("华为");
		p.setPrice(8999);
		p.setColor("土豪金");
		
		System.out.println(p.getBrand()+"---"+p.getPrice()+"---"+p.getColor());
	}
	
}

