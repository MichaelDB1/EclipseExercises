package mdb264Test3;

public class Controller {
	protected View myView; 
    private String data; 

    // call from ReverseArrayController
    public Controller( View theView){
        this.myView = theView; } 

    // override in ReverseArrayController
    public void go() { 
        // does nothing
    }
}
