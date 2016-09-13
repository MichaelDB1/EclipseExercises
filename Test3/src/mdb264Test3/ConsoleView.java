package mdb264Test3;

import java.io.IOException;

public class ConsoleView implements View {
	@Override
	public void say(T message) {
		System.out.println(message); 
	}
	    
	@Override
	public void add(T message) {
		System.out.print(message); 
	}
	    
	    
	@Override
		public void start(){
		say("STARTING");			
				
	}
	@Override
		public void stop() throws IOException{
			System.out.println("press ENTER to exit");
			System.in.read();
			System.out.println("bye!");	
								
		}
		
	}

