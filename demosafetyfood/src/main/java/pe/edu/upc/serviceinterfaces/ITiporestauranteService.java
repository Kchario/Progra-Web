package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Tiporestaurante;

public interface ITiporestauranteService {
	public void insert(Tiporestaurante t);

	public List<Tiporestaurante> list();
	
	public void delete(int idTiporestaurante );
}
