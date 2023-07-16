/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.*;
import p2.TipoMatricula;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> matriculas= new ArrayList<>();
        matriculas.add(new MatriculaCampamento(500,400,300));
        matriculas.add(new MatriculaColegio(30,93,71,63));
        matriculas.add( new MatriculaEscuela(13,5,5,5));
        matriculas.add (new MatriculaJardin(73,93,65));
        matriculas.add(new MatriculaMaternal(57,72,90));
        matriculas.add(new MatriculaMaternal(21,44,64));
        for (Matricula matricula: matriculas){
            matricula.establecerTarifa();
        }
        TipoMatricula tipos= new TipoMatricula(matriculas);
        for (Matricula matricula: matriculas)
            System.out.println(matricula);
        System.out.printf("Promedio Tarifas: %s\n", tipos.establecerPromedioTarifas());
    }
}
