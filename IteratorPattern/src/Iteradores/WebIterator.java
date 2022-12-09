package Iteradores;

import java.util.ArrayList;
import java.util.List;

import Base.IteratorProductos;
import Base.Producto;
import Colecciones.Web;
/**
 * Esta clase ayuda a iterar productos que se encuentran disponibles en la tienda web
 * @author KevinRoldan
 *
 */
public class WebIterator implements IteratorProductos {

	private Web web;
	private List<Producto> prod=new ArrayList<Producto>();
	private int posicionActual = 0;

	public WebIterator(Web web) {
		this.web = web;
	}

	@Override
	public boolean hasNext() {
		if(prod.size()==0) prod=web.productosEnWeb();
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