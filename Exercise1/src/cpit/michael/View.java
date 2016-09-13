package cpit.michael;

import java.io.IOException;


public interface View {
	public String get();
	public <T> void say(T message);
	public void start();
	public void stop() throws IOException;
	public int getInt();
}
