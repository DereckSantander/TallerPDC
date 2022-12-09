package Colecciones;
import java.util.ArrayList;
import java.util.List;

import Base.*;
import Iteradores.WebIterator;

public class Web implements ColeccionProductos {

	
	private List<Producto> productos;

	public Web(List<Producto> productos) {
	
	if(productos!=null)	this.productos = productos;
	else this.productos=new ArrayList<Producto>();
	
	}

	@Override
	public IteratorProductos createIterator() {
		return new WebIterator(this);
	}

	public List<Producto> productosEnWeb() {
		ArrayList<Producto> productosEnWeb=Producto.productosDisponibles("Web", productos);
		return productosEnWeb;
	}
}
