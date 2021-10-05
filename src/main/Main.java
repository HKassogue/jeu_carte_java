/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controleur.Jeu;
import controleur.JeuPaquetNormalGraphiqueRegle1;
import controleur.JeuSingleton;

/**
 *
 * @author HKass
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //*
        //Jeu jeu = new JeuPaquetNormalCmdRegle1().getJeu();
        Jeu jeu = JeuSingleton.getInstance();
        /*/
        Jeu jeu = new JeuPaquetNormalGraphiqueRegle1().getJeu();
        //*/
        jeu.jouer();
    }
    
}
