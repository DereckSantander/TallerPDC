/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo1.implementacioncor.departamento;

import grupo1.implementacioncor.modelo.Articulo;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mbravop
 */
public class Inventario extends Departamento{
    private Departamento next;
    private ArrayList<String> idArticulosDisponibles = new ArrayList<>(Arrays.asList("00iPhone13","ABCargador00"));

    public void setNext(Departamento next) {
        this.next = next;
    }
    
    
    @Override
    public void procesarCambio(Articulo articulo){
        System.out.println("Departamento de inventario está revisando disponibilidad del artículo: "+articulo.getIdArticulo());
        if(idArticulosDisponibles.contains(articulo.getIdArticulo()) && articulo.getPrecio()>1000){
            next.procesarCambio(articulo);
        }else if(idArticulosDisponibles.contains(articulo.getIdArticulo())){
            System.out.println("Solicitud de cambio aprobada por departamento de inventario");
        }else{
            System.out.println("No se puede realizar el cambio por insuficiencia de unidades en el inventario.");
        }
    }
    
}
