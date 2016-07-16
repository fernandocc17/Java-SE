//https://github.com/fernandocc17, July 2016.
package view;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import model.Fork;
import model.Philosopher;
public class Console {
	int nPhilosophers;
	Scanner sc=new Scanner(System.in);
	List<Philosopher> philosophers=new ArrayList<Philosopher>();
	LinkedList<Fork> forks=new LinkedList <Fork>();
	long think;
	long eat;
	int repeat;
	//for when the the parameters will give ask to the user.
	public Console(){
	}
	//Constructor for when all the parameters are passed, no need to interact.
	public Console(int nPhilosophers, long think, long eat, int repeat) {
		super();
		this.nPhilosophers = nPhilosophers;
		this.think = think;
		this.eat = eat;
		this.repeat = repeat;
		//first create all the forks
		createForks();
		//create the philosophers and then pairing them up with the forks
		createPhilosophers();
		//starting all the threads
		startThreads();
	}
	//this will ask the user all the necessary data
	public void start(){
		System.out.println("How many philosophers?");
		nPhilosophers=sc.nextInt();
		System.out.println("Think-miliseconds");
		think=sc.nextLong();
		System.out.println("Eat-miliseconds");
		eat=sc.nextLong();
		System.out.println("How many times are they going to eat/sleep?");
		repeat=sc.nextInt();
		createForks();
		createPhilosophers();
		startThreads();
	}
	//checks what forks every philosopher has
	public void matching(){
		Iterator <Philosopher> it=philosophers.iterator();
		while (it.hasNext()){
			Philosopher t=it.next();
			System.out.println(t.toString());
		}
	}
	//create the philosopher and match them with their forks
	public void createPhilosophers(){
		//1st philosopher needs to match with the 1st and last fork
		Fork leftFork = forks.get(nPhilosophers-1);
		Fork rightFork = forks.get(0);
		//creating the philosopher and put it on the AL
		philosophers.add(new Philosopher(leftFork,rightFork,eat,think,repeat));
		for (int i=0;i<nPhilosophers-2;i++)
		{
			leftFork = forks.get(i);
			rightFork = forks.get(i+1);
			philosophers.add(new Philosopher(leftFork,rightFork,eat,think,repeat));
		}
		//The last philosopher match with the second to last and last fork 
		leftFork = forks.get(nPhilosophers-2);
		rightFork = forks.get(nPhilosophers-1);
		philosophers.add(new Philosopher(leftFork,rightFork,eat,think,repeat));
}
	//create forks with no philosophers
	public void createForks(){
		for (int i=0;i<nPhilosophers;i++)
		{
			forks.add(new Fork(null,null,"Fork "+ (i+1)));
		}
	}
	
	public void startThreads(){
		Iterator <Philosopher>it=philosophers.iterator();
		int i =1;
		ArrayList<Thread> phil=new ArrayList<Thread>();
		while (it.hasNext()){
			Philosopher temp= it.next();
			String philosopherName ="Philosopher " + (i++) ; 
			//Creating a thread object along with his name
			Thread t=new Thread(temp,philosopherName );
			phil.add(t);
		}
		int nPhil=phil.size();
		for (i =0; i<nPhil;i++){
			//creating and running the threads.
			phil.get(i).start();
		}
	}
}