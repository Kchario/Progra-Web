package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IDepartamentoDao;
import pe.edu.upc.entities.Departamento;

public class DepartamentoDaoImpl implements IDepartamentoDao {
	@PersistenceContext(unitName = "demosafetyfood")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Departamento p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar en departamento dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Departamento> list() {
		List<Departamento> listaDepartamentos = new ArrayList<Departamento>();
		try {
			Query jpql = em.createQuery("from Departamento p");
			listaDepartamentos = (List<Departamento>) jpql.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar departamento en el dao!!");
		}
		return listaDepartamentos;
	}

	@Transactional
	@Override
	public void delete(int idDepartamento) {
		try {
			Departamento per = em.find(Departamento.class, idDepartamento);
			em.remove(per);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de persona");
		}

	}
}