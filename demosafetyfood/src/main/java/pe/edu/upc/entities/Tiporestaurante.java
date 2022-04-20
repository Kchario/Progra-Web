package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tiporestaurante")
public class Tiporestaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTiporestaurante;
	
	@Column(name = "Tiporestaurante", nullable = false,length = 47)
	private String tiporestaurante;
	
	
	public Tiporestaurante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiporestaurante(int idTiporestaurante, String tiporestaurante) {
		super();
		this.idTiporestaurante = idTiporestaurante;
		this.tiporestaurante = tiporestaurante;
		
	}

	public int getIdTiporestaurante() {
		return idTiporestaurante;
	}

	public void setIdTiporestaurante(int idTiporestaurante) {
		this.idTiporestaurante = idTiporestaurante;
	}

	public String getTiporestaurante() {
		return tiporestaurante;
	}

	public void setTiporestaurante(String tiporestaurante) {
		this.tiporestaurante = tiporestaurante;
	}

	
	
	
	
}
