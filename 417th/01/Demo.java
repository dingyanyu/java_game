/*
	使用字符流读写文件
 */
import java.io.*;

class Demo {
	public static void main(String[] args){
		FileReader fr = null;
		FileWriter fw = null;

		try{
			fr = new FileReader("D:/java_game/417th/01/from.txt");
			fw = new FileWriter("D:/java_game/417th/01/to.txt");
			char buffer[] = new char[100];
			int temp = fr.read(buffer, 0, buffer.length);

			fw.write(buffer, 0, temp);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				fr.close();
				fw.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}


