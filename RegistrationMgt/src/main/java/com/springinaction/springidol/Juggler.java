/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

/**
 *
 * @author ugo_dock
 */
public class Juggler implements Performer {
    
    private int beanBags = 3;
    
    public Juggler(){
        
    }
    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }
    public void perform() throws PerformanceException{
        System.out.println("Juggler is throwing "+ beanBags+" bean bags");
    }
    
}
