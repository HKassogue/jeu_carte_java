/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author HKass
 */
public class Paquet {
    private List<Carte> cartes;

    public Paquet() {
        cartes = new ArrayList<>();
        for(Type type : Type.values()){
            for(Valeur valeur : Valeur.values()){
                System.out.println("Creation carte ["+type+"]["+valeur+"]");
                cartes.add(new Carte(type, valeur));
            }
        }
    }
    
    public void melanger() {
        Random random = new Random();
        for (int i = 0; i < cartes.size(); ++i) {
                Collections.swap(cartes, i, random.nextInt (cartes.size()));
        }
    }
	
    public Carte retirer1ereCarte() {
        return cartes.remove(0);
    }
	
    public void remettreCarte(Carte c) {
        cartes.add(c);
    }

    public List<Carte> getCartes() {
        return cartes;
    }
}
