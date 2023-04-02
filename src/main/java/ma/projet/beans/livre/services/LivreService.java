package ma.projet.beans.livre.services;

import ma.projet.beans.livre.dao.IDao;
import ma.projet.beans.livre.entities.Livre;
import ma.projet.beans.livre.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class LivreService implements IDao<Livre>{
    @Autowired
    private LivreRepository livreRepository;
    
    public Livre getLivreByIsbn(String isbn){
        return livreRepository.findByIsbn(isbn);
    }

    public List<Livre> findLivresByDateEditionBetween(Date startDate, Date endDate) {
        return livreRepository.findLivresByDateEditionBetween(startDate, endDate);
    }

	@Override
	public Livre save(Livre o) {
		// TODO Auto-generated method stub
		return livreRepository.save(o);
	}

	@Override
	public void update(Livre o) {
		// TODO Auto-generated method stub
		livreRepository.save(o);
	}

	@Override
    public void delete(int id){
		// TODO Auto-generated method stub
        livreRepository.deleteById(id);
    }
	
	@Override
	public Livre findById(int id) {
		// TODO Auto-generated method stub
		return livreRepository.findById(id);
	}

	@Override
	public List<Livre> findAll() {
		// TODO Auto-generated method stub
		return livreRepository.findAll();
	}
}
