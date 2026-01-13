package w10;


/**
 * Write a description of class s here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order{
    private int orderId;
    private String customerName;
    private double amount;

    public Order(int orderId, String customerName, double amount){
        this.orderId=orderId;
        this.customerName=customerName;
        this.amount=amount;
    }

    public int getOrderId(){
        return orderId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double calculateFinalAmount(){
        return amount;
    }

    @Override
    public String toString(){
        return "Order ID: " + orderId +",Customer: " + customerName +",Amount: " + amount;
    }
}