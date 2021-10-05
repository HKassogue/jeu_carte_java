/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import model.PaquetFactory;
import vue.VueCmd;

/**
 *
 * @author HKass
 */
public class JeuSingleton {
    private static Jeu _instance = null;
    
    private JeuSingleton(){
        _instance = new Jeu(PaquetFactory.construirePaquet(PaquetFactory.TypePaquet.Normal), new VueCmd(), new EvaluationRegle1());
    }
    
    public static Jeu getInstance(){
        if(_instance==null) new JeuSingleton();
        return _instance;
    }
}
