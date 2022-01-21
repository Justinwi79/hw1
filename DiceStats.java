//  Harold Justin Windham

import java.util.Random;
import java.util.Scanner;

class DiceStats {

    public static void main (String [] args) { 
        Random rand = new Random(); 
        Scanner scan = new Scanner(System.in); 

        System.out.print("How many dice will constitute one roll? ");
        int nDice = scan.nextInt(); // input dice in each roll.
        int[] arr = new int[(5 * nDice) + 1]; // dice array

        System.out.print("How many rolls? ");
        int nRoll = scan.nextInt(); // number of rolls

        for(int i = 0; i < nRoll; i++) // loop for rolls of dice
        {
            int sum = 0;
            for(int j = 0; j < nDice; j++) // loop for individual dice in each loop
            sum += rand.nextInt(6) + 1; 
            arr[sum - nDice]++; 
        }

        System.out.println("Sum\t# of times\tPercentage"); 
        for(int i = 0; i < (5 * nDice) + 1; i++) // loop for different sums 
        {
        System.out.printf("%d\t%d\t\t%.2f", i + nDice, arr[i], (float)(arr[i] * 100) / nRoll); 
        System.out.println(" %");
        }
    }
}