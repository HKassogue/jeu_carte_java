/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.Jeu;
import java.util.Scanner;

/**
 *
 * @author HKass
 */
public class Vue {
    
    Jeu jeu; 
    Scanner keyboard = new Scanner(System.in); 
        
    public void faireUnTruc() { }; 
 
    public void setControlleur(Jeu jeu) {
        this.jeu = jeu;
    };
    
    public void demandeNomJoueur() { 
        System.out.println("Entrez le nom du joueur (vide pour terminer) :"); 
        String nom = keyboard.nextLine();
        if(nom.isEmpty()) jeu.entreeJoueursTerminee();
        else jeu.ajouterJoueur(nom); 
    } 
 
    public void demandeRetourner() { 
        System.out.println("Tapez entrer pour afficher les cartes"); 
        keyboard.nextLine(); 
        //jeu.retournerCartes();
    } 

    public void demandeNewJeu() { 
        System.out.println("Continuez ? oui(o) ou non (n) :"); 
        String continuer = keyboard.nextLine();
        if(continuer.equals("n")) jeu.arreter();
    } 

    public void afficherGagnant(String nom) { 
        System.out.println("Le gagnant est " + nom + " !"); 
    } 

    public void afficherNomJoueur(int pos, String nom) { 
        System.out.println("["+pos+"]["+nom+"]"); 
    } 

    public void afficherFaceCacheCarteJoueur(int i, String nom) { 
        System.out.println("["+i+"]["+nom+"][x][x]"); 
    } 

    public void afficherCarteJoueur(int i, String nom, String val, String type) {
        System.out.println("["+i+"]["+nom+"]["+val+"]["+type+"]"); 
    }; 
}
