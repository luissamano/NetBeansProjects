/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiroalblanco;


import java.util.Random;
import java.lang.*;

/**
 *
 * @author leondev
 */
public class carrera {
    
    static flecha[] flechas;
    static Random rnd;
    static int[] vel;
    static int[] puntosUno;
    static int[] puntosDos;
    static int[] puntosTres;
    static int[] puntosCuatro;
    
    static int a = 0,b = 0,c = 0,d = 0;
    
    static public void reiniciar(){
    int[] vel={50,50,50,50};
    int[] ava={30,30,30,30};
     //Vel
        flechas[0].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        flechas[0].setAvance(ava[rnd.nextInt(4)]);
        
        for (int i = 0; i < 6; i++) {
            puntosUno[i] = (int) (Math.random() * 9 + 1);
            puntosDos[i] = (int) (Math.random() * 9 + 1);
            puntosTres[i] = (int) (Math.random() * 9 + 1);
            puntosCuatro[i] = (int) (Math.random() * 9 + 1);
        }
  
        Interfaz.txtR.setText("");
    
    }//
    
    static public void registrarFlechas(){
        rnd= new Random();
        
        int[] vel={105,109,102,103};
        int[] ava={32,32,31,31};
        flechas = new flecha[4];
        
        flechas[0] = new flecha(0,0,0,0,0,"-");
        flechas[1] = new flecha(0,0,0,0,0,"-");
        flechas[2] = new flecha(0,0,0,0,0,"-");
        flechas[3] = new flecha(0,0,0,0,0,"-");
        puntosUno = new int[6];
        puntosDos = new int[6];
        puntosTres = new int[6];
        puntosCuatro = new int[6];
        
        
        //ingreso de datos
        //codigos
        flechas[0].setCodigo(101);
        flechas[1].setCodigo(102);
        flechas[2].setCodigo(103);
        flechas[3].setCodigo(104);
        //nombres
        flechas[0].setNombre("Fenix");
        flechas[1].setNombre("Rugal");
        flechas[2].setNombre("Sims");
        flechas[3].setNombre("Glz");
        
        //CoordX
        flechas[0].setCoorX(Interfaz.JL1.getLocation().x);
        flechas[1].setCoorX(Interfaz.JL2.getLocation().x);
        flechas[2].setCoorX(Interfaz.JL3.getLocation().x);
        flechas[3].setCoorX(Interfaz.JL4.getLocation().x);
        
        //CoordX
        flechas[0].setCoorY(Interfaz.JL1.getLocation().y);
        flechas[1].setCoorY(Interfaz.JL2.getLocation().y);
        flechas[2].setCoorY(Interfaz.JL3.getLocation().y);
        flechas[3].setCoorY(Interfaz.JL4.getLocation().y);
        //Vel
        flechas[0].setVelocidad(vel[rnd.nextInt(4)]);
        flechas[1].setVelocidad(vel[rnd.nextInt(4)]);
        flechas[2].setVelocidad(vel[rnd.nextInt(4)]);
        flechas[3].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        flechas[0].setAvance(ava[rnd.nextInt(4)]);
        flechas[1].setAvance(ava[rnd.nextInt(4)]);
        flechas[2].setAvance(ava[rnd.nextInt(4)]);
        flechas[3].setAvance(ava[rnd.nextInt(4)]);
        
        //tiempo
        flechas[0].setTiempo(0);
        flechas[1].setTiempo(0);
        flechas[2].setTiempo(0);
        flechas[3].setTiempo(0);
        
        //puntuacion
        for (int i = 0; i < 6; i++) {
            puntosUno[i] = (int) (Math.random() * 9 + 1);
            puntosDos[i] = (int) (Math.random() * 9 + 1);
            puntosTres[i] = (int) (Math.random() * 9 + 1);
            puntosCuatro[i] = (int) (Math.random() * 9 + 1);
        }
        
        for (int i = 0; i < 6; i++) {
            a = a + puntosUno[i];
            b = b + puntosDos[i];
            c = c + puntosTres[i];
            d = d + puntosCuatro[i];
        }
        
        
    }//
    
    
    static void iniciar(){
        Hilo h1= new Hilo(flechas[0].getNombre());
        h1.start();
        
        Hilo h2= new Hilo(flechas[1].getNombre());
        h2.start();
        
        Hilo h3= new Hilo(flechas[2].getNombre());
        h3.start();
        
        Hilo h4= new Hilo(flechas[3].getNombre());
        h4.start();
    }//iniciar  
    
}
