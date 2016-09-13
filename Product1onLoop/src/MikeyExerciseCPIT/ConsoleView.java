package MikeyExerciseCPIT;

import java.io.IOException;

public class ConsoleView {
	@Override
	public String get(){
		String input;
		System.out.println(">");
		Scanner s = new Scanner(System.in);
		input s.nextline();
		s.close();
		return input();
		
	}
	
	@Override
	public <T> void say (T message){
			System.out.println(message);				
	}
	
	@Override
	public void start(){
			say("Starting");				
	}
	
	@Override
	public void stop() throws IOEception{
		System.out.println("Press Enter To Exit");
		System.in.read();
		System.out.println("Bye!");
				
	}
}
