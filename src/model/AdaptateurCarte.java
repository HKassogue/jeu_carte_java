/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HKass
 */
interface CarteJouable {

    public void retourner();

}

class CarteJeu implements CarteJouable {

    boolean faceCachee;
    
    @Override
    public void retourner () {
        faceCachee = !faceCachee;
    }
}

class CoolCarte {
    void retournerFace() {
        // implémentation cool ici
    }
}

public class AdaptateurCarte implements CarteJouable {
    private CoolCarte carte;
    
    public void retourner() {
        carte.retournerFace();
    }
}