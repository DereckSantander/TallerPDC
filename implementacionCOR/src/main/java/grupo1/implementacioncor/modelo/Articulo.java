/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo1.implementacioncor.modelo;

/**
 *
 * @author mbravop
 */
public class Articulo {
    private String idArticulo;
    private int precio;
    private boolean garantiaValida;
    
    public Articulo(String idArticulo, int precio, boolean garantiaValida){
        this.idArticulo = idArticulo;
        this.precio = precio;
        this.garantiaValida = garantiaValida;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isGarantiaValida() {
        return garantiaValida;
    }
    
    
}
