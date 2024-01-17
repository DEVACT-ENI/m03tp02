package fr.eni.tp.m03tp02.Controller;

import fr.eni.tp.m03tp02.bll.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmController {
    private FilmService filmService;
    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    public void afficherUnFilm(int i) {
        System.out.println(filmService.consulterFilmParId(i));
    }

    public void afficherFilms() {
        System.out.println(filmService.consulterFilms());
    }

    @GetMapping("/film")
    public String film(Model model) {
        model.addAttribute("film", filmService.consulterFilms());
        return "film.html";
    }
}
