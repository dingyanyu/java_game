
//�����ֻ���
class Phone {
	//Ʒ��
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
		//��������
		Phone p = new Phone();
		p.setBrand("��Ϊ");
		p.setPrice(8999);
		p.setColor("������");
		
		System.out.println(p.getBrand()+"---"+p.getPrice()+"---"+p.getColor());
	}
	
}

