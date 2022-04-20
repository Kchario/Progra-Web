package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Datopersonal;

public interface IDatopersonalDao {
	public void insert(Datopersonal p);

	public List<Datopersonal> list();
	
	public void delete(int idDatos);
}
