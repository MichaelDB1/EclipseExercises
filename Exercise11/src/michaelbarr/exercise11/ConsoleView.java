package michaelbarr.exercise11;

import java.io.IOException;

public class ConsoleView implements View{
	@Override
	public <T> void say (T message){
		System.out.println(message);
	}
	@Override
	public void start(){
		say("Starting");
	}
	@Override
	public void stop() throws IOException{
		System.out.println("Press enter to exit");
		System.in.read();
		System.out.println("bye!");
	}
	

}
