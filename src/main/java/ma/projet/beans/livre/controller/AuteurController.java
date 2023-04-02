package ma.projet.beans.livre.controller;

import ma.projet.beans .livre.entities.Auteur;
import ma.projet.beans.livre.entities.Livre;
import ma.projet.beans.livre.repository.AuteurRepository;
import ma.projet.beans.livre.services.AuteurService;
import ma.projet.beans.livre.services.LivreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("api")
public class AuteurController {
    @Autowired
    AuteurService auteurService;
    
    @Autowired
    LivreService livreService;

    @Autowired
    AuteurRepository auteurRepository;

    @GetMapping("/auteurs/{id}")
    public Auteur getAuteur(@PathVariable("id") int id){
    	return auteurRepository.findById(id);
    }

    @GetMapping("/auteurs")
    public List<Auteur> getAllAuteurs(){
    	return auteurService.findAll();
    }

    @GetMapping("/auteurs/{cin}")
    public Auteur getAuteurByCin(@PathVariable("cin") String cin){
    	return auteurService.getauteurByCin(cin);
    }

    @PostMapping("/auteurs/save")
    public void SaveAuteur(@RequestBody Auteur auteur){
    	auteurService.save(auteur);
    }

    @DeleteMapping("auteurs/{auteurid}/delete")
    public void deleteAuteur(@PathVariable("auteurid") int auteurId){
    	auteurService.delete(auteurId);
    }

    @GetMapping("/auteurs/livres/{cin}")
    public Set<Livre> findByLivre(@PathVariable("cin") String cin) {
        Auteur auteur= auteurService.getauteurByCin(cin);
        return  auteur.getLivres();
    }

    @PostMapping("/{authorId}/books/{bookId}")
    public void assignBookToAuthor(@PathVariable("authorId") int auteurId, @PathVariable("bookId") int livreId) {
        auteurService.assignLivreAuteur(auteurService.findById(auteurId), livreService.findById(livreId));
    }
}
