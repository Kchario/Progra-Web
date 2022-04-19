package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Departamento;
import pe.edu.upc.serviceinterfaces.IDepartamentoService;

@Named
@RequestScoped
public class DepartamentoController {
	// enlazar controller con service
	@Inject
	private IDepartamentoService pService;

	// variables
	private Departamento p;
	List<Departamento> listaDepartamentos;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaDepartamentos = new ArrayList<Departamento>();
		this.p = new Departamento();
		this.list();
	}

	public String newDepartamento() {
		this.setP(new Departamento());
		return "departamento.xhtml";
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
			listaDepartamentos = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de departamento");
		}
	}

	public void delete(Departamento pers) {
		try {
			pService.delete(pers.getIdDepartamento());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}

	public Departamento getP() {
		return p;
	}

	public void setP(Departamento p) {
		this.p = p;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}

}
