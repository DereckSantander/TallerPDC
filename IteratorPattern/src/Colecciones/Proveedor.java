package Colecciones;
import java.util.ArrayList;
import java.util.List;

import Base.*;
import Iteradores.ProveedorIterator;

public class Proveedor implements ColeccionProductos {

	private List<Producto> productos;
	
	public Proveedor(List<Producto> productos) {
		
		if(productos!=null)	this.productos = productos;
		else this.productos=new ArrayList<Producto>();
		
	}

	@Override
	public IteratorProductos createIterator() {
		return new ProveedorIterator(this);
	}

	public List<Producto> productosConFallas() {
		ArrayList<Producto> productosConFallas=Producto.estadoProductos("Falla", productos);
		return productosConFallas;
	}
}