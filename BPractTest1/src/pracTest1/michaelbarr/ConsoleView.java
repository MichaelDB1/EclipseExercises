package pracTest1.michaelbarr;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleView implements View {
	
	@Override
	public String getOne(){
		String input;
		System.out.println("Type in two integers");
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		return input;	
	}
	
	@Override
	public String getTwo(){
		String input;
		System.out.println("Type in two integers");
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		return input;	
	}
	
	@Override
	public <T> void say(T message){
		System.out.println(message);
	}
	
	@Override
	public void start(){
		System.out.println("STARTING");
		
	}
	
	@Override
	public void stop() throws IOException{
		System.out.println("Press Enter to Exit");
		System.in.read();
		System.out.println("Bye Bye");
	}
}
