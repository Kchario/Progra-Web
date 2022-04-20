package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IDatopersonalDao;
import pe.edu.upc.entities.Datopersonal;
import pe.edu.upc.serviceinterfaces.IDatopersonalService;

@Named
public class DatopersonalServiceImpl implements IDatopersonalService {
	@Inject
	private IDatopersonalDao pDao;

	public void insert(Datopersonal p) {
		pDao.insert(p);
	}

	public List<Datopersonal> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}
	
	@Override
	public void delete(int idDatos) {
		// TODO Auto-generated method stub
		pDao.delete(idDatos);
		
	}
}
