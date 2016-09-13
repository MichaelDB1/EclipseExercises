package mdb264Test3;

import java.io.IOException;

public interface View {
    public <T> void say(T message);
    public <T> void add(T message); 
	public void start();
	public void stop() throws IOException;	
}
