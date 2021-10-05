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
public class JeuPaquetNormalCmdRegle1 implements JeuBuilder{
    @Override
    public Jeu getJeu(){
        return new Jeu(PaquetFactory.construirePaquet(PaquetFactory.TypePaquet.Normal), new VueCmd(), new EvaluationRegle1());
    }
}
