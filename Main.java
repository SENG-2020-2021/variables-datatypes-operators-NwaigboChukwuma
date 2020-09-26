class Main {
  public static void main(String[] args) {
  
        float Amount_To_Pay_Per_Day = 2000;
        float Amount_Paid = 5400;
        int Days_Defaulted = 6;

       
        float Total_Amount_To_Pay;
        int Days_Paid_For;
        float Amount_Left_To_Pay;
        int Days_Not_Payed_For;
        float Amount_Not_Captured;

        
        Total_Amount_To_Pay = Days_Defaulted * Amount_To_Pay_Per_Day;
        System.out.println("The total amount the debtor is to pay is = "+Total_Amount_To_Pay);

       
        Days_Paid_For = (int) (Amount_Paid / Amount_To_Pay_Per_Day);
        System.out.println("The days that were paid for by the debtor is = " + Days_Paid_For + " Days");

       
        Amount_Not_Captured = Amount_Paid % Amount_To_Pay_Per_Day;
        System.out.println("The amount not captured is = "+Amount_Not_Captured);

       
        Amount_Left_To_Pay = Total_Amount_To_Pay - Amount_Paid;
        System.out.println("The amount left to pay is = "+Amount_Left_To_Pay);

        
        Days_Not_Payed_For = Days_Defaulted - Days_Paid_For;
        System.out.println("The number of days not payed for is = " + Days_Not_Payed_For + " Days");
  }
}
