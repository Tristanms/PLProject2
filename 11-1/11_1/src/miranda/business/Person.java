package business;

import ui.Console;

public abstract class Person{
    String first_name;
    String last_name;
    String email_address;

    public void setFirst_name(String f){first_name = f;}
    public void setLast_name(String l){last_name = l;}
    public void setEmail_address(String e){email_address = e;}

    public String getFirst_name(){return first_name;}
    public String getLast_name(){return last_name;}
    public String getEmail_address(){return email_address;}

    @Override
    public String toString() {
        return "Name: " + first_name + " " + last_name + "\n" + "Email address: " + email_address;
    }

    public abstract String getDisplayText();

    public static void print(Person p) {
        Console.displayLine("You entered:\n" + p.getDisplayText());
    }

}