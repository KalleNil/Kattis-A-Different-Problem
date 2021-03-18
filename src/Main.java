
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()){
            String[] numberInput = scan.nextLine().split(" ");
            
            long number1 = Long.parseLong(numberInput[0]);
            long number2 = Long.parseLong(numberInput[1]);
            
            if (number1>number2){
                System.out.println(number1-number2);
            }else if (number2>number1){
                System.out.println(number2-number1);
            }else{
                System.out.println(0);
            }
            
        }
        scan.close();
            
        
    }
    
}
