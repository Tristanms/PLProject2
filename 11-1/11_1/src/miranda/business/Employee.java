package business;

public class Employee extends Person {
    public String social_security;
    public void setSocial_security(String s){this.social_security = s;}
    public String getSocial_security(){return social_security;}

    @Override // override the abstract method
    public String getDisplayText() {
        return super.toString() + "\n" + "Social security number: " + social_security;
    }


}