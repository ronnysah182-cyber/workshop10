package w10;


/**
 * Write a description of class d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Normalorder extends Order{

    public Normalorder(int orderId, String customerName, double amount){
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() {
        double tax=super.calculateFinalAmount()*0.05;
        return super.calculateFinalAmount()+tax;
    }

    public double calculateFinalAmount(double discountAmount){
        return calculateFinalAmount()-discountAmount;
    }
}