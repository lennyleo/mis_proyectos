package parcialGim;

public class Test {


public static void main(String[] args) {
		
Gimnasio gim = new Gimnasio();


//prueba_Agregar_Nuevos_Usuarios
System.out.println(gim.agregarsocio("1", "pedro", 1, 2300, Estado.MOROSO));
System.out.println(gim.agregarsocio("2", "juan", 1, 0, Estado.NORMAL));
System.out.println(gim.agregarsocio("1", "pedro", 2, 0, Estado.NORMAL));
System.out.println(gim.agregarsocio("4", "agustina", 3, 0, Estado.MOROSO));

System.out.println("***************************************");


//prueba_Quitar_Socio
System.out.println(gim.quitarSocio("1"));


System.out.println("***************************************");



//listaSocios
gim.listarSocios();



}




}
