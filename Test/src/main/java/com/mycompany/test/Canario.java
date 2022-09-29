package com.mycompany.test;


import com.mycompany.test.Ave;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public  class Canario extends Ave{
    public static final Logger logger= LoggerFactory.getLogger(Canario.class);
   public Canario (){
       logger.debug("Canario instanciado");
       tipoSonido = new Canto ();
       tipoVuelo = new VueloConAlas ();
   } 
    
}
