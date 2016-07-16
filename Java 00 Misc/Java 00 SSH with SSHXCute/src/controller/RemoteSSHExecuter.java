//https://github.com/fernandocc17, July 2016.
package controller;
import java.io.File;
import net.neoremind.sshxcute.core.ConnBean;
import net.neoremind.sshxcute.core.IOptionName;
import net.neoremind.sshxcute.core.Result;
import net.neoremind.sshxcute.core.SSHExec;
import net.neoremind.sshxcute.exception.TaskExecFailException;
import net.neoremind.sshxcute.task.CustomTask;
import net.neoremind.sshxcute.task.impl.ExecCommand;
public class RemoteSSHExecuter {
	static {
		cb=new ConnBean("","","");
	}
	public static ConnBean cb;//new ConnBean(server, user,pass);
	private final long TIMEBETWEENTASKS;
	private final long TIMEOUT;
	public RemoteSSHExecuter(String server, String user, String pass,long tIMEBETWEENTASKS, long tIMEOUT) {
		super();
		//how long a task should wait to start another
		TIMEBETWEENTASKS = tIMEBETWEENTASKS;
		//timeout to auto finish a task
		TIMEOUT = tIMEOUT;
		//setting them on the executer static options
		SSHExec.setOption(IOptionName.INTEVAL_TIME_BETWEEN_TASKS, TIMEBETWEENTASKS);
		SSHExec.setOption(IOptionName.TIMEOUT, TIMEOUT);
		cb.setHost(server);
		cb.setUser(user);
		cb.setPassword(pass);
	}
	//this is a simplified version of the execEnhanced, it only returns the output
	public String exec(String ucommand){
		//This method just receives the unix command,connects to the server, run it and returns the result.
		return execEnhanced(ucommand).sysout;
	}
	//this method is used so it can be more interactive, if you have a set of task that needs to be ran one after another this method should be used.
	public Result execEnhanced(String ucommand){
		//please note that this method is getting the connectionbean, which is a static object.
		//since it is static, there is only 1 object per JVM, so you cannot execute task on different servers at the same time, nonetheless you can run several task on 1 server with the same user.
		SSHExec ssh = SSHExec.getInstance(cb);
		//Please remember that when you connect to a server you connect to /home/yourUser, so if you are planning to execute a remote file, please use the absolute path.
		ssh.connect();
		CustomTask sampleTask = new ExecCommand(ucommand);
		Result res=null;
		try {
			res=ssh.exec(sampleTask);
		} catch (TaskExecFailException e) {
			e.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}
		finally{
			ssh.disconnect();
			ssh=null;
		}
		//The Result class is included on the sshxcute jar.
		//sysout= returns the console output
		//res.error_msg what kind of error happened
		//res.isSuccess boolean
		return res;
	}
	//every time something is executed a log of the connection is written with: user,password, unix commands and results.
	public boolean deleteLog(){
		try{
			File flog=new File("sshxcute.log");
			System.out.println("FILE "+flog.getAbsolutePath()+" DELETED");
			flog.delete();
			return true;	
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	//printing the configuration
	@Override
	public String toString() {
		try {
			SSHExec.showEnvConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Executer [TIMEBETWEENTASKS=" + TIMEBETWEENTASKS + ", TIMEOUT="
				+ TIMEOUT + "+SERVER="+cb.getHost()+", USER="+cb.getUser()+" ]";
	}
}