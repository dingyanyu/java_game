//���һ�δ��������������ɴ���ģ���ô���﷨��ҲӦ�����д����

abstract class Printer {
	void open(){
		System.out.println("open");
	}

	void close(){
		System.out.println("close");
	}
/*
	void print(){

	}
*/
	abstract void print();

}
