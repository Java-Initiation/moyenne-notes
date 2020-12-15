public class Note {

    private double note;
    private String commentaire;

    public Note(double note, String commentaire) {
        this.note = note;
        this.commentaire = commentaire;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

}
