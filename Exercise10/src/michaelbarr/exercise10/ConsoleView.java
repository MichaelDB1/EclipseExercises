package michaelbarr.exercise10;

import java.io.IOException;

public class ConsoleView implements View{
	@Override
	public <T> void say (T message){
		System.out.println(message);
	}
	@Override
	public void start(){
		say("Starting!");
	}
	@Override
	public void stop() throws IOException{
		System.out.println("Press Enter to Exit");
		System.in.read();
		System.out.println("BYE!");
	}

}
