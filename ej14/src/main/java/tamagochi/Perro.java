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
public class Perro extends Tamagochi{
    public static byte paseo;

    public Perro(String nombre, byte edad, Especie especie, byte hambre, byte suenio, byte diversion, byte estres,byte paseo) {
        super(nombre, edad, especie, hambre, suenio, diversion, estres);
        this.paseo=paseo;
    }

    public Perro(String nombre,Especie especie) {
        super(nombre,especie);
        this.paseo=50;
    }

    @Override
    public void Bajar() {
        super.Bajar();
        this.paseo-=10;
    }

    @Override
    public boolean estaVivo() {
        return super.estaVivo()&&paseo>0; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
public void Pasear(){
Bajar();
this.paseo+=30;


}
    public byte getPaseo() {
        return paseo;
    }

    public void setPaseo(byte paseo) {
        this.paseo = paseo;
    }

    @Override
    public String toString() {
        return super.toString()+" paseo: "+this.getPaseo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
