/**
* The MathOperators program can do addition, subtraction, multiplication, division, exponents and
* square root.
*
* @author Jaydin Madore
* @version 1.0
* @since 2023-02-20
*/

import java.util.Scanner;

public final class Logging {
    public static void main(String[] args) {
    try {
    Scanner input = new Scanner(System.in);
    final float MAX_WEIGHT = 1100;
    final float LOG_WEIGHT = 20;
    final float MAX_METERS = MAX_WEIGHT / LOG_WEIGHT ;

    System.out.print("Enter your log lengths (0.25m, 0.5m, 1m):");
    
    float log_length = input.nextFloat();
    float numLogs = MAX_METERS / log_length ;
    if ((log_length == .25) || (log_length == .5) || (log_length == 1)) {
        System.out.println("You can carry " + numLogs + " logs that are " + log_length + "m in length");
    }
    else {
        System.out.println("Must be 0.25m, 0.5m, or 1m ");
    }

    } catch (Exception e) {
      //error checks for letters 
      System.out.println("ERROR " + e.getMessage());
    }    
    }
}

