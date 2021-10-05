/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import model.PaquetFactory;
import vue.MesVues;
import vue.VueGraphique;
import vue.VueGraphiquePassive;

/**
 *
 * @author HKass
 */
public class JeuPaquetNormalGraphiquesPassivesRegle1 implements JeuBuilder{

    @Override
    public Jeu getJeu() {
        MesVues vues = new MesVues();
        
        VueGraphique vueG = new VueGraphique();
        vueG.setLocation(0, 0);
        vueG.show();
        vues.addView(vueG);
        
        VueGraphiquePassive vuePassive1 = new VueGraphiquePassive(); 
        vuePassive1.setLocation(vueG.getWidth()+10, 0);
        vuePassive1.show();
        vues.addView(vuePassive1);
        
        VueGraphiquePassive vuePassive2 = new VueGraphiquePassive(); 
        vuePassive2.setLocation(0, vueG.getHeight()+10);
        vuePassive2.show();
        vues.addView(vuePassive2);
        
        VueGraphiquePassive vuePassive3 = new VueGraphiquePassive(); 
        vuePassive3.setLocation(vueG.getWidth()+10, vueG.getHeight()+10);
        vuePassive3.show();
        vues.addView(vuePassive3);
        
        return new Jeu(PaquetFactory.construirePaquet(PaquetFactory.TypePaquet.Normal), vues, new EvaluationRegle1());
    }
    
}
