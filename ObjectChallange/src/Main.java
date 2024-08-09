public class Main{
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.setAccountBalance(10000);
        bank.setAccountNumber(123123123);
        bank.setEmail("johndoe@gmail.com");
        bank.setCustomerName("John Doe");
        bank.setPhoneNumber(997066766);

        bank.depositMoney(2000);
        bank.withdrawMoney(4000);

    }
}