/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpdc.transporte;

import tallerpdc.distributionStrategy;

/**
 *
 * @author CltControl
 */
public class Aerea implements distributionStrategy{
    
    @Override
    public void distributeBy(){
        System.out.println("El producto sera entregado vía aerea");
    }
}
