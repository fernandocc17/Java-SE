public class HelloJNI {
   static {
	   //this will load the hello.dll that we created, since it is on a static block, this will be done before the object construction.
      System.loadLibrary("hello"); 
   }
   // sayHello() is a native method, so it won't body, like an abstract method 
   private native void sayHello();
 
   public static void main(String[] args) {
	   //we create an instance and use the native method.
	   new HelloJNI().sayHello();  
   }
}