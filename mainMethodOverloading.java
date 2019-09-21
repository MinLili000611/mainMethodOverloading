package staticMethodOverload;
//This program explains overloading main method.
public class mainMethodOverloading {
	
  public static void main(boolean x) {
	  System.out.println("main(boolean x)called ");
  }
  
  public static void main(int x) {
	  System.out.println("main(int x)called");  
  }
	
   public static void main(int a, int b) {
	   System.out.println("main(int a, int b)called");
   }
   
   public static void main(String[]args) {
	   
	    System.out.println("main(String[]args)called");
	    mainMethodOverloading.main(true);
	    mainMethodOverloading.main(0);
	    mainMethodOverloading.main(37,46);	    
   }   		
}
