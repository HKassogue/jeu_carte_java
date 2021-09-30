/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HKass
 */
public class Jeu {
    private Paquet paquet; 
    List<Joueur> joueurs;

    public Jeu(Paquet paquet) {
        this.paquet = paquet;
        joueurs = new ArrayList<>(); 
    }
    
    public void ajouterJoueur(String nom) { 
        joueurs.add(new Joueur(nom));
    }
    
    public Joueur getJoueur(String nom) {
        for(Joueur joueur : joueurs) {
            if(joueur.getNom().equals(nom)) return joueur;
        }
        return null;
    }
    
    public List<Joueur> getJoueurs() {
        return joueurs;
    }
    
    public void retirerJoueur(String nom) {
        for(Joueur joueur : joueurs) {
            if(joueur.getNom().equals(nom)) {
                joueurs.remove(joueur);
                break;
            }
        }
    }

    public Paquet getPaquet() {
        return paquet;
    }
    
}
