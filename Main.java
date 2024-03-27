public class Main {
    public static void main(String[] args) {
        Person genericUser = Person.builder("Sergio", "Hanganu").build();
        System.out.println(genericUser);
        Person spesificUser = Person.builder("Gianfranco", "ViaDeiNavigli 12 , Milano ").setAge(97).setAdress("ViaTalDeiTali 38 , Roma").build();
        System.out.println(spesificUser);
    }
}
