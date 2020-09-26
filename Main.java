class Main {
  public static void main(String[] args) {
  // Write your code here
        // Kindly use appropriate data types for your declaration
        // declare variables days the debtor defaulted, amount the debtor is to pay per day, amount the debtor paid and assign values to them
        float Amount_To_Pay_Per_Day = 2000;
        float Amount_Paid = 5400;
        int Days_Defaulted = 6;

        // Declare the variables of the total amount the debtor paid, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not yet payed for
        float Total_Amount_To_Pay;
        int Days_Paid_For;
        float Amount_Left_To_Pay;
        int Days_Not_Payed_For;
        float Amount_Not_Captured;

        // calculate and print total amount the debtor is to pay
        Total_Amount_To_Pay = Days_Defaulted * Amount_To_Pay_Per_Day;
        System.out.println("The total amount the debtor is to pay is = "+Total_Amount_To_Pay);

        // calculate and print the days the debtor payed for
        Days_Paid_For = (int) (Amount_Paid / Amount_To_Pay_Per_Day);
        System.out.println("The days that were paid for by the debtor is = " + Days_Paid_For + " Days");

        // calculate and print the amount whose day was not captured because the amount was incomplete
        Amount_Not_Captured = Amount_Paid % Amount_To_Pay_Per_Day;
        System.out.println("The amount not captured is = "+Amount_Not_Captured);

        // calculate and print the amount the debtor is left to pay
        Amount_Left_To_Pay = Total_Amount_To_Pay - Amount_Paid;
        System.out.println("The amount left to pay is = "+Amount_Left_To_Pay);

        //Calculate and print days the debtor has not yet payed for
        Days_Not_Payed_For = Days_Defaulted - Days_Paid_For;
        System.out.println("The number of days not payed for is = " + Days_Not_Payed_For + " Days");
  }
}
