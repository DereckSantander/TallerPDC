/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo1.implementacioncor.modelo;

/**
 *
 * @author mbravop
 */
public class Cliente {
    private String nombre;
    private Articulo articuloRoto;
    
    public Cliente(String nombre, Articulo articuloRoto){
        this.nombre = nombre;
        this.articuloRoto = articuloRoto;
    }

    public Articulo getArticuloRoto() {
        return articuloRoto;
    }
    
    
}
