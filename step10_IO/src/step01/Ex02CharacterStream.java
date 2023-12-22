package step01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02CharacterStream {

	// fileSave : fileWriter
	public static void fileSave() throws IOException {
		FileWriter fw = new FileWriter("CharacterStream.txt");
		
		char[] city = {'스', '위', '스'};
		fw.write(city);
		fw.write("시드니");
		
		fw.close();
	}
	
	
	public static void fileOpen() throws IOException {
		FileReader fr = new FileReader("CharacterStream.txt");
		
		int data;
		while((data = fr.read()) != -1) {
			System.out.println(data);
		}
		
		fr.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			fileSave();
			fileOpen();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}
