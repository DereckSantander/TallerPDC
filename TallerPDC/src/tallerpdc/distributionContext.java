/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpdc;

/**
 *
 * @author CltControl
 */
public class distributionContext {
    private distributionStrategy strategy;
    
    public void setStrategy(distributionStrategy strategy){
        strategy.distributeBy();
    }
}
