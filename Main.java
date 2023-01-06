public class Main {
    public static void main(String[]orgs){
    Customer customer;
    RegularCustomer regularcustomer = new RegularCustomer("Jose", 500);
    SeniorCustomer  seniorcustomer = new SeniorCustomer("Juan", 500);
    
    customer = regularcustomer;
    System.out.println(customer.calculateBill() + "\t" + customer.getName() + ".");
    
    customer = seniorcustomer;
    System.out.println(customer.calculateBill() + "\t" + customer.getName() + ".");
    }
    
}
