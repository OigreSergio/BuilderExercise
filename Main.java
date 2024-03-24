public class Main {
    public static void main(String[] args) {
        CreatePerson firstGenericPerson = new CreatePerson();

        firstGenericPerson.setPersonName("Sergio");
        firstGenericPerson.setPersonSurname("Hanganu");
        firstGenericPerson.setPersonAge(22);
        firstGenericPerson.setPersonMany(32);

        Person sergio = firstGenericPerson.createAnHuman();

        System.out.println(sergio);

        Person secondGenericPerson = new Person(
                "Giovanni", "Rossi", 45, 99
        );

        System.out.println(secondGenericPerson);
    }
}
