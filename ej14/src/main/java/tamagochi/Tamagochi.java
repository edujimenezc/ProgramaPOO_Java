/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagochi;

import tamagochi.Especie;
import clases.Comida;

/**
 *
 * @author Edu Jimenez
 */
import clases.CosasConNombre;
import clases.Juego;

public class Tamagochi extends CosasConNombre {

    private float edad;
    private Especie especie;
    private byte hambre;
    private byte suenio;
    private byte diversion;
    private byte estres;

    public Tamagochi(String nombre, byte edad, Especie especie, byte hambre, byte suenio, byte diversion, byte estres) {
        super(nombre);
        this.edad = edad;
        this.especie = especie;
        this.hambre = hambre;
        this.suenio = suenio;
        this.diversion = diversion;
        this.estres = estres;
    }

    public Tamagochi(String nombre, Especie especie) {
        super(nombre);
        this.especie = especie;
        this.edad = 0;

        this.hambre = 50;
        this.suenio = 50;
        this.diversion = 50;
        this.estres = 50;
    }

    public void Crecer() {
        this.edad += 0.5f;
    }

    public void Bajar() {
        this.diversion -= 10;
        this.estres -= 10;
        this.hambre -= 10;
        this.suenio -= 10;

    }

    public void Comer(Comida c) {
       
        this.hambre += c.getValorEnergetico() + (byte) 10;
        this.suenio += c.getMorrinia();
         Bajar();
    }

    public void Jugar(Juego j) {
      
        this.diversion += j.getDiversion() + (byte) 10;
        this.estres += j.getEstres();
  Bajar();
    }

    public void Dormir() {
      
        this.suenio += (byte) 30;
          Bajar();
    }

    public void Relajarse() {
    
        this.estres += (byte) 30;
            Bajar();
    }

    public boolean estaVivo() {
        if (edad < 25 && diversion > 0 && estres > 0 && hambre > 0 && suenio > 0) {
            return true;
        } else {
            return false;
        }

    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public byte getHambre() {
        return hambre;
    }

    public void setHambre(byte hambre) {
        this.hambre = hambre;
    }

    public byte getSuenio() {
        return suenio;
    }

    public void setSuenio(byte suenio) {
        this.suenio = suenio;
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

    @Override
    public String toString() {
        return this.getNombre()+":" + " edad=" + edad + ", especie=" + especie + ", hambre=" + hambre + ", suenio=" + suenio + ", diversion=" + diversion + ", estres=" + estres ;
    }

}
