package BuPashaTugas;

public class savingsAccount {
    public double balance;
    public double interestRate;
    public String name;
    

    public void displayCustomer(){
        System.out.println("Customer Name: "+ name);
        System.out.println("balance: "+ balance);
        System.out.println("Interest Rate: "+interestRate);
        System.out.println("Interest earn: "+ (balance*interestRate));
        System.out.println("---------------------------");
        System.out.println("total balance after interest" + (balance + (balance * interestRate)));
        System.out.println("---------------------------");
        System.out.println("terimakasih telah menggunakan");

    }

    // Method to calculate monthly interest
    public double calculateInterest() {
        double interest = balance * interestRate / 12;
        return interest;
    }

}    

   
