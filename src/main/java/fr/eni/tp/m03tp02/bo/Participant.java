package fr.eni.tp.m03tp02.bo;

public class Participant extends Persone{
    public Participant(String nom, String prenom) {
        super(nom, prenom);
    }
    public Participant(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public long getId() {
        return super.getId();
    }

    public Participant(long id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
