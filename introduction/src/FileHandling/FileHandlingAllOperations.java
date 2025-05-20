package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAllOperations {

	public static void main(String args[]) {
		
		String filePath = "D:\\\\Binayak\\\\Advanced-Java-Programming\\\\introduction\\\\bin\\\\Files\\\\FileAllOperation.txt";
		String fileContent = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		
		File myFile = new File(filePath);
		
		//create file
		try {
			
			myFile.createNewFile();
			System.out.println("File has been created successfully");
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		
		//write file
		try {
			
			FileWriter fw = new FileWriter(filePath);
			fw.write(fileContent);
			fw.close();
			System.out.println("File has been written successfully");
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		
		//read file
		
		File getFileContent = new File(filePath);
		
		try {
			
			Scanner sc = new Scanner(getFileContent);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println("File Conent: \""+line+" \" ");
			}
			
			sc.close();
			
		} catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		//deletefile
		
		try {
			File deleteFile = new File(filePath);
			
			if(deleteFile.delete()) {
				System.out.println("File has been deleted: "+deleteFile.getName());
			} else {
				System.out.println("Some problem with deleting file");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
