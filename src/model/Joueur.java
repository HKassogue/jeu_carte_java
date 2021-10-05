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
public class Joueur {
    protected String nom;
    protected Main main;

    public Joueur(String nom) {
        this.nom = nom;
        this.main = new Main();
    }
    
    public void ajouterCarteMain(Carte c){
        main.ajouterCarte(c);
    }
    
    public Carte getCarte(int pos){
        return main.getCarte(pos);
    }
    
    public Carte retirerCarte(){
        return main.retirerCarte();
    }

    public String getNom() {
        return nom;
    }
    
}
