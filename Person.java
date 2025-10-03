package mohirdev.oop_methodOverloading_constructor;

public class Person {
    String name = "John";
    String surname = "Doe";
    int age = 25;
    String sex = "man";
    boolean is_married = false;

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("Name - " + person.name);
        System.out.println("Surname - " + person.surname);
        System.out.println("Age - " + person.age);
        System.out.println("Sex - " + person.sex);
        System.out.println("Is married - " + person.is_married);
    }
}
