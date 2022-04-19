package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Departamento;

public interface IDepartamentoDao {
	public void insert(Departamento p);

	public List<Departamento> list();
	
	public void delete(int idDepartamento);
}
