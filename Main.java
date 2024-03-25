public class Main {
    public static void main(String[] args) {
Person genericUser = Person.builder("generic.user@gmail.com", "CoMpLiCaTeDpassWORD").build();
System.out.println(genericUser);
Person spesificUser = Person.builder("myMail@Outlook.com","W_as-fds124_pass").setName("Me").setAge(97).setSurname("YouKnow").build();
System.out.println(spesificUser);
    }
}
