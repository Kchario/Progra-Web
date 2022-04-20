package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ITipoRestauranteDao;
import pe.edu.upc.entities.TipoRestaurante ;
import pe.edu.upc.serviceinterfaces.ITipoRestauranteService;

@Named
public class DepartamentoServiceImpl implements ITipoRestauranteService {
	@Inject
	private ITipoRestauranteService pDao;

	public void insert(TipoRestaurante p) {
		pDao.insert(p);
	}

	public List<TipoRestaurante> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}
	
	@Override
	public void delete(int idRestaurante) {
		// TODO Auto-generated method stub
		pDao.delete(idRestaurante);
		
	}
}
