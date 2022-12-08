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
public class Gerente extends Departamento{
    private Departamento next;

    public void setNext(Departamento next) {
        this.next = next;
    }
    
    
    @Override
    public void procesarCambio(Articulo articulo){
        //No se menciona cuál es la responsabilidad del gerente. Simplemente, recibirá la solicitud y aprobará
        System.out.println("Solicitud de cambio de: " + articulo.getIdArticulo() + " recibida por el Gerente...");
        System.out.println("El gerente aprueba la solicitud");
    }
    
    
}
