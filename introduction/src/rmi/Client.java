package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Registry registry = LocateRegistry.getRegistry("localhost",1099);
			Calculator calc = (Calculator)registry.lookup("Calculator");
			int number = 5;
			int result = calc.square(number);
			System.out.println("Square of "+number+" is: "+result);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
