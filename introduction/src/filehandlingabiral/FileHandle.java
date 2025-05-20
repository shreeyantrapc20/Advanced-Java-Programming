package filehandlingabiral;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandle {

	public static void main(String[] args) throws IOException {
		FileOutputStream fs = new FileOutputStream("D:\\Viva\\Binayak.txt");
		String s="Welcome to Dipesh world. sagar and deep are absent";
		char b[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			fs.write(b[i]);
		}
		
		fs.close();
		System.out.println("Success");

	}

}
