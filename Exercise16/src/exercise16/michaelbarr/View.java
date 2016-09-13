package exercise16.michaelbarr;

import java.io.IOException;

public interface View {
	public String getString();
	public <T> void say(T message);
	public void start();
	public void stop() throws IOException;
}
