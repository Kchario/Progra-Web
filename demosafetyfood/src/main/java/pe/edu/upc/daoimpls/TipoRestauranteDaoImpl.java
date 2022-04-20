package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ITipoRestauranteDao;
import pe.edu.upc.entities.TipoRestaurante ;

public class DepartamentoDaoImpl implements ITipoRestauranteDao {
	@PersistenceContext(unitName = "demosafetyfood")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(TipoRestaurante p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar en Tipo de restaurante dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	public List<TipoRestaurante> list() {
		List<TipoRestaurante> listaTipoRestaurante = new ArrayList<TipoRestaurante>();
		try {
			Query jpql = em.createQuery("from TipoRestaurante p");
			listaTipoRestaurante = (List<TipoRestaurante>) jpql.getResultList();

		} catch (Exception e) {
			System.out.println("Error al insertar en Tipo de restaurante dao!!");
		}
		return listaDepartamentos;
	}

	@Transactional
	@Override
	public void delete(int idRestaurante) {
		try {
			TipoRestaurante per = em.find(TipoRestaurante.class, idRestaurante);
			em.remove(per);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de persona");
		}

	}
}
