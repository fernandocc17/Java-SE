//https://github.com/fernandocc17, July 2016.
package controller;
import model.Pipe;
public class Producer extends Thread{
private Pipe pipe;
private final String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
private char [] alpha=alphabet.toCharArray();
//getting the common resources
public Producer(Pipe t){
	pipe=t;
}
public void run(){
	char c;
	for (int i=0;i<100;i++){
		//Gets a random character from the alphabet
		c=alpha[(int) (Math.random()*26)];
		//Put the character in the pipe
		pipe.put(c);
		//Shows what is happening
		System.out.println("Put "+ c + " int the buffer");
		//Printing the current state of the array
		pipe.print();
		try {
			sleep((long) (Math.random()*100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
