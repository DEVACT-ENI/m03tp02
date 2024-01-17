package fr.eni.tp.m03tp02.bll;

import fr.eni.tp.m03tp02.bo.Film;
import fr.eni.tp.m03tp02.bo.Genre;
import fr.eni.tp.m03tp02.bo.Participant;

import java.util.List;

public interface FilmService {
    List<Film> consulterFilms();
    Film consulterFilmParId(long id);
    List<Genre> consulterGenres();
    List<Participant> consulterParticipants();
    Genre consulterGenreParId(long id);
    Participant consulterParticipantParId(long id);
    void creerFilm(Film film);
}
