package ar.edu.unq.po2.holaMundo;
import ar.edu.unq.po2.entes.Nombrable;


public class recepcionistaClasico extends recepcionista {
	
	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "hola " + nombrable.getNombre(); 
	}

}
