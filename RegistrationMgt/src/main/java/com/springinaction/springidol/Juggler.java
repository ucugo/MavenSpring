/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

import javax.annotation.PostConstruct;

/**
 *
 * @author ugo_dock
 */
public class Juggler implements Performer {
    
    private int beanBags = 3;
    
    public Juggler(){
        
    }
    
    @PostConstruct
    public void init(){
        System.out.println("About to start performance......... ");
    }
    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }
    public void perform() throws PerformanceException{
        System.out.println("Juggler is throwing "+ beanBags+" bean bags");
    }
    public void endingPerformance(){
        
    }
    
}
