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
public class PaquetPetit extends Paquet{

    public PaquetPetit() {
        cartes = new ArrayList<>();
        for(Type type : Type.values()){
            for(Valeur valeur : Valeur.values()){
                if(valeur.getValeur()>=7){
                    System.out.println("Creation carte ["+type+"]["+valeur+"]");
                    cartes.add(new Carte(type, valeur));
                }
            }
        }
    }
    
}
