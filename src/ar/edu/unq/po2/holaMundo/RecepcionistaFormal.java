package ar.edu.unq.po2.holaMundo;
import ar.edu.unq.po2.entes.Nombrable;


public class RecepcionistaFormal extends recepcionista {
	
	@Override
	protected String armarSaludo(Nombrable nombrable) {
	return "Buen día estimado " + nombrable.getNombre();
	}
}



