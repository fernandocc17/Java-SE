//https://github.com/fernandocc17, July 2016.
package controller;
import model.Pipe;
//Extending from thread instead of implementing runnable
public class Consumer extends Thread{
private Pipe pipe;
//Receiving the pipe, common resources.
public Consumer (Pipe t){
	pipe=t;
}
public void run (){
	char c;
	//will run this 100 times
	for (int i=0;i<100;i++){
		c=pipe.get();
		//Show what character we got from the pipe
		System.out.println("GETS "+ c);
		//printing the entire pipe
		pipe.print();
		try {
			//put the thread to sleep for a random time in 100.
			sleep((long) (Math.random()*100));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}