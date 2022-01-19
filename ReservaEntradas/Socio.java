package reserva_Entradas;

public class Socio {
private String DNI;
private String nombre;
private String apellido;
private int edad;
private boolean vacunado;
private Categoria categoria;
public Socio(String DNI, String nombre, String apellido, int edad, boolean vacunado, Categoria categoria) {
	
	this.DNI = DNI;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.vacunado = vacunado;
	this.categoria = categoria;
}
@Override
public String toString() {
	return "Socio [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", vacunado="
			+ vacunado + ", categoria=" + categoria + "]";
}
public String getDNI() {
	return DNI;
}
public boolean isVacunado() {
	return vacunado;
}
public Categoria getCategoria() {
	return categoria;
}





}


