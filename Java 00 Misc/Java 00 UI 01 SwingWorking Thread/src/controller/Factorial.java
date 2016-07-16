//https://github.com/fernandocc17, July 2016.
package controller;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.swing.JLabel;
import javax.swing.SwingWorker;
public class Factorial extends SwingWorker<Long, JLabel> {
	Long n;
	JLabel jLabel;
	public Factorial(Long n, JLabel jLabel){
		this.n=n;
		this.jLabel=jLabel;
	}
	@Override
	protected Long doInBackground() throws Exception {
		Long result=calculate(n);
		JLabel tmpLabel=new JLabel(String.valueOf(result));
		//the publish method calls the process method to update the label with a result
		publish(tmpLabel);
		return result;
	}
	@Override
	protected void done() {
		try {
			//get() gets the results of doInBackground
			System.out.println("The process has ended, updating label with "+get().toString());
			jLabel.setText(get().toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void process(List<JLabel> chunks) {
		//how often this method actually gets the chance to update the label is not fixed.
		System.out.println("PROCESS"+chunks.toString());
		for(JLabel tmp: chunks){
			System.out.println(tmp.getText());
		}	
	}
	private long calculate(long n){
		long fact = 1;
		for (int c = 1; c <= n; c++){
			fact = fact * c;
			//this is just for stalling and making more time so the process method has more chance to run.
			for (int i=0;i<Integer.MAX_VALUE;i++){}
			}
		return fact;	
	}
	//this method is invoked from inside the publish method	
}