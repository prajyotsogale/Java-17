import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}

class Customers {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customers(){}
    public Customers(String name){
        this.name = name;
    }
    public void credit(double amount){
        transactions.add(amount);
    }
    public void debit(double amount){
        transactions.add(-amount);
    }
}

class Bankk{
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bankk(){}
    public Bankk(String name){
        this.name = name;
    }

    public void addCustomer(Customer customer){
        if(customers.contains(customer)){
            System.out.println("Customer already registered!!");
            return;
        }
        customers.add(customer);
    }

//    public void printStatement()
}