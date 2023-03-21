package bean;
import java.io.Serializable;

public class Usuari implements Serializable{

	long id;
	String usuari;
	String password;
	
	public Usuari() {
		
	}
	
	public Usuari(long id, String usuari, String password) {
		super();
		this.id = id;
		this.usuari = usuari;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuari() {
		return usuari;
	}

	public void setUsuari(String usuari) {
		this.usuari = usuari;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
