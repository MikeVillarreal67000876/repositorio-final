/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.sun.org.slf4j.internal.LoggerFactory;

/**
 *
 * @author Usuario
 */
public class Canto implements TipoSonido {
    public static final com.sun.org.slf4j.internal.Logger logger = LoggerFactory.getLogger(Canto.class);
    public void Sonido (){
        logger.debug(" Canta ");
        System.out.println(" Canta ");
    }
}
