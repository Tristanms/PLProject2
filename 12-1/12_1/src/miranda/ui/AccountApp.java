package ui;

public class AccountApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the Account Calculator");
        System.out.println();

        Boolean go = true;
        String choice = "y";
        while (choice.equalsIgnoreCase("y") && go) {
            //get input from user
            String personType = Console.getString("Create customer or employee? (c/e): ");
            System.out.println();

            if (personType.equalsIgnoreCase("c") || personType.equalsIgnoreCase("e")) {
                String firstName = Console.getString("Enter first name: ");
                String lastName = Console.getString("Enter last name: ");
                String emailAddress = Console.getString("Enter email address: ");

                if (personType.equalsIgnoreCase("c")) {
                    String customerNumber = Console.getString("Customer number: ");
                    System.out.println();

                    Customer c = new Customer();
                    c.setFirst_name(firstName);
                    c.setLast_name(lastName);
                    c.setEmail_address(emailAddress);
                    c.setCustomer_number(customerNumber);

                    //print out using print() function
                    Person.print(c);
                    System.out.println();

                } else if (personType.equalsIgnoreCase("e")) {
                    String ssn = Console.getString("Social security number: ");
                    System.out.println();

                    Employee e = new Employee();
                    e.setFirst_name(firstName);
                    e.setLast_name(lastName);
                    e.setEmail_address(emailAddress);
                    e.setSocial_security(ssn);

                    //print out
                    Person.print(e);
                    System.out.println();

                }
            }

            //check to see if continue
            String cont = Console.getString("Continue? (y/n): ");
            if (cont.equalsIgnoreCase("n")) {
                go = false;
            } else {
                System.out.println();
            }
        }

    }
}
