package fr.eni.tp.m03tp02.bo;

public abstract class Persone {
    private long id;
    private String nom;
    private String prenom;

    public Persone(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Persone(long id, String nom, String prenom) {
        this(nom, prenom);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {;
        return "\n\t{\n\t\tNom : " + nom + "\n"
                + "\t\tPrénom : " + prenom + "\n"
                + "\t}";
//        return "{\n" + "\n\tid= " + id + ", \n\tnom= " + nom + ", \n\tprenom= " + prenom + "\n}";
    }
}
