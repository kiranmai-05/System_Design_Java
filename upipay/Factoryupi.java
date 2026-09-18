package upipay;
public class Factoryupi{
    public Iupi createUpi(PaymentType type){
        switch(type){
            case PAYTM:
                return new Paytm();
            case PHONEPE:
                return new Phonepe();
            case GPAY:
                return new Gpay();
            case AMAZONPAY:
                return new Amazonpay();
            default:
                return null;
        }
    }
}