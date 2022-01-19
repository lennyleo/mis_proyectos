package parcialGim;

public class Socio {

private String dni;
private String nombre;
private int categoria;
private int deuda;
private Estado estado;
public Socio(String dni, String nombre, int categoria,int deuda,  Estado estado) {

	this.dni = dni;
	this.nombre = nombre;
	this.categoria = categoria;
	this.deuda=deuda;
	this.estado = estado;
}




@Override
public String toString() {
	return "Socio [dni=" + dni + ", nombre=" + nombre + ", categoria=" + categoria + ", deuda=" + deuda + ", estado="
			+ estado + "]";
}




public int getDeuda() {
	return deuda;
}




public String getDni() {
	return dni;
}




}
