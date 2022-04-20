package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoRestaurante ;
import pe.edu.upc.serviceinterfaces.ITipoRestauranteService;

@Named
@RequestScoped
public class TipoRestauranteController {
	// enlazar controller con service
	@Inject
	private ITipoRestauranteService pService;

	// variables
	private TipoRestaurante p;
	List<TipoRestaurante> listaTipoRestaurante;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaTipoRestaurante = new ArrayList<TipoRestaurante>();
		this.p = new TipoRestaurante();
		this.list();
	}

	public String newTipoRestaurante() {
		this.setP(new TipoRestaurante());
		return "TipoRestaurante.xhtml";
	}

	public void insert() {
		try {
			pService.insert(p);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de tipo restaurante");
		}

	}

	public void list() {
		try {
			listaTipoRestaurante = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de tipo restaurante");
		}
	}

	public void delete(TipoRestaurante pers) {
		try {
			pService.delete(pers. getIdRestaurante());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de tipo restaurante");
		}
	}

	public TipoRestaurante getP() {
		return p;
	}

	public void setP(TipoRestaurante p) {
		this.p = p;
	}

	public List<TipoRestaurante> getListaTipoRestaurante() {
		return listaDepartamentos;
	}

	public void setListaTipoRestaurante(List<TipoRestaurante> listaTipoRestaurante) {
		this.listaTipoRestaurante = listaTipoRestaurante;
	}

}
