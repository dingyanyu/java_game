
/*
  从一个文件读出数据，然后放入缓冲区，再放入另一个文件中
 */


import java.io.*;
class Demo {
	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try{
			//生成代表输出流的对象
			fis = new FileInputStream("D:/java_game/416th/04/from.txt");
			fos = new FileOutputStream("D:/java_game/416th/04/to.txt");
			//生成
			byte[] buffer = new byte[1024];
			int temp;
			while(true){
				temp = fis.read(buffer, 0, buffer.length);
				if(temp == -1){
					break;
				}
				fos.write(buffer, 0, temp);
			}
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				fis.close();
				fos.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
	
}


