import java.util.Scanner ; 
         public class IT24103527Lab6Q2C {
         public static void main(String[] args)  {

//Declaring variables
      int count=1 , Number, sum ; 
      int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,num7=0,num8=0,num9=0,num10=0 ; 
      double avg ; 
//Create an object called input to Scanner class
      Scanner input = new Scanner(System.in) ;
      System.out.println("Please enter 10 numbers here :") ;
//Taking user inputs and Looping
    while(count<=10)
 {
        System.out.println("Enter number " +count+ " : ") ;
        Number = input.nextInt() ; 
   
     //Store the Number in a variable based on count
         switch(count)
    {      
           case 1: num1=Number ; break ;
           case 2: num2=Number ; break ;
           case 3: num3=Number ; break ; 
           case 4: num4=Number ; break ; 
           case 5: num5=Number ; break ;
           case 6: num6=Number ; break ;
           case 7: num7=Number ; break ;
           case 8: num8=Number ; break ;
           case 9: num9=Number ; break ;
           case 10: num10=Number ; break ;   }

      //Increament
            count++ ;       }

//Display outputs
        System.out.println("The numbers you entered are :") ; 
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
        System.out.println(num10);
//Calculations
       sum = (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10 ) ;
       avg = sum/10 ;
//Display sum and average
       System.out.println("Sum of the numbers :" +sum) ;
       System.out.println("Average of the numbers :" +avg) ; 

     }
}