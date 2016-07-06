public class HolaMundoN{

    public native void presentaSaludo();    
    
static{
 System.loadLibrary("hola");
}


public static void main(String[] args){

    new HolaMundoN().presentaSaludo();
}
}