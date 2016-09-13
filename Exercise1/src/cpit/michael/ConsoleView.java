package cpit.michael;

import java.io.IOException;
import java.util.Scanner;


public class ConsoleView implements View {
	@Override
	public String get() {
		String input;
		System.out.println(">");
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		s.close();
		return input;
	}
	@Override
	public int getInt(){
		String input;
		System.out.println(">");
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		s.close();
		return Integer.parseInt(input);
	}
	@Override
	public <T> void say(T message) {
		System.out.println(message);
	}
	@Override
	public void start() {
		System.out.println("STARTING");
	}
	@Override
	public void stop() throws IOException {
		System.out.println("press ENTER to exit");
		System.in.read();
		System.out.println("bye!");
	}


}
