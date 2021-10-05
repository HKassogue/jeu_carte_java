/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.Jeu;

/**
 *
 * @author HKass
 */
public interface Vue {
            
    public void faireUnTruc(); 
    public void setControlleur(Jeu jeu);
    public void demandeNomJoueur();
    public void demandeRetourner();
    public void demandeNewJeu();
    public void afficherGagnant(String nom);
    public void afficherNomJoueur(int pos, String nom); 
    public void afficherFaceCacheCarteJoueur(int i, String nom);
    public void afficherCarteJoueur(int i, String nom, String val, String type);  
    public void effetMelange();
}
