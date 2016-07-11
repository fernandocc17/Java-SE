//https://github.com/fernandocc17, July 2016.
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
	public static void main(String[] args) {
		//Queue is an interface to implement...well, queues.There are several implementations like ArrayDeque, PriorityQueue,ConcurrentLinkedQueue
		Queue<String> queue=new PriorityQueue<String>();
		queue.offer("FerC");
		queue.offer("Chuck Norris");
		queue.offer("Kal-El");
		Iterator<String> it=queue.iterator();
		//it will print them on the String priority...and of course Chuck Norris will be the first.
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}