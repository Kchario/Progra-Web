package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Datopersonal;

public interface IDatopersonalService {
	public void insert(Datopersonal p);

	public List<Datopersonal> list();
	
	public void delete(int idDatos );
}
