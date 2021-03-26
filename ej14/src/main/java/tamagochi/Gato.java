/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagochi;



/**
 *
 * @author Edu Jimenez
 */
public class Gato extends Tamagochi {

    public static byte causarCaos;

    public Gato(String nombre, byte edad, Especie especie, byte hambre, byte suenio, byte diversion, byte estres, byte causarCaos) {
        super(nombre, edad, especie, hambre, suenio, diversion, estres);
        this.causarCaos = causarCaos;
    }

    public Gato(String nombre, Especie especie) {
        super(nombre, especie);
        this.causarCaos = 50;

    }

    @Override
    public void Bajar() {
        super.Bajar();
        this.causarCaos -= 10;
    }

    @Override
    public boolean estaVivo() {
        return super.estaVivo() && causarCaos > 0; //To change body of generated methods, choose Tools | Templates.
    }

    public void CausarCaos() {
        Bajar();
        this.causarCaos += 30;
    }

    public byte getCausarCaos() {
        return causarCaos;
    }

    public void setCausarCaos(byte causarCaos) {
        this.causarCaos = causarCaos;
    }

    @Override
    public String toString() {
        return super.toString()+"causar caos: "+this.getCausarCaos(); //To change body of generated methods, choose Tools | Templates.
    }

}
