package FileHandling;

import java.io.IOException;
import java.io.FileOutputStream;

public class FileHandlingCharWise {

	public static void main (String args[]) throws IOException{
		FileOutputStream fs = new FileOutputStream("D:\\Binayak\\Advanced-Java-Programming\\introduction\\bin\\Files\\file1.txt");
		String s = "This file is created by java program with the help of FileOutputSteam";
		char c[] = s.toCharArray();
		System.out.println("Attempting to write in file...");
		
		for( char str : c) {
			fs.write(str);
		}
		
		fs.close();
		System.out.println("Record has been written in file successfully");
	}
	
}
