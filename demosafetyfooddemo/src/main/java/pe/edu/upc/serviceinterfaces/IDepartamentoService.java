package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Departamento;

public interface IDepartamentoService {
	public void insert(Departamento p);

	public List<Departamento> list();
	
	public void delete(int idDepartamento );
}
