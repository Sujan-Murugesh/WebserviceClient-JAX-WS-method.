package net.sujan.client;

public class HelloClient {

	public static void main(String[] args) {
		
		HelloService service = new HelloService();
		Hello hello = service.getHelloPort();
		
		String response = hello.greetings("welcome to sujan java webservises");

		System.out.println(response);
		
	}

}
