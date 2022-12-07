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
public class Celular extends Producto{
    public Celular(String marca, int precio){
        this.marca=marca;
        this.precio=precio;
    }

    @Override
    public String get(){
        return "Celular";
    }
}
