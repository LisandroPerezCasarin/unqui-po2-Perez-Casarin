package ar.edu.unq.po2.holaMundo;
import ar.edu.unq.po2.entes.Nombrable;


public abstract class recepcionista {
	
	public void saludar(Nombrable nombrable) {
		System.out.println(this.armarSaludo(nombrable));
	}
	
	protected abstract String armarSaludo(Nombrable nombrable);
}
