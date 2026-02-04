package behaviouralDesignPatterns.strategyPattern;

public class UPIPayment implements PaymentStrategy{

    private String upiId;

    public UPIPayment(String upiId){
        this.upiId=upiId;
    }


    @Override
    public void pay(int amount) {
        System.out.println("The payment id made using upiId: "+upiId+ " for an amount "+ amount);
    }
}
