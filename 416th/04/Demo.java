
/*
  ��һ���ļ��������ݣ�Ȼ����뻺�������ٷ�����һ���ļ���
 */


import java.io.*;
class Demo {
	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try{
			//���ɴ���������Ķ���
			fis = new FileInputStream("D:/java_game/416th/04/from.txt");
			fos = new FileOutputStream("D:/java_game/416th/04/to.txt");
			//����
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


