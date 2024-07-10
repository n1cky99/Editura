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
public class Carte {
    private int ID, nrEx;
    private List<Autor> listaAutori = new ArrayList<>();
    private Long pret;
    private String titlu;
    private static int idCarte = 0;

    public Carte(String scriitori, String titlu,  Long pret, int nrEx) {
        this.nrEx = nrEx;
        this.pret = pret;
        this.titlu = titlu;
        this.ID=++idCarte;
        this.insertAutori(scriitori);
    }

    public int getID() {
        return ID;
    }

    public int getNrEx() {
        return nrEx;
    }

    public Long getPret() {
        return pret;
    }

    public String getTitlu() {
        return titlu;
    }
    
    
    public boolean getAutor(String a){
        return this.cautareAutor(a);
    }
    
    
    private boolean cautareAutor(String autor){
        for(Autor autors: this.listaAutori){
            if(autors.getNume().equals(autor)){
                return true;
            }
        }
        return false;
    }
    
    private void insertAutori(String autori){
        String[] strArray = autori.split(",");
        for(int i=0;i<strArray.length;i++){
             Autor autor = new Autor(strArray[i].strip());
             listaAutori.add(autor);
         }
    }
    
    private String getAutori(){
        String autori = "";
        for(Autor autor: this.listaAutori){
            autori += autor.getNume()+",";
        }
        return autori;
    } 
    
    public String toString(){
       return "Informatii suplimentare: ID="+ this.ID + ", titlu: " +this.titlu + ", autori: "+ this.getAutori()+ ", pret= " + this.getPret() + ", disponibilate: " + this.nrEx;
       
    }
}
