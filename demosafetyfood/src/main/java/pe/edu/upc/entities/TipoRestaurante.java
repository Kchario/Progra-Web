package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipo_restaurante")
public class TipoRestaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRestaurante;
	
	@Column(name = "Nombredepartamento", nullable = false,length = 47)
	private String nombreRestaurante;
	
	
	public TipoRestaurante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoRestaurante(int idRestaurante, String nombreRestaurante) {
		super();
		this.idRestaurante = idRestaurante;
		this.nombreRestaurante = nombreRestaurante;
		
	}

	public int getIdRestaurante() {
		return idRestaurante;
	}

	public void setIdRestaurante(int idDepartamento) {
		this.idRestaurante = idRestaurante;
	}

	public String getNombreRestaurante() {
		return nombredepartamento;
	}

	public void setNombreRestaurante(String nombredepartamento) {
		this.nombreRestaurante = nombreRestaurante;
	}

	
	
	
	

}
