package fr.eni.tp.filmotheque.bll;

import fr.eni.tp.filmotheque.bo.Avis;
import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.Genre;
import fr.eni.tp.filmotheque.bo.Participant;

import java.util.List;

public class FilmServicesImpl implements FilmService{



    @Override
    public List<Film> consulterFilms() {
        return null;
    }

    @Override
    public Film consulterFilmParId(long id) {
        return null;
    }

    @Override
    public List<Genre> consulterGenres() {
        return null;
    }

    @Override
    public List<Participant> consulterParticipants() {
        return null;
    }

    @Override
    public Genre consulterGenreParId(long id) {
        return null;
    }

    @Override
    public Participant consulterParticipantParId(long id) {
        return null;
    }

    @Override
    public void creerFilm(Film film) {

    }

    @Override
    public String consulterTitreFilm(long id) {
        return null;
    }

    @Override
    public void publierAvis(Avis avis, long idFilm) {

    }

    @Override
    public List<Avis> consulterAvis(long idFilm) {
        return null;
    }
}
