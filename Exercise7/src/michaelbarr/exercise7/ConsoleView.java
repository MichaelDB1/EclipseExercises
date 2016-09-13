package michaelbarr.exercise7;

import java.io.IOException;

public class ConsoleView implements View{
	@Override
	public <T> void say(T message){
		System.out.println(message);
	}
	@Override
	public void start(){
		say("STARTING");
	}
	@Override
	public void stop() throws IOException{
		System.out.println("Press Enter to exit");
		System.in.read();
		System.out.println("BYE!");
	}
}
