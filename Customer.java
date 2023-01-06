public abstract class Customer {
    
    private String name;
    double amount;
    
    public Customer(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
    
    public abstract double calculateBill();
    
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
}
