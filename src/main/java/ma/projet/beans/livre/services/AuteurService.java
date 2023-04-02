package ma.projet.beans.livre.services;


import ma.projet.beans.livre.dao.IDao;
import ma.projet.beans.livre.entities.Auteur;
import ma.projet.beans.livre.entities.Livre;
import ma.projet.beans.livre.repository.AuteurRepository;
import ma.projet.beans.livre.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuteurService implements IDao<Auteur>{
    @Autowired
    AuteurRepository auteurRepository;
    @Autowired
    LivreRepository livreRepository;

    public Auteur getauteurById(int id){
    	
        return auteurRepository.findById(id);
        
    }
    
    public Auteur getauteurByCin(String cin ){

        return auteurRepository.findByCin(cin);
    }
    
    public void assignLivreAuteur(Auteur auteur, Livre livre){
      
	    if(auteur!=null && livre!=null){
	        
	    	Auteur auteurModif = auteur;
	        auteurModif.getLivres().add(livre);
	        auteurRepository.save(auteurModif);
	
	    }
    	else System.out.println("Not found auteur or livre");
    }

	@Override
	public Auteur save(Auteur o) {
		// TODO Auto-generated method stub
		return auteurRepository.save(o);
	}

	@Override
	public void update(Auteur o) {
		// TODO Auto-generated method stub
		auteurRepository.save(o);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		auteurRepository.deleteById(id);
	}

	@Override
	public Auteur findById(int id) {
		// TODO Auto-generated method stub
		return auteurRepository.findById(id);
	}

	@Override
	public List<Auteur> findAll() {
		// TODO Auto-generated method stub
		return  auteurRepository.findAll();
	}

}
