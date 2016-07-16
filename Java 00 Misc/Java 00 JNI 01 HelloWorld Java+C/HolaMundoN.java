public class HolaMundoN{

    public native void presentaSaludo();    
    
static{
 System.loadLibrary("Hello");
}


public static void main(String[] args){

    new HolaMundoN().presentaSaludo();
}
}