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
public class JoueurGagnant extends Joueur{  
    private int score;

    public JoueurGagnant(Joueur joueur, int score) {
        super(joueur.nom);
        this.main = joueur.main;
        this.score = score;
    }
    
    public String getNom() {
        return nom + " avec " + Integer.toString(score) + " points";
    }
}
