//  Harold Justin Windham 

import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        while(true){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a long integer. (zero to quit):");
        int num = input.nextInt(); // input number to reverse
        
            if (num == 0) {
            System.out.println("Goodbye");
            break; // ending program with Goodbye message if input is 0
            }
            else
            System.out.println("The number reversed is: " + reverseDigits(num)); // print reverse number
        }
    }
    public static int reverseDigits(int num) {
        int numR = 0; // function to reverse number
        int digit = 0;
        while (num != 0) {
            digit = num % 10; 
            num /= 10;
            numR *= 10; 
            numR += digit;
        }
        return numR;
    }
}