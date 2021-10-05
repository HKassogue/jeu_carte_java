/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import model.PaquetFactory;
import vue.VueGraphique;

/**
 *
 * @author HKass
 */
public class JeuPaquetNormalGraphiqueRegle1 implements JeuBuilder{
    
    @Override
    public Jeu getJeu(){
        VueGraphique vueG = new VueGraphique();
        vueG.show();
        return new Jeu(PaquetFactory.construirePaquet(PaquetFactory.TypePaquet.Normal), vueG, new EvaluationRegle1());
    }
}
