package fr.eni.tp.m03tp02.bo;

public class Avis {
    private long id;
    private int note;
    private String commentaire;
    private Membre membre;

    public Avis(int note, String commentaire, Membre membre) {
        this.note = note;
        this.commentaire = commentaire;
        this.membre = membre;
    }

    public Avis(long id, int note, String commentaire,Membre membre) {
        this(note, commentaire, membre);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
//        final StringBuilder sb = new StringBuilder("Avis{");
//        sb.append("id=").append(id);
//        sb.append(", note=").append(note);
//        sb.append(", commentaire='").append(commentaire).append('\'');
//        sb.append('}');
        return "";
    }
}
