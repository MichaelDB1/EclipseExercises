package Exericse23.MichaelBarr;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleView implements View{
	
	@Override
	public String get(){
		String input;
		System.out.println("type something to input");
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
		System.out.println("press Enter to Exit");
		System.in.read();
		System.out.println("Bye");
	}
}
