

class Phone {
	//Ʒ��
	 String brand;
	//��ɫ
	 String color;
	//�۸�
	 int price;

	public void call(String name) {
		System.out.println("��"+name+"��绰");
	}

	public void sendMessage() {
		System.out.println("Ⱥ������");
	}

	public void playGame() {
		System.out.println("����Ϸ");
	}
	
}

class PhoneDemo {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "ŵ����";
		p.price = 100;
		p.color = "��ɫ";

		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		p.call("�ֲ���");
		p.sendMessage();
		p.playGame();
	}
}


