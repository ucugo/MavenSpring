/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

/**
 *
 * @author ugo_dock
 */
public class PerformanceException extends Exception {

    private static final long serialVersionUID = 1l;
    @Override
    public String getMessage() {
        
        
        return "Performance Exception";
    }
    
    
    
}
