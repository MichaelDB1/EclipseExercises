package Exericse24.MichaelBarr;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleView implements View {
	
	@Override
	public String get(){
		String input;
		System.out.println("Type something to enter");
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
		System.out.println("Starting");
	}
	
	@Override
	public void stop() throws IOException{
		System.out.println("press Enter to exit");
		System.in.read();
		System.out.println("Bye Bye");
	}
}
