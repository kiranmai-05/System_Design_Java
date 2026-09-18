package upipay;
import java.util.*;
public class Client{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String type=sc.nextLine();
        PaymentType pt=PaymentType.valueOf(type.toUpperCase());
        Iupi upi=new Factoryupi().createUpi(pt);
        upi.pay();
    }
}