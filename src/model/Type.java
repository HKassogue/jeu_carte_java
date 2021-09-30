/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HKass
 */
public enum Type {
    CARREAU(1),
    COEUR(2),
    PIQUE(3),
    TREFLE(4);
    
    int type;

    private Type(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
