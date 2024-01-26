package fr.eni.tp.filmotheque.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import fr.eni.tp.filmotheque.bll.FilmService;
import fr.eni.tp.filmotheque.bo.Avis;
import fr.eni.tp.filmotheque.bo.Membre;

@Controller
@RequestMapping("/avis")
@SessionAttributes({"membreEnSession"})
public class AvisController {

    private FilmService filmService;

    public AvisController(FilmService filmService) {
        this.filmService = filmService;
    }

    // Création d'un nouvel avis
    @GetMapping("/creer")
    public String creerAvis(@RequestParam("idFilm") long idFilm, Model model,
                            @ModelAttribute("membreEnSession") Membre membreEnSession,
                            HttpServletRequest request) {
        if (membreEnSession != null && membreEnSession.getId() >= 1) {
            String titre = filmService.consulterTitreFilm(idFilm);
            if (titre != null) {
                model.addAttribute("titreFilm", titre);
                model.addAttribute("idFilm", idFilm);
                model.addAttribute("request", request.getRequestURI());
                Avis avis = new Avis();
                model.addAttribute("avis", avis);
                return "view-avis-form";
            }
        }
        return "redirect:/films";
    }

    // Récupération de l'objet opinion du formulaire
    // sauvegarde
    @PostMapping("/creer")
    public String creerAvis(@ModelAttribute("avis") Avis avis,
                            @RequestParam(name = "idFilm", required = true) long idFilm,
                            @ModelAttribute("membreEnSession") Membre membreEnSession) {
        if (membreEnSession != null && membreEnSession.getId() >= 1) {
            // Il y a un membre en session
            avis.setMembre(membreEnSession);
            System.out.println(avis);
            // Sauvegarde de l’avis avec l’identifiant du film :
            filmService.publierAvis(avis, idFilm);
        }
        // Redirection vers la liste des films :
        return "redirect:/films";
    }
}
