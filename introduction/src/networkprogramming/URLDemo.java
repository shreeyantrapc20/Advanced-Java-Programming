package networkprogramming;

import java.net.URL;
import java.net.MalformedURLException;

public class URLDemo {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://hamrocsit.com/note/advanced-java/network-programming/");
			System.out.println("Protocol:"+url.getProtocol());
			System.out.println("Host Name:"+url.getHost());
			System.out.println("Port no:"+url.getPort());
			System.out.println("File name:"+url.getFile());
		} 
		catch (MalformedURLException e) {
			// TODO: handle exception
		}

}
}
