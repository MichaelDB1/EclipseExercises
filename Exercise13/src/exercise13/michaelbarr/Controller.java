package exercise13.michaelbarr;

import java.io.IOException;

public class Controller {
	protected View myView;
	private String data;
	public Controller( View theView){
		this.myView = theView;
	}
	public void go(){
		this.myView.start();
		data = this.myView.get();
		data = this.myView.getInt();
		this.myView.say( this.data);
		try {
			this.myView.stop();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
