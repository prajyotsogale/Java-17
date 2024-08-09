public class Bank {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public String getCustomerName(){
        return customerName;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }


    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void depositMoney(int amount){
        if(amount<=0){
            System.out.println("Can't deposit enter valid amount");
            return;
        }
        this.accountBalance +=amount;
        System.out.println("Balance : "+this.accountBalance);
    }
    public void withdrawMoney(int amount){
        if(amount<=0){
            System.out.println("Can't Withdraw enter valid amount");
            return;
        }
        this.accountBalance -=amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining Balance : "+this.accountBalance);
    }
}
