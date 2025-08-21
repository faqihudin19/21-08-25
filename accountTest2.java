public class accountTest2 {
    public static void main(String[] args){

        savingsAccount sa0001 = new savingsAccount();
        sa0001.balance = 1000;
        sa0001.balance += sa0001.calculateInterest();
        sa0001.name = "Udin";
        sa0001.interestRate = 0.02;
        sa0001.displayCustomer();
        savingsAccount sa0002 = new savingsAccount();
        sa0002.balance = 2000;
        sa0002.balance += sa0002.calculateInterest();
        sa0002.name = "bela";
        sa0002.interestRate = 0.03;
        sa0002.displayCustomer();

        double quotient = sa0002.balance / sa0001.balance;
        System.out.println("Hasil saldo dari " + sa0002.name + "dibagi dengan saldo " + sa0001.name + ":" + quotient);
        

    }
}
