package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Tiporestaurante;
import pe.edu.upc.serviceinterfaces.ITiporestauranteService;

@Named
@RequestScoped
public class TiporestauranteController {
	// enlazar controller con service
	@Inject
	private ITiporestauranteService tService;

	// variables
	private Tiporestaurante t;
	List<Tiporestaurante> listaTiporestaurantes;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaTiporestaurantes = new ArrayList<Tiporestaurante>();
		this.t = new Tiporestaurante();
		this.list();
	}

	public String newTiporestaurante() {
		this.setT(new Tiporestaurante());
		return "tiporestaurante.xhtml";
	}

	public void insert() {
		try {
			tService.insert(t);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de tipo");
		}

	}

	public void list() {
		try {
			listaTiporestaurantes = tService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de tipo");
		}
	}

	public void delete(Tiporestaurante ters) {
		try {
			tService.delete(ters.getIdTiporestaurante());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}

	public Tiporestaurante getT() {
		return t;
	}

	public void setT(Tiporestaurante t) {
		this.t = t;
	}

	public List<Tiporestaurante> getListaTiporestaurantes() {
		return listaTiporestaurantes;
	}

	public void setListaTipoRestaurantes(List<Tiporestaurante> listaTiporestaurantes) {
		this.listaTiporestaurantes = listaTiporestaurantes;
	}

}

