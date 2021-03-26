/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Edu Jimenez
 */
public class Juego extends CosasConNombre{
    private byte diversion;
    private byte estres;

    public Juego( String nombre,byte diversion, byte estres) {
        super(nombre);
        this.diversion = diversion;
        this.estres = estres;
    }

    public byte getDiversion() {
        return diversion;
    }

    public void setDiversion(byte diversion) {
        this.diversion = diversion;
    }

    public byte getEstres() {
        return estres;
    }

    public void setEstres(byte estres) {
        this.estres = estres;
    }
    
}
