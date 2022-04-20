package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.TipoRestaurante ;

public interface ITipoRestauranteService {
	public void insert(Departamento p);

	public List<TipoRestaurante > list();
	
	public void delete(int idRestaurante );
}