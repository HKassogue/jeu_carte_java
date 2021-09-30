/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controleur.Jeu;
import model.Paquet;
import vue.Vue;

/**
 *
 * @author HKass
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jeu jeu = new Jeu(new Paquet(), new Vue());
        jeu.jouer();
    }
    
}
