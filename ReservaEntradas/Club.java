package reserva_Entradas;

import java.util.ArrayList;

public class Club {

private String nombre_Club;
private ArrayList<Socio>socios;
private ArrayList<Ubicacion>ubicaciones;
private int cantidadEntradasDisponibles;
private int contEntradas;
private ResultadoReserva resultado;
public Club(String nombre_Club,int cantidadEntradasDisponibles) {
	this.nombre_Club = nombre_Club;
	this.socios = new ArrayList<Socio>();
	this.ubicaciones = new ArrayList<Ubicacion>();
	this.setCantidadEntradasDisponibles(cantidadEntradasDisponibles);
}

@Override
public String toString() {
	return "Club [nombre_Club=" + nombre_Club + ", socios=" + socios + ", ubicaciones=" + ubicaciones
			+ ", cantidadEntradasDisponibles=" + cantidadEntradasDisponibles + "]";
}


private Socio buscarSocio(String DNI) { //buscador_de_socios //
Socio socioBuscado=null;
int index=0;

while(socioBuscado==null&& index < this.socios.size()) {
	if(this.socios.get(index).getDNI().equals(DNI)) {
		socioBuscado=this.socios.get(index);
	} else {
		    index++;
	}
}
 return socioBuscado;
}

           //agrega_un_nuevo_socio_a_la_lista_de_socios
public Socio agregarSocio(String DNI, String nombre, String apellido, int edad, boolean vacunado, Categoria categoria) {
Socio nuevoSocio= new Socio (DNI , nombre ,apellido ,edad ,vacunado , categoria);

this.socios.add(nuevoSocio);

return nuevoSocio;
}

 //metodo_para_reservar_Entradas//

public ResultadoReserva reserva(String DNI , int numID) {
ResultadoReserva result= ResultadoReserva.ESTADIO_COMPLETO;	


if(contEntradas<=cantidadEntradasDisponibles) {
	Socio socioBuscado=buscarSocio(DNI);
result=ResultadoReserva.SOCIO_INEXISTENTE;
if(socioBuscado!=null) {
if(socioBuscado.isVacunado()==false) {
result=ResultadoReserva.SOCIO_NO_VACUNADO;	
}else if(socioBuscado.getCategoria()==Categoria.INACTIVO) {
	result=ResultadoReserva.SOCIO_INACTIVO;
}else {
	Ubicacion ubic= this.buscarUbicacion(numID);
	result=ResultadoReserva.UBICACION_INEXISTENTE;
	if(ubic!=null) {
		result=ResultadoReserva.UBICACION_COMPLETA;
	} else {
		 result=ResultadoReserva.RESERVA_EXITOSA;
		 contEntradas++;
		 this.ubicaciones.add(new Ubicacion(numID));
	}
}


}


}

 return result;
}







private Ubicacion buscarUbicacion(int numID) {
Ubicacion ubicacionBuscada=null;
int index=0;
while(ubicacionBuscada==null&& index<this.ubicaciones.size()) {
	if(this.ubicaciones.get(index).getNumID()==numID) {
		ubicacionBuscada=this.ubicaciones.get(index);
	} else {
		  index++;
	}
}

 return ubicacionBuscada;
}

private void setCantidadEntradasDisponibles(int cantidadEntradasDisponibles) {
	this.cantidadEntradasDisponibles = cantidadEntradasDisponibles;
}





}
