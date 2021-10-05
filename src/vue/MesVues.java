/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.Jeu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HKass
 */
public class MesVues implements Vue{
    
    List<Vue> vues;

    public MesVues() {
        vues = new ArrayList<>();
    }
    
    public void addView(Vue vue){
        vues.add(vue);
    }

    @Override
    public void faireUnTruc() {
        for(Vue vue : vues) vue.faireUnTruc();
    }

    @Override
    public void setControlleur(Jeu jeu) {
        for(Vue vue : vues) vue.setControlleur(jeu);
    }

    @Override
    public void demandeNomJoueur() {
        for(Vue vue : vues) vue.demandeNomJoueur();
    }

    @Override
    public void demandeRetourner() {
        for(Vue vue : vues) vue.demandeRetourner();
    }

    @Override
    public void demandeNewJeu() {
        for(Vue vue : vues) vue.demandeNewJeu();
    }

    @Override
    public void afficherGagnant(String nom) {
        for(Vue vue : vues) vue.afficherGagnant(nom);
    }

    @Override
    public void afficherNomJoueur(int pos, String nom) {
        for(Vue vue : vues) vue.afficherNomJoueur(pos, nom);
    }

    @Override
    public void afficherFaceCacheCarteJoueur(int i, String nom) {
        for(Vue vue : vues) vue.afficherFaceCacheCarteJoueur(i, nom);
    }

    @Override
    public void afficherCarteJoueur(int i, String nom, String val, String type) {
        for(Vue vue : vues) vue.afficherCarteJoueur(i, nom, val, type);
    }

    @Override
    public void effetMelange() {
        for(Vue vue : vues) vue.effetMelange();
    }
    
}
