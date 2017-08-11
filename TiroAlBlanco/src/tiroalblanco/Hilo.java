/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiroalblanco;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.SliderUI;
import static tiroalblanco.Interfaz.JL1;
import static tiroalblanco.Interfaz.JL2;
import static tiroalblanco.Interfaz.JL3;
import static tiroalblanco.Interfaz.JL4;
import static tiroalblanco.carrera.flechas;
import static tiroalblanco.carrera.rnd;
import static tiroalblanco.carrera.vel;

/**
 *
 * @author leondev
 */
public class Hilo extends Thread{

    int i;
    
    public Hilo(String name) {
        this.setName(name);
    }
    
    
    public void Marcador(int i, int j){
        switch(j)
        {
            case 0:
                
                if (i == 0) {
                    Interfaz.m01.setText(""+carrera.puntosUno[i]);
                } else if (i == 1) {
                    Interfaz.m11.setText(""+carrera.puntosUno[i]);
                } else if (i == 2) {
                    Interfaz.m21.setText(""+carrera.puntosUno[i]);
                } else if (i == 3) {
                    Interfaz.m31.setText(""+carrera.puntosUno[i]);
                } else if (i == 4) {
                    Interfaz.m41.setText(""+carrera.puntosUno[i]);
                } else if (i == 5) {
                    Interfaz.m51.setText(""+carrera.puntosUno[i]);
                }                    
                        
                break;
            case 1:
                
                if (i == 0) {
                    Interfaz.m02.setText(""+carrera.puntosDos[i]);
                } else if (i == 1) {
                    Interfaz.m12.setText(""+carrera.puntosDos[i]);
                } else if (i == 2) {
                    Interfaz.m22.setText(""+carrera.puntosDos[i]);
                } else if (i == 3) {
                    Interfaz.m32.setText(""+carrera.puntosDos[i]);
                } else if (i == 4) {
                    Interfaz.m42.setText(""+carrera.puntosDos[i]);
                } else if (i == 5) {
                    Interfaz.m52.setText(""+carrera.puntosDos[i]);
                }  
                
                break;
            case 2:
                
                if (i == 0) {
                    Interfaz.m03.setText(""+carrera.puntosTres[i]);
                } else if (i == 1) {
                    Interfaz.m13.setText(""+carrera.puntosTres[i]);
                } else if (i == 2) {
                    Interfaz.m23.setText(""+carrera.puntosTres[i]);
                } else if (i == 3) {
                    Interfaz.m33.setText(""+carrera.puntosTres[i]);
                } else if (i == 4) {
                    Interfaz.m43.setText(""+carrera.puntosTres[i]);
                } else if (i == 5) {
                    Interfaz.m53.setText(""+carrera.puntosTres[i]);
                } 
                
                break;
            case 3:
                
                if (i == 0) {
                    Interfaz.m04.setText(""+carrera.puntosCuatro[i]);
                } else if (i == 1) {
                    Interfaz.m14.setText(""+carrera.puntosCuatro[i]);
                } else if (i == 2) {
                    Interfaz.m24.setText(""+carrera.puntosCuatro[i]);
                } else if (i == 3) {
                    Interfaz.m34.setText(""+carrera.puntosCuatro[i]);
                } else if (i == 4) {
                    Interfaz.m44.setText(""+carrera.puntosCuatro[i]);
                } else if (i == 5) {
                    Interfaz.m54.setText(""+carrera.puntosCuatro[i]);
                } 
                
                break;
          
                
            default:
                break;
        }
    }
    
