/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cenecmalaga.miproyecto.ej14;

import clases.Comida;
import clases.Juego;
import tamagochi.Tamagochi;
import clases.CosasConNombre;
import java.util.Scanner;
import tamagochi.Especie;
import tamagochi.Gato;
import tamagochi.Perro;

/**
 *
 * @author Edu Jimenez
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comida pienso = new Comida("Pienso", (byte) 10, (byte) 0);
        Comida macarrones = new Comida("Macarrones", (byte) 15, (byte) -5);
        Comida jamon = new Comida("Jamón", (byte) 20, (byte) 0);

        Juego perseguir = new Juego("Perseguir", (byte) 10, (byte) 0);
        Juego escondite = new Juego("Escondite", (byte) 15, (byte) 0);
        Juego pelota = new Juego("Pelota", (byte) 15, (byte) -5);

        Scanner sc = new Scanner(System.in);
        System.out.println("        Tamagochi   \n");
        System.out.println("Elige un tipo de Tamagochi:\nPerro \nGato \nDragón \nPollito ");
        String tipo = sc.nextLine();
        System.out.println("Elige un nombre para tu Tamagochi");

        Tamagochi tamagochi1 = null;
        while (tamagochi1 == null) {
            switch (tipo.toLowerCase().replace('ó', 'o')) {
                case "perro":
                    tamagochi1 = new Perro(sc.nextLine(), Especie.PERRO);
                    break;
                case "gato":
                    tamagochi1 = new Gato(sc.nextLine(), Especie.GATO);
                    break;
                case "dragon":
                    tamagochi1 = new Tamagochi(sc.nextLine(), Especie.DRAGON);
                    break;
                case "pollito":
                    tamagochi1 = new Tamagochi(sc.nextLine(), Especie.POLLITO);
                    break;
            }
        }

        System.out.println("A partir de ahora cada vez que ejecutes una acción, subirá su nº de puntos, el resto bajará en 10 y la edad subirá en 0,5\n"
                + "Si seleccionas (dormir,relajarse,paseo(solo si tienes un perro), causar caos(sólo si tienes un gato)), se suben 20 pt de su necesidad correspondiente\n"
                + "Si seleccionas comer (Pienso (+10 hambre), Macarrones (+15 hambre, -5 extra de sueño), Jamón (+20 hambre))\n"
                + "Si seleccionas jugar,tendrás varios juegos (Perseguir (+10 diversion), Escondite (+15 diversion), Pelota (+15 diversion, -5 extra de estrés)) \n\n");

        do {
            
            System.out.println("Así está tu tamagochi:");
            System.out.println(tamagochi1);
            System.out.println("¿Qué acción quieres hacer?\nNo hacer nada\nComer\nJugar\nDormir\nRelajarse" + (tamagochi1.getEspecie() == Especie.PERRO ? "\nPasear" : "") + (tamagochi1.getEspecie() == Especie.GATO ? "\nCausarCaos" : "")+"\n");

            String accion = sc.nextLine();
               switch (accion.toLowerCase()) {

                    case "comer":
                        System.out.println("¿Qué quieres comer?\nPienso\nMacarrones\nJamón\n");

                        switch ((sc.nextLine().toLowerCase())) {
                            case "pienso":
                                tamagochi1.Comer(pienso);
                                   System.out.println("Tu tamagochi ha comido\n");
                                break;
                            case "macarrones":
                                tamagochi1.Comer(macarrones);
                                   System.out.println("Tu tamagochi ha comido\n");
                                break;

                            case "jamon":
                                tamagochi1.Comer(jamon);
                                   System.out.println("Tu tamagochi ha comido\n");
                                break;
                            default:
                                System.out.println("Recuerda que debes elegir una de las acciones anteriores, no se ha completado la acción correctamente.\n\n");
                                break;
                        }
                     
                        break;
                    case "jugar":
                        System.out.println("¿A qué quieres jugar?\n Perseguir\n Escondite\n Pelota ");
                        switch (sc.nextLine().toLowerCase()) {
                            case "perseguir":
                                tamagochi1.Jugar(perseguir);
                                 System.out.println("Tu tamagochi ha jugado\n");
                                break;
                            case "escondite":
                                tamagochi1.Jugar(escondite);
                                 System.out.println("Tu tamagochi ha jugado\n");
                                break;

                            case "pelota":
                                tamagochi1.Jugar(pelota);
                                 System.out.println("Tu tamagochi ha jugado\n");
                                break;
                            default:
                                System.out.println("Recuerda que debes elegir una de las acciones anteriores, no se ha completado la acción correctamente.\n");
                                break;

                        }
                       
                        break;
                    case "dormir":
                        tamagochi1.Dormir();
                        System.out.println("Tu tamagochi ha dormido\n");
                        break;
                    case "relajarse":
                        tamagochi1.Relajarse();
                        System.out.println("Tu tamagochi se ha relajado\n");
                        break;

                    case "pasear":
                        if (tamagochi1.getClass().toString().toLowerCase().contains("perro")) {
                            ((Perro) tamagochi1).Pasear();
                            System.out.println(tamagochi1.getNombre() + " se va a la calle!!\n");
                        } else {
                            System.out.println("Tu tamagotchi no puede hacer eso\n");
                        }
                        break;

                    case "causarcaos":
                        if (tamagochi1.getClass().toString().toLowerCase().contains("gato")) {
                            ((Gato) tamagochi1).CausarCaos();
                            System.out.println(tamagochi1.getNombre() + " se pone a causar el caos\n");
                        } else {
                            System.out.println("Tu tamagotchi no puede hacer eso\n");
                        }
break;
                    case "no hacer nada":
                        System.out.println("Has elegido no hacer nada\n");
                        tamagochi1.Bajar();
                        break;
                        
                    default:
                        System.out.println("Debes seleccionar una de las acciones mostradas anteriormente, error al ejecutar la accion.\n\n");
                        break;
                }
                tamagochi1.Crecer();
            

        } while (tamagochi1.estaVivo());
        System.out.println("Tu tamagochi ha muerto");

    }

}
