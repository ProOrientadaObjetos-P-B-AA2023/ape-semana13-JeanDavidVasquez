/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author reroes
 */
public class MatriculaCampamento extends Matricula{
    private double cosTrans;
    private double cosComi;
    private double cosInstruc;

    public MatriculaCampamento(double cosTrans, double cosComi, double cosInstruc) {
        this.cosTrans = cosTrans;
        this.cosComi = cosComi;
        this.cosInstruc = cosInstruc;
    }

    public double getTarifa(){
        return (cosTrans + cosComi + cosInstruc);
    }

    @Override
    public String toString() {
        return "MatriculaCampamento{" +
                "cosTrans=" + cosTrans +
                ", cosComi=" + cosComi +
                ", cosInstruc=" + cosInstruc +
                '}';
    }
}
