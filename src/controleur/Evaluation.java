/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.List;
import model.Joueur;

/**
 *
 * @author HKass
 */
public interface Evaluation {
    
    public Joueur evaluerGagnant(List<Joueur> joueurs) ;
}
