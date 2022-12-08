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
public abstract class Departamento {
    private Departamento next;
    
    public abstract void procesarCambio(Articulo articulo);   
    
    public abstract void setNext(Departamento departamento);
    
}
