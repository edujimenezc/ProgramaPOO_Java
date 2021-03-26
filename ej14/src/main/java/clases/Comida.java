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
public class Comida extends CosasConNombre{
    private byte valorEnergetico;
    private byte morrinia;

    public Comida( String nombre,byte valorEnergetico, byte morrinia) {
        super(nombre);
        this.valorEnergetico = valorEnergetico;
        this.morrinia = morrinia;
    }

    public Comida(String nombre) {
        super(nombre);
    }

  
    

    public byte getValorEnergetico() {
        return valorEnergetico;
    }

    public void setValorEnergetico(byte valorEnergetico) {
        this.valorEnergetico = valorEnergetico;
    }

    public byte getMorrinia() {
        return morrinia;
    }

    public void setMorrinia(byte morrinia) {
        this.morrinia = morrinia;
    }
    
   /** Comida Pienso=new Comida((byte)10,(byte)0,"pienso");
     Comida Macarrones=new Comida((byte)15,(byte)-5,"macarrones");
      Comida Jamon=new Comida((byte)20,(byte)0,"jamon");
    */
}



