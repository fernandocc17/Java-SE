import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Lectora {

	static String leecad(){
		String s = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			s=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	static int leeInt(){
		int n;
		n=Integer.valueOf(leecad());
		return n;
	}
}
