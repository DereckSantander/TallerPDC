package Iteradores;

import java.util.ArrayList;
import java.util.List;

import Base.IteratorProductos;
import Base.Producto;
import Colecciones.Proveedor;

/**
 * Esta clase ayuda a iterar productos en estado de falla
 * @author KevinRoldan
 *
 */
public class ProveedorIterator implements IteratorProductos {

	private Proveedor proveedor;
	private List<Producto> prod=new ArrayList<Producto>();
	private int posicionActual = 0;

	public ProveedorIterator(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public boolean hasNext() {
		if(prod.size()==0) prod=proveedor.productosConFallas();
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