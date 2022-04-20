package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Datopersonal")
public class Datopersonal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDatos;
	
	@Column(name = "Nombre", nullable = false,length = 47)
	private String nombre;
	
	@Column(name = "Apellido", nullable = false,length = 46)
	private String apellido;
	
	@Column(name = "Dni", nullable = false,length = 45)
	private String dni;
	
	@Column(name = "Correo", nullable = false,length = 44)
	private String correo;
	
	
	public Datopersonal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Datopersonal(int idDatos, String nombre, String apellido, String dni, String correo) {
		super();
		this.idDatos = idDatos;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.correo = correo;
		
	}

	public int getIdDatos() {
		return idDatos;
	}

	public void setIdDatos(int idDatos) {
		this.idDatos = idDatos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
