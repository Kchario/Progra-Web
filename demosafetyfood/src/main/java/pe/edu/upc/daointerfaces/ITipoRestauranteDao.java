package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.TipoRestaurante;

public interface ITipoRestauranteDao {
	public void insert(TipoRestaurante p);

	public List<TipoRestaurante> list();
	
	public void delete(int idRestaurante);
}
