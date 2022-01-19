package reserva_Entradas;

public class Ubicacion {

private int numID;
private Categoria c;
private Socio socio;
public Ubicacion(int numID) {
	
	this.numID = numID;
	this.c = c;
	this.socio = socio;
}
@Override
public String toString() {
	return "Ubicacion [numID=" + numID + ", c=" + c + ", socio=" + socio + "]";
}
public int getNumID() {
	return numID;
}


}
