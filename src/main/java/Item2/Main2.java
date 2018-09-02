package Item2;

public class Main2 {

    public static void main(String[] args) {

        // 1. use constructor
        BankAccount account = new BankAccount(456L, "Marge", "Springfield", 100.00, 2.5);
        System.out.println(account.getOwner());

        // 2. use a builder
        BankAccountStatic anotherAccount = new BankAccountStatic.Builder(4567L)
                .withOwner("Homer")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();
        System.out.println(anotherAccount.getOwner());






    }

}
