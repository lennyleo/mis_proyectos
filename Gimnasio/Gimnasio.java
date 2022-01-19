package parcialGim;

import java.util.ArrayList;

public class Gimnasio {

private String nombre;
private ArrayList<Socio>socios;
public Gimnasio( ) {
	
	this.nombre = nombre;
	this.socios = new ArrayList<Socio>();
}

public ResultadoAgregar agregarsocio(String dni ,String nombre, int categoria,int deuda , Estado estado ) {
ResultadoAgregar resultado = null;
if(buscarsoc(dni)!=null) {
	resultado=ResultadoAgregar.SOCIO_YA_EXISTE;
}else if(buscarsoc(dni)==null) {
	 this.getSocios().add(new Socio(dni , nombre , categoria , 0 , estado.NORMAL));
       resultado=ResultadoAgregar.SOCIO_AGREGADO;
}
  return resultado;
}


public ResultadoBaja quitarSocio(String dni) {
ResultadoBaja resultado=ResultadoBaja.SOCIO_NO_EXISTE;	
Socio socioBuscado= this.buscarsoc(dni);

if(socioBuscado!=null) {
	if(socioBuscado.getDeuda()>1) {
		resultado=ResultadoBaja.SOCIO_POSEE_DEUDA;
	}else {
		  resultado=ResultadoBaja.SOCIO_DADO_DE_BAJA;
		  this.socios.remove(socioBuscado);
	}
}

  return resultado;
}





private Socio buscarsoc (String dni) {
Socio socioBuscado=null;
int index=0;
while(socioBuscado==null && index < this.getSocios().size()) {
	if(this.getSocios().get(index).getDni().equals(dni)) {
		socioBuscado=this.getSocios().get(index);
	} else {
		  index++;
	}
}
      return socioBuscado;
}


private ArrayList<Socio> getSocios() {
	return socios;
}



@Override
public String toString() {
	return "Gimnasio [nombre=" + nombre + ", socios=" + socios + "]";
}

public void listarSocios(){
	for(Socio soc : this.socios) {
		  System.out.println(soc);
	}
}







}
