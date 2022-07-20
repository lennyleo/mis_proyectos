
public class Item {


private int cantidad;
private Gusto gusto;
private Tamanio tamanio;

public Item(int cantidad, Gusto gusto, Tamanio tamanio) {

	this.cantidad = cantidad;
	this.gusto = gusto;
	this.tamanio = tamanio;
}

@Override
public String toString() {
	return "Item [cantidad=" + cantidad + ", gusto=" + gusto + ", tamanio=" + tamanio + "]";
}

public Gusto getGusto() {
	return gusto;
}

public Tamanio getTamanio() {
	return tamanio;
}


public boolean esCoincidente(Gusto gusto , Tamanio tamanio) {
boolean esCoincidente=false;

   if(gusto==Gusto.FUGAZZETA || gusto==Gusto.JAMÓN_Y_MORRONES|| gusto==Gusto.MUZZARELLA || gusto==Gusto.NAPOLITANA || gusto==Gusto.PROVOLONE || gusto==Gusto.VERDURA) {
	   if(tamanio == Tamanio.CHICA || tamanio == Tamanio.GRANDE || tamanio== Tamanio.INDIVIDUAL) {
		   esCoincidente=true;
	   }
   }
   
   return esCoincidente;
}

}
