/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aosd.editura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Editura {
    private List<Carte> carti;
    private String titlu;
    private String autor;

    public Editura() {
        carti = new ArrayList<>();
        carti.add(new Carte("Achyut Godbole, Atul Kahate", "WEB TECHNOLOGIES: TCP/IP, Web/Java Programming, and Cloud Computing", 109L, 2));
        carti.add(new Carte("Chellammal Surianarayanan, Pethuru Raj Chelliah", "Essentials of Cloud Computing", 29L, 2));
        carti.add(new Carte("Raja Malleswara, Rao Pattamsetti", "Distributed Computing in Java 9", 229L, 1));    
    }
 
    public Carte CautareCarte(){
        for(Carte carte: carti){
            if(carte.getTitlu().equals(titlu)&&carte.getAutor(autor)){
               return carte;
            }
        }
        return null;
    }
    
    public String getCarte(String autor, String titlu){
        this.autor = autor;
        this.titlu=titlu;
        Carte c = this.CautareCarte();
        return  (c==null)? "Cartea nu exista in biblioteca": c.toString();
    }
    
    public String cumparaCarte(int ID_carte, int ID_client, int nrEx){
       return null;
    }
}
