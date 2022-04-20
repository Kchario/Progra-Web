package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Datopersonal;
import pe.edu.upc.serviceinterfaces.IDatopersonalService;

@Named
@RequestScoped
public class DatopersonalController {
	// enlazar controller con service
	@Inject
	private IDatopersonalService pService;

	// variables
	private Datopersonal p;
	List<Datopersonal> listaPersonales;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaPersonales = new ArrayList<Datopersonal>();
		this.p = new Datopersonal();
		this.list();
	}

	public String newDatopersonal() {
		this.setP(new Datopersonal());
		return "datopersonal.xhtml";
	}

	public void insert() {
		try {
			pService.insert(p);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de departamento");
		}

	}

	public void list() {
		try {
			listaPersonales = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de departamento");
		}
	}

	public void delete(Datopersonal pers) {
		try {
			pService.delete(pers.getIdDatos());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}

	public Datopersonal getP() {
		return p;
	}

	public void setP(Datopersonal p) {
		this.p = p;
	}

	public List<Datopersonal> getListaPersonales() {
		return listaPersonales;
	}

	public void setListaPersonales(List<Datopersonal> listaPersonales) {
		this.listaPersonales = listaPersonales;
	}

}
