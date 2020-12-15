public class Main {

    public static void main(String[] args) {

        Eleve eleve = new Eleve("toto");
        eleve.ajouterNote(new Note(-10, ""));
        eleve.ajouterNote(new Note(27, ""));
        eleve.ajouterNote(new Note(10, ""));
        System.out.println(eleve.moyenneNotes());

    }

}
