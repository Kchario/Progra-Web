package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Certificadominsalud")
public class Certificadominsalud {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCertificadominsalud;
	
	@Column(name = "Nombrecertminsalud", nullable = false,length = 47)
	private String nombrecertminsalud;
	
	
	public Certificadominsalud() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificadominsalud(int idCertificadominsalud, String nombrecertminsalud) {
		super();
		this.idCertificadominsalud = idCertificadominsalud;
		this.nombrecertminsalud = nombrecertminsalud;
		
	}

	public int getIdCertificadominsalud() {
		return idCertificadominsalud;
	}

	public void setIdCertificadominsalud(int idCertificadominsalud) {
		this.idCertificadominsalud = idCertificadominsalud;
	}

	public String getNombrecertminsalud() {
		return nombrecertminsalud;
	}

	public void setNombrecertminsalud(String nombrecertminsalud) {
		this.nombrecertminsalud = nombrecertminsalud;
	}

	
	
	
	

}
