package com.mycompany.test;


import com.mycompany.test.Ave;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
 
/**
 *
 * @author Usuario
 */
public class Gallina extends Ave {
     public static final Logger logger= LoggerFactory.getLogger(Gallina.class);
   public Gallina (){
       logger.debug("Gallina instanciado");
       tipoSonido = new Grasnido ();
       tipoVuelo = new VueloConAlas ();
   } 
}
