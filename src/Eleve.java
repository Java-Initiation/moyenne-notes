import java.util.ArrayList;

public class Eleve {

    private String nom;
    private ArrayList<Note> notes = new ArrayList<>();

    public Eleve(String nom) {
        this.nom = nom;
    }

    public void ajouterNote(Note note){
        if (note.getNote() < 0)
            note.setNote(0);
        else if (note.getNote() > 20)
            note.setNote(20);
        notes.add(note);
    }

    public double moyenneNotes(){
        double totalNotes = 0;
        for (Note note: not es){
            totalNotes += note.getNote();
        }
        return totalNotes / notes.size();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }
}
