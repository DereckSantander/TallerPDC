package Iteradores;

import java.util.ArrayList;
import java.util.List;

import Base.IteratorProductos;
import Base.Producto;
import Colecciones.Tienda;

/**
 * Esta clase ayuda a iterar productos que se encuentran disponibles en la tienda fisica
 * @author KevinRoldan
 *
 */
public class TiendaIterator implements IteratorProductos {

	private Tienda tienda;
	private List<Producto> prod=new ArrayList<Producto>();
	private int posicionActual = 0;

	public TiendaIterator(Tienda tienda) {
		this.tienda = tienda;
	}

	@Override
	public boolean hasNext() {
		if(prod.size()==0) prod=tienda.productosEnTienda();
		return posicionActual < prod.size(); 
	}

	@Override
	public Producto getNext() {
		if(!hasNext()) return null;
		Producto producto = prod.get(posicionActual);
		posicionActual++;
		return producto;
	}

	@Override
	public void reset() {
		posicionActual=0;
		
	}
}