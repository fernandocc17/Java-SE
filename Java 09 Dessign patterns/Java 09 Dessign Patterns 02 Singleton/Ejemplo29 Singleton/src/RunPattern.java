public class RunPattern{
    public static void main(String [] arguments){
        System.out.println("Example for Singleton pattern");
        System.out.println();
        System.out.println("This example will demonstrate the use of");
        System.out.println(" the Singleton pattern by creating two GUI");
        System.out.println(" editors, both of which will reference the");
        System.out.println(" same underlying history list.");
        
        System.out.println("Creating the first editor");
        System.out.println();
        SingletonGui editor1 = new SingletonGui();
        editor1.createGui();
        
        System.out.println("Creating the second editor");
        System.out.println();
        SingletonGui editor2 = new SingletonGui();
        editor2.createGui();
    }
}