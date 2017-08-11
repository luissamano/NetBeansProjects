/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanga_final;

import java.util.Random;

/**
 *
 * @author jesusr
 */
public class Master {
    
    static Tiros[] tiros;
    static Random rnd;
    static int[] vel;
    static int[] puntosUno;
    static int[] puntosDos;
    static int[] puntosTres;
    static int[] puntosCuatro;
    
    static int a = 0, b = 0, c = 0,d = 0;
    
    
    static public void reiniciar()
    {
        Frame.JL1.setLocation(Master.tiros[0].getCoorX(),Master.tiros[0].getCoorY());
        Frame.JL2.setLocation(Master.tiros[1].getCoorX(),Master.tiros[1].getCoorY());
        Frame.JL3.setLocation(Master.tiros[2].getCoorX(),Master.tiros[2].getCoorY());
        Frame.JL4.setLocation(Master.tiros[3].getCoorX(),Master.tiros[3].getCoorY());
    }
    
    static public void registrarFlechas(){
        rnd= new Random();
        
        
        tiros = new Tiros[4];
        
        Frame.RES.setText("");
        int[] vel={250,250,250,250};   //Velocidad
        int[] ava={31,32,30,32};       //Avance-distancia
        
        
        
        
        
        
        
        
        
        
        
        
        
        tiros[0] = new Tiros(0,0,0,0,0,"-");
        tiros[1] = new Tiros(0,0,0,0,0,"-");
        tiros[2] = new Tiros(0,0,0,0,0,"-");
        tiros[3] = new Tiros(0,0,0,0,0,"-");
        
        puntosUno = new int[7];
        puntosDos = new int[7];
        puntosTres = new int[7];
        puntosCuatro = new int[7];
        
        
        //ingreso de datos
        //codigos
        tiros[0].setCodigo(101);
        tiros[1].setCodigo(102);
        tiros[2].setCodigo(103);
        tiros[3].setCodigo(104);
        //nombres
        tiros[0].setNombre("uno");
        tiros[1].setNombre("dos");
        tiros[2].setNombre("tres");
        tiros[3].setNombre("cuatro");
        
        //CoordX
        tiros[0].setCoorX(Frame.JL1.getLocation().x);
        tiros[1].setCoorX(Frame.JL2.getLocation().x);
        tiros[2].setCoorX(Frame.JL3.getLocation().x);
        tiros[3].setCoorX(Frame.JL4.getLocation().x);
        
        //CoordX
        tiros[0].setCoorY(Frame.JL1.getLocation().y);
        tiros[1].setCoorY(Frame.JL2.getLocation().y);
        tiros[2].setCoorY(Frame.JL3.getLocation().y);
        tiros[3].setCoorY(Frame.JL4.getLocation().y);
        
        //Vel
        tiros[0].setVelocidad(vel[rnd.nextInt(4)]);
        tiros[1].setVelocidad(vel[rnd.nextInt(4)]);
        tiros[2].setVelocidad(vel[rnd.nextInt(4)]);
        tiros[3].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        tiros[0].setAvance(ava[rnd.nextInt(4)]);
        tiros[1].setAvance(ava[rnd.nextInt(4)]);
        tiros[2].setAvance(ava[rnd.nextInt(4)]);
        tiros[3].setAvance(ava[rnd.nextInt(4)]);
        
        //tiempo
        tiros[0].setTiempo(0);
        tiros[1].setTiempo(0);
        tiros[2].setTiempo(0);
        tiros[3].setTiempo(0);
        
        //puntuacion
        for (int i = 0; i < 7; i++) {
            puntosUno[i] = (int) (Math.random() * 9 + 1);
            puntosDos[i] = (int) (Math.random() * 9 + 1);
            puntosTres[i] = (int) (Math.random() * 9 + 1);
            puntosCuatro[i] = (int) (Math.random() * 9 + 1);
        }
        
        for (int i = 0; i < 7; i++) {
            a = a + puntosUno[i];
            b = b + puntosDos[i];
            c = c + puntosTres[i];
            d = d + puntosCuatro[i];
        }
        
        
    }//
    
    
    static void iniciar(){
        Carrera h1= new Carrera(tiros[0].getNombre());
        h1.start();
        
        Carrera h2= new Carrera(tiros[1].getNombre());
        h2.start();
        
        Carrera h3= new Carrera(tiros[2].getNombre());
        h3.start();
        
        Carrera h4= new Carrera(tiros[3].getNombre());
        h4.start();
    }//iniciar  
    
}
