//My name is kashif ghafoor
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(10000, 20000, "Quintin", "Tarantino");
        PersonInterface personInterface1 = person1;

        System.out.println(
                "person1.getName() = " + person1.getName() + "," +
                        " person1.computeTotalWealth() = " +
                        person1.computeTotalWealth() + "," +
                "person1.measureIntelligence() = " +
                person1.measureIntelligence(person1.getName()));

        System.out.println(
                "personInterface1.getName() = " + personInterface1.getName() + "," +
                        " personInterface1.computeTotalWealth() = " +
                        personInterface1.computeTotalWealth());

        AnotherPersonInterface anotherPersonInterface1 = person1;
        boolean b1 = (personInterface1 == anotherPersonInterface1);
        System.out.println("Do personInterface1 and anotherPersonInterface1 point to the same object instance? " + b1);
    }
}
