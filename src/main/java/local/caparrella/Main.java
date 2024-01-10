package local.caparrella;
public class Main {
    public static void main(String[] args) {
        // Crea un array d'objectes Persona
        Persona[] persones = new Persona[1];

        // Inicialitza els objectes a l'array
        persones[0] = new Persona("Khalil", 19);
      

        // Accedeix als objectes a l'array
        for (Persona persona : persones) {
            System.out.println("Nom: " + persona.getNom() + ", Edat: " + persona.getEdat());
        }
    }
}
