//https://github.com/fernandocc17, July 2016.
package model;
public class Pipe {
private final int SIZE=6;
private char buffer[]=new char [SIZE];
private int top=0;
//flags to know if the pipe is empty or full
private boolean isFull=false;
private boolean isEmpty=true;
//Print the entire buffer to see what is going on
public void print(){
	for (int i =0;i<top;i++)		
		System.out.print(buffer[i]);
	System.out.println();
}
//synchronized marks this as a critical resource that can be accessed only one at a time
//You can only get a character at a time
public synchronized char get(){
	//If is empty, we wait until we receive a notification that somebody put something in the pipe
	while (isEmpty){
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//Decreasing the top since we are going to consume one
	//If after removing the element the top is 0, the pipe is empty 
	if (--top==0)
		isEmpty=true;
	//since we pull out an element from the pipe, we know for sure is not full
	isFull=false;
	//Notifying all the other threads
	notify();
	return (buffer[top]);
}
//You can only put a character at a time
public synchronized void put(char c){
	//if full, wait to put 
	while (isFull){
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//once the pipe is not full, we put a new character
	buffer[top++]=c;
	//if the top is equal to the size the pipe is full.
	if (top==SIZE)
		isFull=true;
	//since we just put a new character, we know is not empty
	isEmpty=false;
	//Notify the resource is free
	notify();
}
}