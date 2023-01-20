package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * Returns the remaining amount on a loan after 3 months when 10% of the loan is paid off each month.
     *
     * <p>Note that the loan is interest free and the
     * parameter given to the getRemainingAmountIn3Months method must be an int</p>
     * 
     * @param amount the starting amount of the loan passed in as an int
     * @return the new loan amount after 10% has been paid off each month.
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method

        for(int i = 0;i<3;i++){
            amount -= (amount*0.1);
        }

        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
