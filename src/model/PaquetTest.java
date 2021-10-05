/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HKass
 */
public class PaquetTest extends Paquet{

    public PaquetTest() {
        cartes = new ArrayList<> (); 
        for (int i = 0; i < 20; ++i)  
            cartes.add(new Carte (Type.CARREAU, Valeur.AS)); 
    }
    
}
