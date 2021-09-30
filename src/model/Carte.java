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
public class Carte {
    private Type type;
    private Valeur valeur;
    private boolean cache;

    public Carte(Type type, Valeur valeur) {
        this.type = type;
        this.valeur = valeur;
    }

    public Type getType() {
        return type;
    }

    public Valeur getValeur() {
        return valeur;
    }

    public boolean isCache() {
        return cache;
    }
    
    public boolean retourner(){
        cache = !cache;
        return cache;
    }
}
