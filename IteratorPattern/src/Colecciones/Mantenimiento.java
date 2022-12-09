package Colecciones;

import java.util.ArrayList;
import java.util.List;

import Base.*;
import Iteradores.MantenimientoIterator;

public class Mantenimiento implements ColeccionProductos {

	private List<Producto> productos;
	
	public Mantenimiento(List<Producto> productos) {
		
		if(productos!=null)	this.productos = productos;
		else this.productos=new ArrayList<Producto>();
		
	}
	@Override
	public IteratorProductos createIterator() {
	
		return new MantenimientoIterator(this);
	}
	
	public List<Producto> productosEnReparacion() {
		ArrayList<Producto> productosEnReparacion=Producto.estadoProductos("Reparando", productos);
		return productosEnReparacion;
	}
	
}