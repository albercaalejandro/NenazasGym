/*
 * Copyright 2020 Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

/**
 *
 * @author Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es
 */
public class Cafetera {
    public static final int CAFE = 0;
    public static final int TE = 1;
    public static final int BATIDO = 2;
    public static final int CON_AZUCAR = 4;
    public static final int SIN_AZUCAR = 8;
    
    public static final int DEF_SERVICIO = CAFE + SIN_AZUCAR;

    private int servicio;
    
    //constructores
    
    public Cafetera() {
        servicio = CAFE + SIN_AZUCAR;
    }

    public Cafetera(int servicio) {
        if (servicio == CAFE + SIN_AZUCAR
                || servicio == CAFE + CON_AZUCAR 
                || servicio == CAFE + TE 
                || servicio == CAFE + BATIDO 
                || servicio == CAFE + CON_AZUCAR 
                || servicio == CAFE + SIN_AZUCAR )       
        this.servicio = servicio;
        else {
            this.servicio = DEF_SERVICIO;
        }
    }
    
    public int getServicio() {
        return servicio;
    }

    public void setServicio(int servicio) {
        if (servicio == CAFE + SIN_AZUCAR
                || servicio == CAFE + CON_AZUCAR 
                || servicio == CAFE + TE 
                || servicio == CAFE + BATIDO 
                || servicio == CAFE + CON_AZUCAR 
                || servicio == CAFE + SIN_AZUCAR )
        this.servicio = servicio;
        
    }


 
    
}

