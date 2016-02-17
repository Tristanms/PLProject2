package business;

public class Customer extends Person {
    public String customer_number;
    public void setCustomer_number(String cn){customer_number = cn;}
    public String getCustomer_number(){return customer_number;}

    @Override // override the abstract method
    public String getDisplayText() {
        return super.toString() + "\n" + "Customer number: " + customer_number;
    }
}
