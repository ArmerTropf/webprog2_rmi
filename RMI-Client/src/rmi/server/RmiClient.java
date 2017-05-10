package rmi.server;


import java.rmi.Naming;

public class RmiClient {

		
	public static void main(String[]argv) throws Exception {
		
		ICommands obj = (ICommands)Naming.lookup("//localhost/RmiServer");
		Hello hello = (Hello)Naming.lookup("//localhost/RmiServer");
		System.out.println(obj.add(23423423, 3));
		System.out.println(hello.sayHello());
	}
}
