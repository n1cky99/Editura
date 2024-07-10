/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.aosd.editura;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author daniel
 */
@WebService(serviceName = "EdituraWS")
public class EdituraWS {
    
   @WebMethod(operationName = "add")
   public String getCarte (@WebParam(name = "autor") String autor, @WebParam(name = "titlu") String titlu){
       Editura editura = new Editura();
       return editura.getCarte(autor, titlu);
   }
   
}
