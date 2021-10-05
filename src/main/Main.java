/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controleur.EvaluationRegle1;
import controleur.Jeu;
import model.Paquet;
import vue.VueCmd;

/**
 *
 * @author HKass
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jeu jeu = new Jeu(new Paquet(), new VueCmd(), new EvaluationRegle1());
        jeu.jouer();
    }
    
}
