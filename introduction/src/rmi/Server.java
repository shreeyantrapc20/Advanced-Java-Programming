package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator calc;
try {
	calc = new CalculatorImpl();
	Registry registry = LocateRegistry.createRegistry(1099);
	registry.rebind("Calculator", calc);
	System.out.println("Server is running...");
} catch (RemoteException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
