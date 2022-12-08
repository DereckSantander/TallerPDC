/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo1.implementacioncor.departamento;

import grupo1.implementacioncor.modelo.Articulo;

/**
 *
 * @author mbravop
 */
public class DepartamentoTecnico extends Departamento {
    private Departamento next;

    public void setNext(Departamento next) {
        this.next = next;
    }
    
    @Override
    public void procesarCambio(Articulo articulo){
        System.out.println("Departamento técnico está revisando el artículo: "+articulo.getIdArticulo());
        
        //Como se asume que todos los fallos están cubiertos por la garantía pasa directamente al siguiente.
        next.procesarCambio(articulo);
    }
}
