//https://github.com/fernandocc17, July 2016.
package model;
//this class is used as the resource, the philosopher cannot use only 1 fork, they need to use both 
public class Fork {
	private boolean forkInUse=false;
	@SuppressWarnings("unused")
	private Philosopher leftPhilosopher=null;
	@SuppressWarnings("unused")
	private Philosopher rightPhilosopher=null;
	final String  name;
	//The philosopher is created and aware of the philosophers 
	public Fork(Philosopher f1,Philosopher f2,String n ) {
		leftPhilosopher=f1;
		rightPhilosopher=f2;
		name=n;
	}
	//see if the fork is being used
	public boolean getForkInUse() {
		return forkInUse;
	}
	//mark the resource as used so no other philosopher can use it at the time.
	public void setForkInUse(boolean forkInUse) {
		this.forkInUse = forkInUse;
	}
	//print fork name and if it is being used.
	@Override
	public String toString() {
		return "--"+ name + "="+forkInUse;
	}	
}