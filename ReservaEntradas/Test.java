package reserva_Entradas;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Club club = new Club("atlanta" ,400);
	
club.agregarSocio("1", "Lionel", "Messi", 34, true, Categoria.PREMIUM);
club.agregarSocio("2", "Angel", "Di Maria", 33, true, Categoria.ACTIVO)	;
club.agregarSocio("3", "Juan Martin", "Del Potro", 33, true, Categoria.INACTIVO)	;
club.agregarSocio("4", "Novak", "Djokovic", 34, false, Categoria.ACTIVO)	;
club.agregarSocio("5", "Juan Francisco", "Rago", 33, true, Categoria.VITALICIO)	;
	

System.out.println(club.reserva("1", 2));
System.out.println(club.reserva("12", 2));	
System.out.println(club.reserva("3", 4));	
System.out.println(club.reserva("4", 6));	
System.out.println(club.reserva("2", 2));	
System.out.println(club.reserva("2", 5));
System.out.println(club.reserva("2", 6));
	
	



	
	
	
	}
}
