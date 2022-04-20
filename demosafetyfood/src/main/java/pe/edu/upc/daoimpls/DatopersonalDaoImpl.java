package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IDatopersonalDao;
import pe.edu.upc.entities.Datopersonal;

public class DatopersonalDaoImpl implements IDatopersonalDao {
	@PersistenceContext(unitName = "demosafetyfood")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Datopersonal p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar en departamento dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Datopersonal> list() {
		List<Datopersonal> listaPersonales = new ArrayList<Datopersonal>();
		try {
			Query jpql = em.createQuery("from Datopersonal p");
			listaPersonales = (List<Datopersonal>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar departamento en el dao!!");
		}
		return listaPersonales;
	}

	@Transactional
	@Override
	public void delete(int idDatos) {
		try {
			Datopersonal per = em.find(Datopersonal.class, idDatos);
			em.remove(per);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de persona");
		}

	}

}