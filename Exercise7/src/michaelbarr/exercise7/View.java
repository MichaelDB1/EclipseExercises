package michaelbarr.exercise7;

import java.io.IOException;

public interface View {
	public <T> void say(T message);
	public void start();
	public void stop() throws IOException;
}
