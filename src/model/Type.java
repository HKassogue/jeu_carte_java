/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;

/**
 *
 * @author HKass
 */
public enum Type {
    JOKER(0),
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
    
    public Color getCouleur() {
        switch(this.toString()){
            case "CARREAU":
            case "COEUR": return Color.RED;
            case "PIQUE":
            case "TREFLE": return Color.BLACK;
        }
        return null;
    }
}
