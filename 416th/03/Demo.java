
import java.io.*;
class Demo {
	public static void main(String args[]){
		//����������ʹ��
		FileInputStream fis = null;
	//	FileOutputStream fos = null;
		try{
			//���ɴ����������Ķ���
			fis = new FileInputStream("D:/java_game/416th/03/from.txt");

			//���ɴ���������Ķ���
		//	fos = new FileOutputStream("D:/java_game/416th/03/to.txt");
			
			//����һ���ֽ�����
			byte [] buffer = new byte[100];
			//���������������read��������ȡ����
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


