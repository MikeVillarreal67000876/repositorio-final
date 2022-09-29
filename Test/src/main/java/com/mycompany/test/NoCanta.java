
package com.mycompany.test;

import com.sun.org.slf4j.internal.LoggerFactory;

/**
 *
 * @author Usuario
 */
public class NoCanta implements TipoSonido{
    public static final com.sun.org.slf4j.internal.Logger logger = LoggerFactory.getLogger(NoCanta.class);
    public void Sonido (){
        logger.debug(" (Sin sonido) ");
        System.out.println(" (Sin sonido) ");
    }
}
