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
public enum TypeCarte {
    TREFLE(1),
    PIQUE(2),
    COEUR(3),
    CARREAU(4);
    
    int type;

    private TypeCarte(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
