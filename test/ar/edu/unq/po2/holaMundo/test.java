package ar.edu.unq.po2.holaMundo;
import ar.edu.unq.po2.entes.Persona;
import ar.edu.unq.po2.entes.Nombrable;

public class test {
	
	public static void main(String[] args) {
		ar.edu.unq.po2.holaMundo.recepcionistaClasico recepcionistaClasico = new recepcionistaClasico();
		ar.edu.unq.po2.holaMundo.RecepcionistaFormal recepcionistaFormal = new RecepcionistaFormal();	
		Nombrable nombrable = new mundo();
		recepcionistaClasico.saludar(nombrable);
		recepcionistaFormal.saludar(nombrable);
		nombrable = new Persona("José");
		recepcionistaClasico.saludar(nombrable);
		recepcionistaFormal.saludar(nombrable);
	}
}

