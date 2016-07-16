import model.Pipe;
import controller.Consumer;
import controller.Producer;

//https://github.com/fernandocc17, July 2016.
public class Main {
	public static void main(String[] args) {
		//The pipe will be shared by the producer and consumer
		Pipe t=new Pipe();
		//Creating producer and consumer and passing the pipe
		Producer p=new Producer(t);
		Consumer c=new Consumer(t);
		//Starting threads.
		p.start();
		c.start();
	}
}
