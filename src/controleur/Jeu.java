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
        Cree,
        AjoutJoueurs,
        JoueursAjoutes,
        CartesDistribuees, 
        GagnantRevele,
        Arrete;
    }
    EtatJeu etat;
    
    Vue vue;
    
    Evaluation evaluation;

    public Jeu(Paquet paquet, Vue vue, Evaluation evaluation) {
        this.paquet = paquet;
        joueurs = new ArrayList<>(); 
        
        gagnant = null;
        this.vue = vue;
        etat = EtatJeu.Cree; 
        vue.setControlleur(this); 
        
        this.evaluation = evaluation;
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
            vue.demandeNomJoueur();
        }
        etat = EtatJeu.JoueursAjoutes;
    }
    
    public void distribuerCartes(){
        int posJoueur = 1;
        for (Joueur joueur : joueurs) {
            joueur.ajouterCarteMain(paquet.retirer1ereCarte());
            vue.afficherFaceCacheCarteJoueur(posJoueur++, joueur.getNom());
        }
        etat = EtatJeu.CartesDistribuees;
    }
    
    public void retournerCartes(){
        int posJoueur = 1;
        for (Joueur joueur : joueurs) { 
            Carte carte = joueur.getCarte(0); 
            carte.retourner();
            vue.afficherCarteJoueur(posJoueur++, joueur.getNom(),  
                    carte.getValeur().toString(), carte.getType().toString());  
        } 
    }
    
    public void evaluerGagnant() {
        gagnant = evaluation.evaluerGagnant(joueurs);
    }
    
    public void afficherGagnant() {
        vue.afficherGagnant(gagnant.getNom());
        etat = EtatJeu.GagnantRevele;
    }
    
    public void reconstruirePaquet() {
        for (Joueur joueur : joueurs) { 
            paquet.remettreCarte(joueur.retirerCarte()); 
        } 
    }
    
    public void entreeJoueursTerminee() {
        etat = EtatJeu.JoueursAjoutes;
    }
    
    public void melanger() {
        paquet.melanger();
        vue.effetMelange();
    }
    
    public void faireUnTour() {
        melanger();
        distribuerCartes();
        vue.demandeRetourner();
        retournerCartes();
        vue.faireUnTruc();
        evaluerGagnant();
        vue.faireUnTruc();
        afficherGagnant();
        reconstruirePaquet();
    }
    
    public void jouer() {
        if(etat == EtatJeu.Cree) {
            etat = EtatJeu.AjoutJoueurs;
            entrerJoueurs();
            afficherJoueurs();
        } 
        while(etat != EtatJeu.Arrete) {
            faireUnTour();
            vue.demandeNewJeu();
        }
    }
    
    public void afficherJoueurs(){
        int pos = 1;
        for(Joueur joueur : joueurs) 
            vue.afficherNomJoueur(pos++, joueur.getNom());
    }
    
    public void arreter() {
        etat = EtatJeu.Arrete;
    }
}