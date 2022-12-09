package Base;

import java.util.ArrayList;
import java.util.List;

public class Producto {

	private String nombre;
	private int precio;
	private String disponibilidad;
	private String estado;


	public String getNombre() {
		return nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public String getDisponibilidad() {
		return disponibilidad;
	}


	public String getEstado() {
		return estado;
	}


	public Producto(String nombre, int precio, String disponibilidad, String estado) {
		this.nombre = nombre;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		this.estado = estado;
	}


	public static ArrayList<Producto> productosDisponibles(String tipo, List<Producto> productos) {
		ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();
		for(Producto p:productos) {
			if(p.getDisponibilidad().equalsIgnoreCase(tipo)||p.getDisponibilidad().equalsIgnoreCase("ambos")) productosDisponibles.add(p);
		}
		
		return productosDisponibles;
	}


	public static ArrayList<Producto> estadoProductos(String situacion, List<Producto> productos) {
		ArrayList<Producto> estadoProductos = new ArrayList<Producto>();
		for(Producto p:productos) {
			if(p.getEstado().equalsIgnoreCase(situacion)) estadoProductos.add(p);
		}
		return estadoProductos;
	}

	@Override
	public String toString() {
		return "Producto: " + nombre + " con precio de $" + precio;
	}


}