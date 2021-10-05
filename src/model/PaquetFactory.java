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
public class PaquetFactory {
    public enum TypePaquet { 
            Normal, 
            Petit, 
            Test 
    }; 
    
    public static Paquet construirePaquet(TypePaquet type) { 
    switch (type) { 
        case Normal: return new PaquetNormal(); 
        case Petit: return new PaquetPetit(); 
        case Test: return new PaquetTest(); 
    } 
    return new PaquetNormal(); 
    } 

}
