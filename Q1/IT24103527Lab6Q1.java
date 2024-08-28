import java.util.Scanner ; 
        public class IT24103527Lab6Q1 {
        public static void main(String[] args)  { 
 //Declaring variables
        double Number , Squre , SqureRoot ;
//Create an object called input to Scanner class
        Scanner input = new Scanner(System.in) ; 
//Take user inputs
        System.out.println("Enter a number:") ; 
        Number = input.nextDouble() ; 
//Checking the conditions 
      if(Number > 0)
  { 
       Squre = Number * Number ; 
       SqureRoot = Math.sqrt(Number) ;
       System.out.println("The squre of " +Number+ " is :" +Squre) ; 
       System.out.println("The squre root of " +Number+ " is :" +SqureRoot) ; } 

    else 
 { 
      Squre = Number * Number ;  
      System.out.println("The squre root of a minus number is a complex number") ;
      System.out.println("The squre of " +Number+ " is :" +Squre) ;       }


   }
}
          
 
         
        