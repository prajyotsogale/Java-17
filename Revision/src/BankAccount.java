public class BankAccount {
    private int accountNumber=0;
    private int accountBalance=0;
    private String customerNamer="Test";
    private String email="test@gmail.com";
    private long phoneNumber=9970247220l;

    public BankAccount(int accountNumber, int accountBalance, String customerNamer, String email, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerNamer = customerNamer;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void withdraw(int money){
        if(this.accountBalance<=0 || (this.accountBalance-money)<    0){
            System.out.println("Cant withdraw");
        }
        else{
            this.accountBalance -=money;
            System.out.println("Balance : "+this.accountBalance);
        }

    }
    public void deposit(int money){
        this.accountBalance +=money;
        System.out.println("Balance : "+this.accountBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerNamer() {
        return customerNamer;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerNamer(String customerNamer) {
        this.customerNamer = customerNamer;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
