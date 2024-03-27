public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    protected Person(PersonBuilder builder) {
        this.firstName = builder.getName();
        this.age = builder.getAge();
        this.lastName = builder.getSurname();
        this.address = builder.getEmail();
    }

    public static PersonBuilder builder(String firstName, String surname) {
        return new PersonBuilder(firstName, surname);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + firstName + '\'' + ", surname='" + lastName + '\'' + ", age=" + age + ", email='" + address + '\'' + '}';
    }
}

