/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import org.japo.java.entities.Cafetera;



/**
 *
 * @author Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es
 */
public final class App {

    public void launchapp() {
        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(Cafetera.TE);
        System.out.println(c1.getServicio());
        System.out.println(c2.getServicio());
    }
}
