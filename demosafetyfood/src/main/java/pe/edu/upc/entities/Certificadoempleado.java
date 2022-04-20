package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Certificadoempleado")
public class Certificadoempleado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCertificadoempleado;
	
	@Column(name = "Nombrecertempleado", nullable = false,length = 47)
	private String nombrecertempleado;

	public Certificadoempleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificadoempleado(int idCertificadoempleado, String nombrecertempleado) {
		super();
		this.idCertificadoempleado = idCertificadoempleado;
		this.nombrecertempleado = nombrecertempleado;

	}

	public int getIdCertificadoempleado() {
		return idCertificadoempleado;
	}

	public void setIdCertificadoempleado(int idCertificadoempleado) {
		this.idCertificadoempleado = idCertificadoempleado;
	}

	public String getNombrecertempleado() {
		return nombrecertempleado;
	}

	public void setNombrecertempleado(String nombrecertempleado) {
		this.nombrecertempleado = nombrecertempleado;
	}

}
