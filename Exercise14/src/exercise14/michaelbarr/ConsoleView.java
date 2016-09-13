package exercise14.michaelbarr;


import java.io.IOException;

public class ConsoleView implements View{
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
