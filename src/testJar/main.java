package testJar;

import bean.Persona;
import bean.Usuari;

public class main {

	public static void main(String[] args) {
		
		Usuari jordi = new Usuari(1, "Jordi", "123");
		Persona p1 = new Persona(53144482, "Xavier", "Martinez", "Sanahuja");
		
		System.out.println("Usuari:\nId:" + jordi.getId() + "\nUsuari:" + jordi.getUsuari() + "\nPassword:" + jordi.getPassword() + "\n**********");
		System.out.println("Persona:\nDNI:" + p1.getDni() + "\nNom:" + p1.getNom() + "\nPrimer Cognom:" + p1.getCognomPrimer() + "\nSegon Cognom:" 
					+ p1.getCognomSegon());

	}

}
