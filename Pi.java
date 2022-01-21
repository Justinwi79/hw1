//  Harold Justin Windham

import java.util.Scanner;

class Pi { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.print("Compute to how many terms of the series? ");
        int N = sc.nextInt();

        double term_i,term = 4; // first term is term and term_i is ith term
        int i=1;
        System.out.printf("%s%25s%n", "Terms", "PI approximation");

        System.out.printf("%2d%,20.6f%n", i, term); // display first

        for(i=2;i<=N;i++){ // loop for calculating i terms

            term_i= (double)4/(2*i-1); // ith term

            if(i%2==1) // add odd terms and subtract even terms
            term += term_i;
            else
            term-=term_i;

            System.out.printf("%2d%,20.6f%n", i, term); 
        }
    }
}