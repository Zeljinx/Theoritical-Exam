public class RegularCustomer extends Customer{
    
    private double amount;
    
    public RegularCustomer(String name, int amount){
        
        super(name, amount);
        this.amount = amount;
    }
    
    @Override
    public double calculateBill(){
        return amount; 
    }
    public double getAmount(){
        return amount;
    }
    public double setAmount(double amount){
        return amount;
    }
    
}
