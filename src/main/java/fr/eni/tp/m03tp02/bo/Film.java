package fr.eni.tp.m03tp02.bo;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private long id;
    private String titre;
    private int annee;
    private int duree;
    private String synopsis;
    private Genre genre;
    private Participant realisateur;
    private List<Participant> acteurs;
    private List<Avis> avis;

    {
        acteurs = new ArrayList<>();
        avis = new ArrayList<>();
    }

    public Film(String titre, int annee, int duree, String synopsis, Genre genre, Participant realisateur, List<Participant> acteurs, List<Avis> avis) {
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
        this.genre = genre;
        this.realisateur = realisateur;
        this.acteurs = acteurs;
        this.avis = avis;
    }

    public Film(long id, String titre, int annee, int duree, String synopsis, Genre genre, Participant realisateur, List<Participant> acteurs, List<Avis> avis) {
        this(titre, annee, duree, synopsis, genre, realisateur, acteurs, avis);
        this.id = id;
    }

    public Film(long id, String titre, int annee, int duree, String synopsis) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "Film (" + id + ") {\n"
                + "\tTitre : " + titre + "\n"
                + "\tAnnée : " + annee + "\n"
                + "\tDurée : " + duree + "minutes\n"
                + "\tSynopsis : " + synopsis + "\n"
                + "\tGenre : " + genre + "\n"
                + "\tRéalisateur : " + realisateur + "\n"
                + "\tActeurs : " + acteurs + "\n"
                + "\tAvis : " + avis + "\n}";
//        final StringBuilder sb = new StringBuilder("Film{");
//        sb.append("id=").append(id);
//        sb.append(", titre='").append(titre).append('\'');
//        sb.append(", annee=").append(annee);
//        sb.append(", duree=").append(duree);
//        sb.append(", synopsis='").append(synopsis).append('\'');
//        sb.append(", genre=").append(genre);
//        sb.append(", realisateur=").append(realisateur);
//        sb.append(", acteurs=").append(acteurs);
//        sb.append(", avis=").append(avis);
//        sb.append('}');
//        return sb.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Participant getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Participant realisateur) {
        this.realisateur = realisateur;
    }

    public List<Participant> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Participant> acteurs) {
        this.acteurs = acteurs;
    }

    public List<Avis> getAvis() {
        return avis;
    }

    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }
}
