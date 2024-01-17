package fr.eni.tp.m03tp02.bo;

public class Genre {
    private long id;
    private String titre;

    public Genre(long id, String titre) {
        this.id = id;
        this.titre = titre;
    }
    public Genre(String titre) {
        this.titre = titre;
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

    @Override
    public String toString() {
        return titre;
//        final StringBuilder sb = new StringBuilder("Genre{");
//        sb.append("id=").append(id);
//        sb.append(", titre='").append(titre).append('\'');
//        sb.append('}');
//        return sb.toString();
    }
}
