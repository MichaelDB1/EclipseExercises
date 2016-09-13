package pracTest1.michaelbarr;

import java.io.IOException;

public interface View {
	public String getOne();
	public String getTwo();
	public <T> void say(T message);
	public void start();
	public void stop() throws IOException;
	

}
