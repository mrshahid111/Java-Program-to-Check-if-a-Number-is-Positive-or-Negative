import java.util.Scanner;  
 public class PositiveNegative {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in); 
    
    System.out.print("Enter a Number: ");  
    double number = input.nextDouble();  
   

  
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

        
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

      
        else
            System.out.println(number + " is 0.");
    }
}
