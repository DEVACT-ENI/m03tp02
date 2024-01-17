package fr.eni.tp.m03tp02.bo;

import java.util.ArrayList;
import java.util.List;

public class Membre extends Persone {
    private String pseudo;
    private String motDePasse;
    private boolean admin = false;

    public Membre(int id, String nom, String prenom, String pseudo, String motDePasse) {
        super(id, nom, prenom);
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = admin;
    }

    public Membre(String nom, String prenom, String pseudo, String motDePasse, boolean admin) {
        super(nom, prenom);
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = admin;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


    @Override
    public String toString() {
        return "Membre{\n\tpseudo= " + pseudo + ",\n\tadmin=" + admin + "\n}\n";
    }
}
