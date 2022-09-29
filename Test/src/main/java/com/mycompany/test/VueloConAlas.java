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
public class VueloConAlas implements TipoVuelo {
    public static final com.sun.org.slf4j.internal.Logger logger = LoggerFactory.getLogger(VueloConAlas.class);
    public void Vuelo (){
        logger.debug(" Vuela con las alas ");
        System.out.println(" Vuela con las Alas ");
    }
}
