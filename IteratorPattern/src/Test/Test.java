package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Base.ColeccionProductos;
import Base.IteratorProductos;
import Base.Producto;
import Colecciones.Mantenimiento;
import Colecciones.Proveedor;
import Colecciones.Tienda;
import Colecciones.Web;

public class Test {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		
		System.out.println("Especifique su tipo de usuario (Por defecto Comprador Web ):\n"
				+ "1. Combrador Web\n"
				+ "2. Vendedor de Tienda\n"
				+ "3. Proveedor\n"
				+ "4. Asistente de Mantenimiento");
		
		int opcion = sc.nextInt();
		ColeccionProductos coleccion;
		
		if(opcion == 2) {
			coleccion = new Tienda(crearProductosDePrueda());
			
		} else if(opcion == 3){
			coleccion = new Proveedor(crearProductosDePrueda());
			
		}else if(opcion == 4) {
			coleccion = new Mantenimiento(crearProductosDePrueda());	
			
		}else {
			coleccion = new Web(crearProductosDePrueda());
		
		}
		
		IteratorProductos iterador = coleccion.createIterator();
		System.out.println("\nIterando productos de interes del usuario:\n");
		
		while(iterador.hasNext()) {
			Producto producto=iterador.getNext();
			System.out.println("- "+producto);
		}
		System.out.println("\nIteracion terminada");
		
		

	}
	
	public static List<Producto> crearProductosDePrueda(){
		List<Producto> productos= new ArrayList<Producto>();
		productos.add(new Producto("Televisor LG", 500, "ambos", "Funcionando"));
		productos.add(new Producto("Televisor Samsung", 1000, "Tienda", "Falla"));
		productos.add(new Producto("Impresora HP", 90, "Tienda", "Reparando"));
		productos.add(new Producto("Impresora EPSON", 200, "Web", "Funcionando"));
		productos.add(new Producto("Celular LG", 300, "Web", "Falla"));
		productos.add(new Producto("Celular IPhone", 1000, "Web", "Reparando"));
		productos.add(new Producto("Tablet IPad", 1200, "Tienda", "Funcionando"));
		productos.add(new Producto("Tablet Samsung", 900, "ambos", "Funcionando"));
		productos.add(new Producto("Monitor LG", 800, "ambos", "Falla"));
		productos.add(new Producto("Monitor Samsung", 600, "Web", "Funcionando"));
		productos.add(new Producto("Auriculares Samsung", 120, "ambos", "Reparando"));
		productos.add(new Producto("Auriculares Sonny", 300, "Web", "Funcionando"));
		productos.add(new Producto("PlayStation 5", 500, "ambos", "Falla"));
		productos.add(new Producto("PlayStation 4", 300, "Tienda", "Falla"));
		productos.add(new Producto("Xbox series X", 450, "Tienda", "Funcionando"));
		productos.add(new Producto("Dron Xiaomi", 100, "ambos", "Reparando"));
		productos.add(new Producto("Smart Watch", 50, "Tienda", "Reparando"));
		return productos;
	}

}
