

public class Demo3 {

public static final boolean FOR_DEBUG = false;
	public static void main(String args[]){


	//使用final定义的布尔变量，将达成和条件编译的效果一样
	// 相应的部分不会生成字节码
		if(FOR_DEBUG){
			System.out.println("开始for循环");

			for(int i = 0; i < 10; i++){
				System.out.println(i);
			}

			System.out.println("结束for循环");
		}

		int i = 0;
		while(i < 10){
			System.out.println(i);
			i++;
		}

		
	}
}

