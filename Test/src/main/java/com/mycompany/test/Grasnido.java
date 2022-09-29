
package com.mycompany.test;

import com.sun.org.slf4j.internal.LoggerFactory;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Grasnido implements TipoSonido{
    public static final com.sun.org.slf4j.internal.Logger logger = LoggerFactory.getLogger(Grasnido.class);
    public void Sonido (){
        logger.debug(" Granido ");
        System.out.println(" Grasnido ");
    }
}
