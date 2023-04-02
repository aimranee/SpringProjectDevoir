package ma.projet.beans.livre.dao;

import java.util.List;

public interface IDao<T> {
	T save (T o);
	
	void update(T o);
	
	void delete(int id);
	
	T findById(int id);
	
	List<T> findAll();
	
}