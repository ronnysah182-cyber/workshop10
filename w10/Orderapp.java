package w10;


/**
 * Write a description of class s here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Orderapp{
    public static void main(String[] args){
        Normalorder n1 = new Normalorder(2, "Pankil",345);
        Premiumorder p1 = new Premiumorder(5, "Prabesh",2345);

        System.out.println(n1);
        System.out.println("Final amount: " + n1.calculateFinalAmount());
        System.out.println("discount amount: " + n1.calculateFinalAmount(140));

        System.out.println(p1);
        System.out.println("Final amount: " + p1.calculateFinalAmount());
        System.out.println("discount amount: " + p1.calculateFinalAmount(260));
    }
}