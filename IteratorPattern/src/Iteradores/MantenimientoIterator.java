package Iteradores;

import java.util.ArrayList;
import java.util.List;

import Base.IteratorProductos;
import Base.Producto;
import Colecciones.Mantenimiento;
/**
 * Esta clase ayuda a iterar productos en estado de reparacion
 * @author KevinRoldan
 *
 */
public class MantenimientoIterator implements IteratorProductos {

	private Mantenimiento mantenimiento;
	private List<Producto> prod=new ArrayList<Producto>();
	private int posicionActual = 0;

	public MantenimientoIterator(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	
	@Override
	public boolean hasNext() {
		if(prod.size()==0) prod=mantenimiento.productosEnReparacion();
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