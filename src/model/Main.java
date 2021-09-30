/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HKass
 */
public class Main {
    List<Carte> cartes;

    public Main() {
        cartes = new ArrayList<>();
    }
    public void ajouterCarte(Carte c){
        cartes.add(c);
    }
    public Carte retirerCarte(){
        return cartes.remove(0);
    }
    public Carte getCarte(int pos){
        return cartes.get(pos);
    }
}
