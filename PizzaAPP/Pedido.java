import java.util.ArrayList;

public class Pedido {


private int numTel;
private String direccion;
private int numPedido;
private ArrayList<Item>items;
public Pedido(int numTel, String direccion ) {

	this.numTel = numTel;
	this.direccion = direccion;
    this.setNumPedido(numPedido);
	this.items = new ArrayList<Item>();
}
@Override
public String toString() {
	return "Pedido [numTel=" + numTel + ", direccion=" + direccion + ", numPedido=" + numPedido + ", items=" + items
			+ "]";
}
public int getNumTel() {
	return numTel;
}



public void setNumPedido(int numPedido) {
	this.numPedido = numPedido++;
}
private Item buscarItem(Gusto gusto , Tamanio tamanio) {
Item buscado=null;
int index=0;
while(buscado==null && index<this.items.size()) {
	if(this.items.get(index).getGusto()==gusto && this.items.get(index).getTamanio()==tamanio) {
		buscado=this.items.get(index);
	}
	else {
		index++;
	}
}

  return buscado;
}


public void cargarPizza(int cantidad , Gusto gusto , Tamanio tamanio) {
	
	if(this.buscarItem(gusto, tamanio)==null) {
		this.items.add(new Item(cantidad ,gusto , tamanio));
		
	}
}
public int getNumPedido() {
	return numPedido;
}




}
