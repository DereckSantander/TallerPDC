/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpdc.productos;

/**
 *
 * @author CltControl
 */
public class PC extends Producto {
    public PC(String marca, int precio){
        this.marca=marca;
        this.precio=precio;
    }

    @Override
    public String get() {
        return "PC";
    }
}
