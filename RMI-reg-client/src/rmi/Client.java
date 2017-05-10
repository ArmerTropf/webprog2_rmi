package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {}

    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.getRegistry(null);
            Hello stub = (Hello) registry.lookup("Hello");
            ICalculate stub = (ICalculate) registry.lookup("Cal");
            
            String response = stub.sayHello();
            String response2 = stub.Weiter();
            int response3 = cal.add(1,2);
            System.out.println("response3: " + response3);
      
            
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
