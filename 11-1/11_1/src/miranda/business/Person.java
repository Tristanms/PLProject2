package business;


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

}