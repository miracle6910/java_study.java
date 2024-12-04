package Tregulov;

public class BankAccaunt {
    int id;
    String name = "somebody";
    double balance;

    double popolnenieScheta(double plus){
        double result = balance + plus;
        return result;
    }
    double snyatieSoScheta(double minus){
        double result1 = balance - minus;
        return result1;
    }
}


class BankAccountTest{
    public static void main(String[] args) {

        BankAccaunt MyAccaunt = new BankAccaunt();
        BankAccaunt YourAccaunt = new BankAccaunt();
        BankAccaunt HisAccaunt = new BankAccaunt();

        MyAccaunt.id = 1;
        MyAccaunt.name = "Zaur";
        MyAccaunt.balance = 15.05;
        System.out.println(MyAccaunt.popolnenieScheta(30));
        System.out.println(MyAccaunt.snyatieSoScheta(5));
        HisAccaunt.id = 2;
        HisAccaunt.name = "Mike";
        HisAccaunt.balance = 2.00;

        YourAccaunt.id = 3;
        YourAccaunt.name = "Ivan";
        YourAccaunt.balance = 124.05;
    }
}
