/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpdc;

import java.util.ArrayList;
import java.util.Scanner;
import tallerpdc.productos.*;
import tallerpdc.transporte.*;

/**
 *
 * @author CltControl
 */
public class Departamento_Logistica {
    public static ArrayList<Producto> productos = new ArrayList<>();
    private static distributionContext tmp= new distributionContext();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        productos.add(new Celular("Apple",300));
        productos.add(new Impresora("Brother",50));
        productos.add(new PC("Asus",800));
        productos.add(new Televisor("LG",200));
        
        for(Producto p: productos){
            System.out.println("\nPara el producto "+p.get()+", que tipo de transporte desea para su distribucion:"+"\n"+
            "1 - Via Aerea"+"\n"+
            "2 - Via Automotriz"+"\n"+
            "3 - Via Ciclista"+"\n"+
            "4 - Via Ferrea"+"\n"+
            "5 - Via Fluvial"+"\n");
          
            int x= sc.nextInt();
            while(!(x<=5)){
                System.out.println("\nSeleccione un transporte que se encuentre dentro de las opciones:"+"\n"+
                        "1 - Via Aerea"+"\n"+
                        "2 - Via Automotriz"+"\n"+
                        "3 - Via Ciclista"+"\n"+
                        "4 - Via Ferrea"+"\n"+
                        "5 - Via Fluvial"+"\n");
                x=sc.nextInt();
            }
            switch(x){
                case 1:
                    tmp.setStrategy(new Aerea());
                    break;
                case 2:
                    tmp.setStrategy(new Automotriz());
                    break;
                case 3:
                    tmp.setStrategy(new Ciclista());
                    break;
                case 4:
                    tmp.setStrategy(new Ferrea());
                    break;
                case 5:
                    tmp.setStrategy(new Fluvial());
            }
            
                    
        }
        sc.close();
    }
    
}
