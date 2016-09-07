

import java.io.*;

class Demo {
	public static void main(String args[]){
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try{
			//�ڵ���     �ڵ����Ǳ�װ����
			fileReader = new FileReader("D:/java_game/418th/01/users.txt");
			//������     ��������װ����
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while(true){
				line = bufferedReader.readLine();
				if(line == null){
					break;
				}
				System.out.println(line);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				bufferedReader.close();
				fileReader.close();
			}
			catch(Exception e){
				System.out.println(e);
			}	
		}
	}
}
