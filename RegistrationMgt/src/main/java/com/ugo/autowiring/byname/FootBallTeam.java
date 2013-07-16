/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugo.autowiring.byname;

/**
 *
 * @author ugo_dock
 */
public class FootBallTeam {
    
    private FootBaller footBaller;
    private String name;
    public FootBallTeam(){
        
    }

    public FootBaller getFootBaller() {
        return footBaller;
    }

    public void setFootBaller(FootBaller footBaller) {
        this.footBaller = footBaller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
