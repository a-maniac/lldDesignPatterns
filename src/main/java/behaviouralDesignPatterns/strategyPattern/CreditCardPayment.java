package behaviouralDesignPatterns.strategyPattern;

public class CreditCardPayment implements PaymentStrategy{

    public String creditCardNumber;

    public CreditCardPayment(String creditCardNumber){
        this.creditCardNumber=creditCardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("The payment is made with credit card having number: "+ creditCardNumber +" for an amount "+ amount);
    }
}
