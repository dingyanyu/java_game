
import java.io.*;
class Demo {
	public static void main(String args[]){
		//声明输入流使用
		FileInputStream fis = null;
	//	FileOutputStream fos = null;
		try{
			//生成代表输入流的对象
			fis = new FileInputStream("D:/java_game/416th/03/from.txt");

			//生成代表输出流的对象
		//	fos = new FileOutputStream("D:/java_game/416th/03/to.txt");
			
			//生成一个字节数组
			byte [] buffer = new byte[100];
			//调用输入流对象的read方法，读取数据
			int temp = fis.read(buffer,0, buffer.length);

		//	fos.write(buffer, 0, temp);

		
			String s = new String(buffer);
			s = s.trim();
			System.out.println(s);
		
		
		
		/*
			for(int i = 0; i < buffer.length; i++){
				System.out.println(buffer[i]);
			}
		*/
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}


