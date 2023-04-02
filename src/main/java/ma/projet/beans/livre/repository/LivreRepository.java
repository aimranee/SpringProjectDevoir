package ma.projet.beans.livre.repository;

import ma.projet.beans.livre.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LivreRepository extends JpaRepository<Livre,Integer> {
	Livre findByIsbn(String isbn);
	Livre findById(int id);
	List<Livre> findLivresByDateEditionBetween(Date dateStart, Date dateEnd);

//    @Query("SELECT l FROM livres l WHERE l.date_edition BETWEEN :startDate AND :endDate")
//    List<Livre> findBooksByEditionDateBetween(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
	
}
