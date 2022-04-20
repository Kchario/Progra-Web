package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Certificadomuni")
public class Certificadomuni {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCertificadomuni;
	
	@Column(name = "Nombrecertmuni", nullable = false,length = 47)
	private String nombrecertmuni;
	
	
	public Certificadomuni() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificadomuni(int idCertificadomuni, String nombrecertmuni) {
		super();
		this.idCertificadomuni = idCertificadomuni;
		this.nombrecertmuni = nombrecertmuni;
		
	}

	public int getIdCertificadomuni() {
		return idCertificadomuni;
	}

	public void setIdCertificadomuni(int idCertificadomuni) {
		this.idCertificadomuni = idCertificadomuni;
	}

	public String getNombrecertmuni() {
		return nombrecertmuni;
	}

	public void setNombrecertmuni(String nombrecertmuni) {
		this.nombrecertmuni = nombrecertmuni;
	}

	
	
	
	

}
