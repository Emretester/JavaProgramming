package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok", 122344566);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkbalance();

        account1.withdrow(900);
        account1.checkbalance();

        System.out.println("--------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 987564383);

        account2.deposit(10000);
        account2.checkbalance();




    }
}
