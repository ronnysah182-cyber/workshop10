package w10;


/**
 * Write a description of class x here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Premiumorder extends Order{

    public Premiumorder(int orderId, String customerName, double amount){
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() {
        double tax=super.calculateFinalAmount()*0.10;
        double servicecharge=50;
        return super.calculateFinalAmount()+tax+servicecharge;
    }

    public double calculateFinalAmount(double discountAmount) {
        return calculateFinalAmount()-discountAmount;
    }
}