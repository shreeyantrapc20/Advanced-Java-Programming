package FileHandling;

import java.io.FileOutputStream;

public class FileHandlingByteWise {

	public static void main(String args[]) {
		try {
			FileOutputStream fs = new FileOutputStream("D:\\Binayak\\Advanced-Java-Programming\\introduction\\bin\\Files\\filebytewise.txt");
			String s = "This data in file is written byte wise";
			byte b[] = s.getBytes();
			System.out.println("Attempting to write in file...");
			fs.write(b);
			fs.close();
			System.out.println("Record has been written in file successfully");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
