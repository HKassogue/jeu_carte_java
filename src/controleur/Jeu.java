/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.ArrayList;
import java.util.List;
import model.Carte;
import model.Joueur;
import model.Paquet;
import vue.Vue;

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
    
    public void entrerJoueurs() {
        while (etat == EtatJeu.AjoutJoueurs) { 
            vue.faireUnTruc(); 
        }
        etat = EtatJeu.JoueursAjoutes;
    }
    
    public void distribuerCartes(){
        for (Joueur joueur : joueurs) {
            joueur.ajouterCarteMain(paquet.retirer1ereCarte());
            vue.faireUnTruc();
        }
        etat = EtatJeu.CartesDistribuees;
    }
    
    public void retournerCartes(){
        for (Joueur joueur : joueurs) { 
            Carte carte = joueur.getCarte(0); 
            carte.retourner();
            vue.faireUnTruc(); 
        } 
    }
    
    void evaluerGagnant() { 
        gagnant = null; 
        int meilleurValeur = -1; 
        int meilleurType = -1; 
        for (Joueur joueur : joueurs) { 
            boolean newGagnant = false; 
            if (gagnant == null) newGagnant = true; 
            else { 
                Carte carte = joueur.getCarte(0); 
                int valeur = carte.getValeur().getValeur(); 
                if (valeur > meilleurValeur) newGagnant = true; 
                else if(valeur == meilleurValeur) { 
                    if (carte.getType().getType() > meilleurType) 
                        newGagnant = true; 
                }
            }
            if (newGagnant) { 
                gagnant = joueur; 
                Carte carte = joueur.getCarte(0); 
                meilleurValeur = carte.getValeur().getValeur(); 
                meilleurType = carte.getType().getType(); 
            } 
        } 
    }
    
    public void afficherGagnant() {
        vue.faireUnTruc();
        etat = EtatJeu.GagnantRevele;
    }
    
    public void reconstruirePaquet() {
        for (Joueur joueur : joueurs) { 
            paquet.remettreCarte(joueur.retirerCarte()); 
        } 
    }
    
    public void faireUnTour() {
        etat = EtatJeu.AjoutJoueurs;
        paquet.melanger();        
        entrerJoueurs();
        vue.faireUnTruc();
        distribuerCartes();
        vue.faireUnTruc();
        retournerCartes();
        vue.faireUnTruc();
        evaluerGagnant();
        vue.faireUnTruc();
        afficherGagnant();
        reconstruirePaquet();
    }
    
    public void jouer() {
        while(etat != EtatJeu.Arrete) {
            faireUnTour();
            vue.faireUnTruc();
        }
    }
}