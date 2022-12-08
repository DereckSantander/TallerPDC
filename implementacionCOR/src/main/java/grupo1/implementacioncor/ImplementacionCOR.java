/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grupo1.implementacioncor;

import grupo1.implementacioncor.departamento.AtencionUsuario;
import grupo1.implementacioncor.departamento.Departamento;
import grupo1.implementacioncor.departamento.DepartamentoTecnico;
import grupo1.implementacioncor.departamento.Gerente;
import grupo1.implementacioncor.departamento.Inventario;
import grupo1.implementacioncor.modelo.Articulo;
import grupo1.implementacioncor.modelo.Cliente;

/**
 *
 * @author mbravop
 */
public class ImplementacionCOR {

    public static void main(String[] args) {
        Departamento atencionUsuario = new AtencionUsuario();
        Departamento departamentoTecnico = new DepartamentoTecnico();
        Departamento inventario = new Inventario();
        Departamento gerencia = new Gerente();
        
        //Se define el orden que se aplicará para el ejemplo.
        
        atencionUsuario.setNext(departamentoTecnico);
        departamentoTecnico.setNext(inventario);
        inventario.setNext(gerencia);
        
        
        // Se crean los clientes con el artículo que desean cambiar
        Articulo iphoneRoto = new Articulo("00iPhone13",1250,true);
        Cliente clienteCambiaIphone = new Cliente("Mauricio",iphoneRoto);
        
        Articulo cargadorRoto = new Articulo("ABCargador00",30,true);
        Cliente clienteCambiaCargador = new Cliente("Dereck",cargadorRoto);
        
        Articulo vhsRoto = new Articulo("123VHS00",3000,false);
        Cliente clienteCambiaVHS = new Cliente("Kevin", vhsRoto);
        
        
        //Cada cliente procede con el reclamo acercandose primero a atencion usuario.
        System.out.println("--------CLIENTE 1---------");
        atencionUsuario.procesarCambio(clienteCambiaIphone.getArticuloRoto());
        
        System.out.println("--------CLIENTE 2---------");
        atencionUsuario.procesarCambio(clienteCambiaCargador.getArticuloRoto());
        
        System.out.println("--------CLIENTE 3---------");
        atencionUsuario.procesarCambio(clienteCambiaVHS.getArticuloRoto());
        
    }
}
