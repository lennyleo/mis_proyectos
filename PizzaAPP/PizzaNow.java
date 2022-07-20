import java.util.ArrayList;

public class PizzaNow {


private ArrayList<Pedido>pedidos;
private ArrayList<Pedido>cancelados;
public PizzaNow() {

	this.pedidos = new ArrayList<Pedido>();
	this.cancelados = new ArrayList<Pedido>();
}
@Override
public String toString() {
	return "PizzaNow [pedidos=" + pedidos + ", cancelados=" + cancelados + "]";
}


private Pedido buscarPedido(int numTel) {
Pedido buscado=null;
int index=0;

while(buscado==null && index<this.pedidos.size()) {
	 if(this.pedidos.get(index).getNumTel()==numTel) {
		 buscado=this.pedidos.get(index);
	 }
	 else {
		 index++;
	 }
}
	
	return buscado;
}


public void cargarORecuperarPedido(int numTel , String direccion ) {
	
if(this.buscarPedido(numTel)==null) {
	this.pedidos.add(new Pedido(numTel , direccion));
	System.out.println("nuevo pedido del numero : "+numTel+" de la direccion : "+direccion );
} else {
	System.out.println("pedido ya existente : "+numTel+ "de la direccion : "+ direccion);
}
	
}







public Pedido cancelarPedido(int numTel) {

Pedido cancelado= this.buscarPedido(numTel);

if(cancelado!=null) {
	this.cancelados.add(cancelado);
	
	this.pedidos.remove(cancelado);
	
}
	

 return cancelado;
}


public void listarPedidoCompletoo(int numTel) {
	this.listarPedidoCompleto(numTel);
}


private void listarPedidoCompleto(int numTel) {
	
	for(Pedido lista: this.pedidos) {
		if(lista.getNumTel()==numTel) {
			System.out.println(lista);
		}
	}
}

private void listaCancelados() {
	for(Pedido lista : this.cancelados) {
		 System.out.println("lista de cancelados : "+lista);
	}
}

private void listaPedidos() {
	for(Pedido lista : this.pedidos) {
		 System.out.println("lista de pedidos : "+lista);
	}
}


public void listarPedidos() {
	
	this.listaPedidos();
	
	this.listaCancelados();
}




public RESULTADO CargarPizza(int numTel ,Gusto gusto , Tamanio tamanio , int cantidad) {
RESULTADO res = RESULTADO.PEDIDO_INEXISTENTE;
Pedido buscado=this.buscarPedido(numTel);	


if(buscado!=null) {
	buscado.cargarPizza(cantidad, gusto, tamanio);
	res=RESULTADO.PEDIDO_OK;
}else {
	res=RESULTADO.PEDIDO_INEXISTENTE;
}


 return res;
}



public RESULTADO actualizarPedido(int numTel ,Gusto gusto , Tamanio tamanio , int cantidad) {
RESULTADO res = RESULTADO.PEDIDO_INEXISTENTE;
Pedido buscado=this.buscarPedido(numTel);	


if(cantidad==0) {
	this.pedidos.remove(buscado);
	res=RESULTADO.PEDIDO_BORRADO;
} 

if(buscado!=null && cantidad>=1) {
	buscado.cargarPizza(cantidad, gusto, tamanio);
	res=RESULTADO.PEDIDO_OK;
	
}

if(this.pedidos.size()==0) {
	res=RESULTADO.PEDIDO_VACIO;
}
 return res;
}




}
