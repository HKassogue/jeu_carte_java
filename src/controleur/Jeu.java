/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.ArrayList;
import java.util.List;
import model.Joueur;
import model.Paquet;

/**
 *
 * @author HKass
 */
public class Jeu {
    private Paquet paquet; 
    List<Joueur> joueurs;
    
    Joueur gagnant;
    
    enum EtatJeu {
        AjoutJoueurs,
        JoueursAjoutes,
        CartesDistribuees, 
        GagnantRevele,
        Arrete;
    }
    EtatJeu etat;
    
    Vue vue;

    public Jeu(Paquet paquet, Vue vue) {
        this.paquet = paquet;
        joueurs = new ArrayList<>(); 
        
        gagnant = null;
        this.vue = vue;
        etat = EtatJeu.AjoutJoueurs; 
        vue.setControlleur(this); 
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

class Vue {
    public void faireUnTruc() { }; 
 
    public void setControlleur(Jeu jeu) { }; 
}
