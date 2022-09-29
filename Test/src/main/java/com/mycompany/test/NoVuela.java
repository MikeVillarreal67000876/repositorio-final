
package com.mycompany.test;

import com.sun.org.slf4j.internal.LoggerFactory;

/**
 *
 * @author Usuario
 */
public class NoVuela implements TipoVuelo {
    public static final com.sun.org.slf4j.internal.Logger logger = LoggerFactory.getLogger(NoVuela.class);
    public void Vuelo (){
        logger.debug(" No puede volar ");
        System.out.println(" No puede volar ");
    }
}
