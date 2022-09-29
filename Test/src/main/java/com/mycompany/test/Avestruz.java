package com.mycompany.test;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class Avestruz extends Ave {
    
   public static final Logger logger= LoggerFactory.getLogger(Avestruz.class);
   public Avestruz (){
       logger.debug("Avestruz instanciado");
       tipoSonido = new NoCanta ();
       tipoVuelo = new NoVuela ();
   } 
}
