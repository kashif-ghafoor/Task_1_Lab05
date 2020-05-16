//My name is kashif ghafoor
public class Person implements PersonInterface,AnotherPersonInterface {
    int cashSaving;
    int retirementFund;
    String firstName;
    String lastName;
    public Person(int cs, int rf, String fName, String lName) {
        cashSaving = cs;
        retirementFund = rf;
        firstName = fName;
        lastName = lName;
    }
    public int computeTotalWealth() {
        return cashSaving+retirementFund;
    }
    public String getName() {
        return firstName+" "+lastName;
    }
    public int measureIntelligence(String firstName) {
        if (firstName.startsWith("smart"))
            return 100;
        else
            return 50;
    }
}
