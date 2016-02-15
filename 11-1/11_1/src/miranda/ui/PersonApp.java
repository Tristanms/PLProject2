import business.Customer;
import business.Employee;

import java.lang.*;
import java.util.*;

public class PersonApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Person Tester Application");
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("\nCreate customer or employee? (c/e): ");
            String user_select = sc.nextLine();

            if(user_select.equalsIgnoreCase("c")){
                Customer p1 = new Customer();
                System.out.print("Enter first name: ");
                p1.setFirst_name(sc.nextLine());
                System.out.print("Enter last name: ");
                p1.setLast_name(sc.nextLine());
                System.out.print("Enter email address: ");
                p1.setEmail_address(sc.nextLine());
                System.out.print("Customer number: ");
                p1.setCustomer_number(sc.nextLine());

            }
            else if(user_select.equalsIgnoreCase("e")){
                Employee p1 = new Employee();
                System.out.print("Enter first name: ");
                p1.setFirst_name(sc.nextLine());
                System.out.print("Enter last name: ");
                p1.setLast_name(sc.nextLine());
                System.out.print("Enter email address: ");
                p1.setEmail_address(sc.nextLine());
                System.out.print("Social security number: ");
                p1.setSocial_security(sc.nextLine());
            }


        }

    }
}