    public void Blancos (int i, int j) { 
        
        switch(j)
        {
            case 0:
                
                if (carrera.puntosUno[i] == 0)
                        {
                            String ruta ="img/img0.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco1.getWidth(),
                                     Interfaz.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco1.setIcon(icono);
                        } else if (carrera.puntosUno[i] == 1) {
                            String ruta ="img/img1.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco1.getWidth(),
                                     Interfaz.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco1.setIcon(icono);
                        } else if (carrera.puntosUno[i] == 2) {
                            String ruta ="img/img2.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco1.getWidth(),
                                     Interfaz.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco1.setIcon(icono);
                        } else if (carrera.puntosUno[i] == 3) {
                            String ruta ="img/img3.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco1.getWidth(),
                                     Interfaz.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco1.setIcon(icono);
                        } else if (carrera.puntosUno[i] == 4) {
                            String ruta ="img/img4.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco1.getWidth(),
                                     Interfaz.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco1.setIcon(icono);
                        } else if (carrera.puntosUno[i] == 5) {
                            String ruta ="img/img5.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco1.getWidth(),
                                     Interfaz.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco1.setIcon(icono);
                        } else if (carrera.puntosUno[i] == 6) {
                            String ruta ="img/img6.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco1.getWidth(),
                                     Interfaz.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco1.setIcon(icono);
                        } else if (carrera.puntosUno[i] == 7) {
                            String ruta ="img/img7.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco1.getWidth(),
                                     Interfaz.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco1.setIcon(icono);
                        } else if (carrera.puntosUno[i] == 8) {
                            String ruta ="img/img8.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco1.getWidth(),
                                     Interfaz.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco1.setIcon(icono);
                        } else if (carrera.puntosUno[i] == 9) {
                            String ruta ="img/img9.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco1.getWidth(),
                                     Interfaz.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco1.setIcon(icono);
                        }                    
                        
                break;
            case 1:
                
                if (carrera.puntosDos[i] == 0)
                        {
                            String ruta ="img/img0.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco2.getWidth(),
                                     Interfaz.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco2.setIcon(icono);
                        } else if (carrera.puntosDos[i] == 1) {
                            String ruta ="img/img1.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco2.getWidth(),
                                     Interfaz.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco2.setIcon(icono);
                        } else if (carrera.puntosDos[i] == 2) {
                            String ruta ="img/img2.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco2.getWidth(),
                                     Interfaz.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco2.setIcon(icono);
                        } else if (carrera.puntosDos[i] == 3) {
                            String ruta ="img/img3.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco2.getWidth(),
                                     Interfaz.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco2.setIcon(icono);
                        } else if (carrera.puntosDos[i] == 4) {
                            String ruta ="img/img4.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco2.getWidth(),
                                     Interfaz.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco2.setIcon(icono);
                        } else if (carrera.puntosDos[i] == 5) {
                            String ruta ="img/img5.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco2.getWidth(),
                                     Interfaz.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco2.setIcon(icono);
                        } else if (carrera.puntosDos[i] == 6) {
                            String ruta ="img/img6.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco2.getWidth(),
                                     Interfaz.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco2.setIcon(icono);
                        } else if (carrera.puntosDos[i] == 7) {
                            String ruta ="img/img7.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco2.getWidth(),
                                     Interfaz.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco2.setIcon(icono);
                        } else if (carrera.puntosDos[i] == 8) {
                            String ruta ="img/img8.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco2.getWidth(),
                                     Interfaz.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco2.setIcon(icono);
                        } else if (carrera.puntosDos[i] == 9) {
                            String ruta ="img/img9.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco2.getWidth(),
                                     Interfaz.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco2.setIcon(icono);
                        }
                
                break;
            case 2:
                
                if (carrera.puntosTres[i] == 0)
                        {
                            String ruta ="img/img0.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco3.getWidth(),
                                     Interfaz.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco3.setIcon(icono);
                        } else if (carrera.puntosTres[i] == 1) {
                            String ruta ="img/img1.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco3.getWidth(),
                                     Interfaz.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco3.setIcon(icono);
                        } else if (carrera.puntosTres[i] == 2) {
                            String ruta ="img/img2.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco3.getWidth(),
                                     Interfaz.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco3.setIcon(icono);
                        } else if (carrera.puntosTres[i] == 3) {
                            String ruta ="img/img3.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco3.getWidth(),
                                     Interfaz.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco3.setIcon(icono);
                        } else if (carrera.puntosTres[i] == 4) {
                            String ruta ="img/img4.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco3.getWidth(),
                                     Interfaz.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco3.setIcon(icono);
                        } else if (carrera.puntosTres[i] == 5) {
                            String ruta ="img/img5.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco3.getWidth(),
                                     Interfaz.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco3.setIcon(icono);
                        } else if (carrera.puntosTres[i] == 6) {
                            String ruta ="img/img6.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco3.getWidth(),
                                     Interfaz.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco3.setIcon(icono);
                        } else if (carrera.puntosTres[i] == 7) {
                            String ruta ="img/img7.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco3.getWidth(),
                                     Interfaz.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco3.setIcon(icono);
                        } else if (carrera.puntosTres[i] == 8) {
                            String ruta ="img/img8.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco3.getWidth(),
                                     Interfaz.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco3.setIcon(icono);
                        } else if (carrera.puntosTres[i] == 9) {
                            String ruta ="img/img9.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco3.getWidth(),
                                     Interfaz.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco3.setIcon(icono);
                        }
                
                break;
            case 3:
                
                if (carrera.puntosCuatro[i] == 0)
                        {
                            String ruta ="img/img0.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco4.getWidth(),
                                     Interfaz.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco4.setIcon(icono);
                        } else if (carrera.puntosCuatro[i] == 1) {
                            String ruta ="img/img1.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco4.getWidth(),
                                     Interfaz.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco4.setIcon(icono);
                        } else if (carrera.puntosCuatro[i] == 2) {
                            String ruta ="img/img2.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco4.getWidth(),
                                     Interfaz.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco4.setIcon(icono);
                        } else if (carrera.puntosCuatro[i] == 3) {
                            String ruta ="img/img3.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco4.getWidth(),
                                     Interfaz.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco4.setIcon(icono);
                        } else if (carrera.puntosCuatro[i] == 4) {
                            String ruta ="img/img4.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco4.getWidth(),
                                     Interfaz.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco4.setIcon(icono);
                        } else if (carrera.puntosCuatro[i] == 5) {
                            String ruta ="img/img5.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco4.getWidth(),
                                     Interfaz.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco4.setIcon(icono);
                        } else if (carrera.puntosCuatro[i] == 6) {
                            String ruta ="img/img6.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco4.getWidth(),
                                     Interfaz.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco4.setIcon(icono);
                        } else if (carrera.puntosCuatro[i] == 7) {
                            String ruta ="img/img7.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco4.getWidth(),
                                     Interfaz.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco4.setIcon(icono);
                        } else if (carrera.puntosCuatro[i] == 8) {
                            String ruta ="img/img8.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco4.getWidth(),
                                     Interfaz.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco4.setIcon(icono);
                        } else if (carrera.puntosCuatro[i] == 9) {
                            String ruta ="img/img9.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Interfaz.blanco4.getWidth(),
                                     Interfaz.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Interfaz.blanco4.setIcon(icono);
                        }
                
                break;
          
                
            default:
                break;
             
        }
        
    }
    
    
    public void run(){
  
    do{
        
    if(getName().equals("Fenix")){
            
            long ti = System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    Interfaz.JL1.setLocation(Interfaz.JL1.getLocation().x+carrera.flechas[0].getAvance(),Interfaz.JL1.getLocation().y);
                    //System.out.println(this.getName()+":"+Interfaz.lblCaballo1.getLocation()+" -- "+Interfaz.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.flechas[0].getVelocidad());
                    
                    if(Interfaz.JL1.getLocation().x>=Interfaz.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.flechas[0].setTiempo(tt);
                        
                        //Interfaz.txtR.append("\nTiro Nº "+(i+1) +"\t"+this.getName()+":"+carrera.puntosUno[i]+" pts");
                        j=99;
                        Blancos(i,0);
                    }
                    else{
                        j++;
                        Marcador(i,0);
                        
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            Interfaz.JL1.setLocation(Interfaz.JL1.getLocation().x,Interfaz.JL1.getLocation().y);
            //this.stop();
            JL1.setLocation(carrera.flechas[0].getCoorX(),carrera.flechas[0].getCoorY());
    
    }//if
    
    
            if(getName().equals("Rugal")){
            long ti = System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    Interfaz.JL2.setLocation(Interfaz.JL2.getLocation().x+carrera.flechas[1].getAvance(),Interfaz.JL2.getLocation().y);
                    //System.out.println(this.getName()+":"+Interfaz.lblCaballo1.getLocation()+" -- "+Interfaz.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.flechas[1].getVelocidad());
                    
                    if(Interfaz.JL2.getLocation().x>=Interfaz.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.flechas[1].setTiempo(tt);
                        
                        //Interfaz.txtR.append("\nTiro Nº "+(i+1) +"\t"+this.getName()+":"+carrera.puntosDos[i]+" pts");
                        j=99;
                        Blancos(i,1);
                    }else{
                        j++;
                        Marcador(i,1);
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
              
             
            
             
        }//for
            Interfaz.JL2.setLocation(Interfaz.JL2.getLocation().x,Interfaz.JL2.getLocation().y);    
            JL2.setLocation(carrera.flechas[1].getCoorX(),carrera.flechas[1].getCoorY());
            //this.stop();
        }//if
        
        if(getName().equals("Sims")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    Interfaz.JL3.setLocation(Interfaz.JL3.getLocation().x+carrera.flechas[2].getAvance(),Interfaz.JL3.getLocation().y);
                    //System.out.println(this.getName()+":"+Interfaz.lblCaballo1.getLocation()+" -- "+Interfaz.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.flechas[2].getVelocidad());
                    
                    if(Interfaz.JL3.getLocation().x>=Interfaz.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.flechas[2].setTiempo(tt);
                        
                        //Interfaz.txtR.append("\nTiro Nº "+(i+1) +"\t"+this.getName()+":"+carrera.puntosTres[i]+" pts");
                        j=99;
                        Blancos(i,2);
                    }else{
                        j++;
                        Marcador(i,2);
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for  
            Interfaz.JL3.setLocation(Interfaz.JL3.getLocation().x,Interfaz.JL3.getLocation().y); 
            JL3.setLocation(carrera.flechas[2].getCoorX(),carrera.flechas[2].getCoorY());
            //this.stop();
        }//if
        
        if(getName().equals("Glz")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    Interfaz.JL4.setLocation(Interfaz.JL4.getLocation().x+carrera.flechas[3].getAvance(),Interfaz.JL4.getLocation().y);
                    //System.out.println(this.getName()+":"+Interfaz.lblCaballo1.getLocation()+" -- "+Interfaz.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.flechas[3].getVelocidad());
                    
                    if(Interfaz.JL4.getLocation().x>=Interfaz.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.flechas[3].setTiempo(tt);
                        //Interfaz.txtR.append("\nTiro Nº "+(i+1) +"\t"+this.getName()+":"+carrera.puntosCuatro[i]+" pts");
                        j=99;
                        Blancos(i,3);
                    }else{
                        j++;
                        Marcador(i,3);
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
              
          
             
        }//for
          Interfaz.JL4.setLocation(Interfaz.JL4.getLocation().x,Interfaz.JL4.getLocation().y);
          JL4.setLocation(carrera.flechas[3].getCoorX(),carrera.flechas[3].getCoorY());     
          //this.stop();
        }//if
              
   
    
    i++;
    }while(i!=6);
    
    
    Interfaz.jButton1.setEnabled(true);
    if (!Interfaz.m51.getText().equals("-") && !Interfaz.m52.getText().equals("-") 
            && !Interfaz.m53.getText().equals("-") && !Interfaz.m54.getText().equals("-"))
    {
        Interfaz.txtR.setText("Macadores Finales: \nFenix: "+carrera.a+"  \nRugal: "+carrera.b+" \nSims: "+carrera.c+" \nGlz: "+carrera.d+"");
        
    }
    
    this.stop();
    }//run
    
        
    
}//class
