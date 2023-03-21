package bean;
import java.io.Serializable;

public class Persona implements Serializable{

	long dni;
	String nom;
	String cognomPrimer;
	String cognomSegon;
	
	public Persona() {
		
	}
	
	public Persona(long dni, String nom, String cognomPrimer, String cognomSegon) {
		super();
		this.dni = dni;
		this.nom = nom;
		this.cognomPrimer = cognomPrimer;
		this.cognomSegon = cognomSegon;
	}
	
	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognomPrimer() {
		return cognomPrimer;
	}

	public void setCognomPrimer(String cognomPrimer) {
		this.cognomPrimer = cognomPrimer;
	}

	public String getCognomSegon() {
		return cognomSegon;
	}

	public void setCognomSegon(String cognomSegon) {
		this.cognomSegon = cognomSegon;
	}

}
