/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.VentasTvs;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Televisor> televisiones = new ArrayList<>();
        televisiones.add(new Televisor("LG-14 pulgadas",300.2));
        televisiones.add(new Televisor("SAMSUMG-21 pulgadas",1300.2));
        televisiones.add(new Televisor("RIVIERA-29 pulgadas",2300.5));
        System.out.println("-----------------");
        for (Televisor televisor: televisiones){
            System.out.println(televisor);
        }
        System.out.printf("Precio Total: %.2f\n", new VentasTvs().establecerPrecioTotal(televisiones));
        System.out.println("-----------------");
    }
}