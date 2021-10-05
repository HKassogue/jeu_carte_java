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
public abstract class Paquet {
    protected List<Carte> cartes;
    
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
