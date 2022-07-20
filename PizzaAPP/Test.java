
public class Test {

	private static PizzaNow app;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    app= new PizzaNow();
    
    app.cargarORecuperarPedido(1, "belgrano");
    app.cargarORecuperarPedido(2, "yatay");
    app.cargarORecuperarPedido(3, "villa crespo");
 
    //carga una pizza al pedido:
    System.out.println(app.CargarPizza(1, Gusto.MUZZARELLA, Tamanio.INDIVIDUAL, 1));
    
    //carga con un pedido inexistente: 
    System.out.println(app.CargarPizza(45, Gusto.VERDURA, Tamanio.GRANDE, 4));
	
	//cancela pedido y agrega a la lista de pedidos cancelados:
    app.cancelarPedido(1);
    
    
     //lista  de pedido en especial
    app.listarPedidoCompletoo(2);
    
    
    //lista pedidos en total y cancelados
    app.listarPedidos();
    
    
  
    
    
    
	}

}
