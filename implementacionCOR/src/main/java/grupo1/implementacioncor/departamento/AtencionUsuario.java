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
public class AtencionUsuario extends Departamento {
    private Departamento next;

    public void setNext(Departamento next) {
        this.next = next;
    }
    
    @Override
    public void procesarCambio(Articulo articulo){
        System.out.println("Atencion a usuario está revisando el artículo: "+articulo.getIdArticulo());
        if(articulo.isGarantiaValida()){
            next.procesarCambio(articulo);
        }else{
            System.out.println("Atencion a usuario ha rechazado esta solicitud por estar fuera de garantía");
        }
    }
    
}
