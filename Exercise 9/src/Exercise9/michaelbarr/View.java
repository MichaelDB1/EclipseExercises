package Exercise9.michaelbarr;

import java.io.IOException;

public interface View {

	public <T> void say (T message);
	public void start();
	public void stop() throws IOException;
}
