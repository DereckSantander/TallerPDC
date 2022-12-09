package Colecciones;
import java.util.ArrayList;
import java.util.List;

import Base.*;
import Iteradores.TiendaIterator;

public class Tienda implements ColeccionProductos {

private List<Producto> productos;
	
	public Tienda(List<Producto> productos) {
		
		if(productos!=null)	this.productos = productos;
		else this.productos=new ArrayList<Producto>();
		
	}

	@Override
	public IteratorProductos createIterator() {
		return new TiendaIterator(this);
	}

	public List<Producto> productosEnTienda() {
		ArrayList<Producto> productosEnTienda=Producto.productosDisponibles("Tienda", productos);
		return productosEnTienda;
	}
}