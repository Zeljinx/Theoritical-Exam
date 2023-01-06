public class SeniorCustomer extends Customer{
    
    private final double discount;
    
    public SeniorCustomer(String name, int amount){
        
        super(name, amount);  
        this.discount = amount - (amount * 0.20);
    }

    @Override
    public double calculateBill() {
       return discount;
    }
    
        
    
 
}
