import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sumadora {

	 int a,b ,sum;
	
	public Sumadora(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Dame el primer valor");
		try {
			a=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Dame el segundo valor");
		try {
			b=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			sum=a/b;			
		}catch(ArithmeticException arit){
			System.out.println(arit.getMessage() );
			
		}finally{
			System.out.println("Este es el fin");
		}
		
		
		System.out.println(sum);
	}
	
}
