import java.util.Scanner ;
       public class IT24103527Lab6Q3  {
       public static void main(String[] args)  {
//Declaring variables
        int count=1 , number ; 
        double RMS=0.0 , sumOfsqure=0.0 ; 
//Create an object called input to Scanner class
      Scanner input = new Scanner(System.in) ;
      System.out.println("Enter positive integers(terminate input with -99)") ; 
//Taking user inputs 
       System.out.println("Enter a number :") ; 
       number = input.nextInt() ;

    while(number!=-99)
  {
       if(number<0)
     {
          System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.") ;
                              break ;  }
       else
    {
          System.out.println("Enter a number :") ;
          number = input.nextInt() ;    
          count++  ;        }
                                   }

//calculations for RMS
         if(count>0)
   {
          sumOfsqure += number * number ; 
          RMS = Math.sqrt(sumOfsqure/count) ;  }

         else
    {
            System.out.println("No valid numbers were entered") ;   }

//Show the output
        System.out.println("The root mean square is :" +RMS) ; 
         
     }
}