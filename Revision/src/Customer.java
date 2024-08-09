public class Customer {
    private String name;
    private int creditLimit;
    private String emailAdd;

    public Customer(String name, int creditLimit, String emailAdd) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdd = emailAdd;
    }

    public Customer() {
        this("noname","anofficialnoname@gmail.com");
    }

    public Customer(String name, String emailAdd) {
        this(name,1000,emailAdd);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdd() {
        return emailAdd;
    }
}
