//https://github.com/fernandocc17, July 2016.
package model;
//Implementing the Runnable interface makes the Philosopher implement the run method.
public class Philosopher implements Runnable{
public	Fork leftFork;
public 	Fork rightFork;
final long eatTime;
final long thinkTime;
final long limit;	
	//the philosoper is created "knowing" which forks are his.
	public Philosopher(Fork leftFork, Fork rightFork,long eatTime, long thinkTime,int limit) {
		super();
		this.leftFork = leftFork;
		this.rightFork = rightFork;
		this.eatTime=eatTime;
		this.thinkTime=thinkTime;
		this.limit=limit;
	}
	//this is the part of the class that runs in a separate thread
	@Override
	public void run() {
		int random;
		for (int i=0;i<limit;i++)
		{
			random=(int) (Math.random()*1000);
			if (random%2==0)
			{
				eat(i);
			}
			else
			{
				think(i);
			}
		}
		System.out.println(this.toString().toUpperCase() + " FINISHED"+"\n");
	}	
	@SuppressWarnings("static-access")
	public void eat(int count){
		/* This way cause more contention since the thread uses all his scheduled time just to wait, the other way gives more chances.
			while (leftFork.getForkInUse() || rightFork.getForkInUse()){
		System.out.println("El " + Thread.currentThread().getName()+ " wait to eat " 
								+ leftFork.toString() + " o el " + rightFork.toString() + " are in use");
		}*/
		//if both resources are not available the thread will yield to give space to other thread.
		if (leftFork.getForkInUse() || rightFork.getForkInUse()){
			System.err.println(Thread.currentThread().getName()+ " YIELD!");
		}
		else{
			//marking the resources as bussy
			rightFork.setForkInUse(true);
			leftFork.setForkInUse(true);
			//notifying of the eat
			System.out.println(Thread.currentThread().getName()+ " is eating  "
								+ leftFork.toString() + " and " + rightFork.toString());
			try{
					Thread.currentThread().sleep(eatTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
			}	
			//Free resources
			rightFork.setForkInUse(false);
			leftFork.setForkInUse(false);
			System.out.println(Thread.currentThread().getName()+ " ended eating for "+ (count+1)+" time "
					+ leftFork.toString() + " and " + rightFork.toString());
		}
		//whatever happens it will yield to give chance to another.
		Thread.currentThread().yield();
}
	@SuppressWarnings("static-access")
	public void think(int count){
		System.out.println(Thread.currentThread().getName()+ " is thinking for "+ (count+1)
				+ leftFork.toString() + " and " + rightFork.toString() );
		try {
			//putting the thread to sleep as if it was thinking
			Thread.currentThread().sleep(thinkTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Yield so it gives another chance to enter the scheduler...this doesn't mean  that the scheduler can't pick this thread again
		Thread.currentThread().yield();
}
	//print the thread name and the state of each fork
 	public String toString(){
		return Thread.currentThread().getName() +" and his forks are " + leftFork.toString() + " and " + rightFork.toString();
	}
}