/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.List;
import model.Carte;
import model.Joueur;
import model.JoueurGagnant;

/**
 *
 * @author HKass
 */
public class EvaluationRegle1 implements Evaluation{
    @Override
    public Joueur evaluerGagnant(List<Joueur> joueurs) { 
        JoueurGagnant gagnant = null; 
        int meilleurValeur = 0; 
        int meilleurType = 0; 
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
                Carte carte = joueur.getCarte(0); 
                meilleurValeur = carte.getValeur().getValeur(); 
                meilleurType = carte.getType().getType(); 
                gagnant = new JoueurGagnant(joueur, meilleurValeur * meilleurType);
            } 
        } 
        return gagnant;
    }
}
