/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanga_final;

/**
 *
 * @author jesusr
 */



import java.awt.*;
import static java.lang.Thread.sleep;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Carrera extends Thread{
    
    int i = 0;
    private boolean b1 = false;
    private boolean b2 = false;
    private boolean b3 = false;
    private boolean b4 = false;
    
    public Carrera(String name) {
        this.setName(name);
    }
    
    
    public void dormir(){
        try {
         Thread.sleep(100);
        }catch(InterruptedException e){
          System.err.println(e.getMessage());
        }
    }
    
    public void run(){
    
    
    do{
        
    if(getName().equals("uno")){
            
            long ti = System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    Frame.JL1.setLocation(Frame.JL1.getLocation().x+Master.tiros[0].getAvance(),Frame.JL1.getLocation().y);
                    sleep(Master.tiros[0].getVelocidad());
                    
                    if(Frame.JL1.getLocation().x>=Frame.meta.getLocation().x){
                        b1 = false;
                        long tf=System.currentTimeMillis();
                        long tt= tf - ti;
                        Master.tiros[0].setTiempo(tt);
                        j=99;
                        if (Master.puntosUno[i] == 0)
                        {
                            String ruta ="img/img0.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco1.getWidth(),
                                     Frame.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco1.setIcon(icono);
                        } else if (Master.puntosUno[i] == 1) {
                            String ruta ="img/img1.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco1.getWidth(),
                                     Frame.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco1.setIcon(icono);
                        } else if (Master.puntosUno[i] == 2) {
                            String ruta ="img/img2.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco1.getWidth(),
                                     Frame.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco1.setIcon(icono);
                        } else if (Master.puntosUno[i] == 3) {
                            String ruta ="img/img3.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco1.getWidth(),
                                     Frame.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco1.setIcon(icono);
                        } else if (Master.puntosUno[i] == 4) {
                            String ruta ="img/img4.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco1.getWidth(),
                                     Frame.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco1.setIcon(icono);
                        } else if (Master.puntosUno[i] == 5) {
                            String ruta ="img/img5.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco1.getWidth(),
                                     Frame.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco1.setIcon(icono);
                        } else if (Master.puntosUno[i] == 6) {
                            String ruta ="img/img6.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco1.getWidth(),
                                     Frame.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco1.setIcon(icono);
                        } else if (Master.puntosUno[i] == 7) {
                            String ruta ="img/img7.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco1.getWidth(),
                                     Frame.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco1.setIcon(icono);
                        } else if (Master.puntosUno[i] == 8) {
                            String ruta ="img/img8.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco1.getWidth(),
                                     Frame.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco1.setIcon(icono);
                        } else if (Master.puntosUno[i] == 9) {
                            String ruta ="img/img9.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco1.getWidth(),
                                     Frame.blanco1.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco1.setIcon(icono);
                        }
                        
                        Frame.RES.append("\nTiro Nº "+(i+1) +"\t"+this.getName()+":"+Master.puntosUno[i]+" ");                       
                    
                    }
                    else{
                        j++;
                       }//else
                    
                } //for
                catch (InterruptedException ex) {
                    
                }
                
                
            }//for
            b1 = true;
            Frame.JL1.setLocation(Frame.JL1.getLocation().x,Frame.JL1.getLocation().y);
            Frame.JL1.setLocation(Master.tiros[0].getCoorX(),Master.tiros[0].getCoorY());
    }//if
    
    
    if(getName().equals("dos")){
            long ti = System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    Frame.JL2.setLocation(Frame.JL2.getLocation().x+Master.tiros[1].getAvance(),Frame.JL2.getLocation().y);
                    sleep(Master.tiros[1].getVelocidad());
                    
                    if(Frame.JL2.getLocation().x>=Frame.meta.getLocation().x){
                        b2 = false;
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Master.tiros[1].setTiempo(tt);
                        if (Master.puntosDos[i] == 0)
                        {
                            String ruta ="img/img0.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco2.getWidth(),
                                     Frame.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco2.setIcon(icono);
                        } else if (Master.puntosDos[i] == 1) {
                            String ruta ="img/img1.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco2.getWidth(),
                                     Frame.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco2.setIcon(icono);
                        } else if (Master.puntosDos[i] == 2) {
                            String ruta ="img/img2.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco2.getWidth(),
                                     Frame.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco2.setIcon(icono);
                        } else if (Master.puntosDos[i] == 3) {
                            String ruta ="img/img3.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco2.getWidth(),
                                     Frame.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco2.setIcon(icono);
                        } else if (Master.puntosDos[i] == 4) {
                            String ruta ="img/img4.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco2.getWidth(),
                                     Frame.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco2.setIcon(icono);
                        } else if (Master.puntosDos[i] == 5) {
                            String ruta ="img/img5.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco2.getWidth(),
                                     Frame.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco2.setIcon(icono);
                        } else if (Master.puntosDos[i] == 6) {
                            String ruta ="img/img6.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco2.getWidth(),
                                     Frame.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco2.setIcon(icono);
                        } else if (Master.puntosDos[i] == 7) {
                            String ruta ="img/img7.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco2.getWidth(),
                                     Frame.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco2.setIcon(icono);
                        } else if (Master.puntosDos[i] == 8) {
                            String ruta ="img/img8.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco2.getWidth(),
                                     Frame.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco2.setIcon(icono);
                        } else if (Master.puntosDos[i] == 9) {
                            String ruta ="img/img9.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco2.getWidth(),
                                     Frame.blanco2.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco2.setIcon(icono);
                        }
                        Frame.RES.append("\nTiro Nº "+(i+1) +"\t"+this.getName()+":"+Master.puntosDos[i]+" ");
                        j=99;
                    }else{
                        j++;
                    }//else
                    
                } //for
                catch (InterruptedException ex) {
                    
                }
            }//for
            b2 = true;
            Frame.JL2.setLocation(Frame.JL2.getLocation().x,Frame.JL2.getLocation().y);    
            Frame.JL2.setLocation(Master.tiros[1].getCoorX(),Master.tiros[1].getCoorY());
    }//if
        
    if(getName().equals("tres")){
            long ti=System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    Frame.JL3.setLocation(Frame.JL3.getLocation().x+Master.tiros[2].getAvance(),Frame.JL3.getLocation().y); 
                    sleep(Master.tiros[2].getVelocidad());
                    
                    if(Frame.JL3.getLocation().x>=Frame.meta.getLocation().x){
                        b3 = false;
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Master.tiros[2].setTiempo(tt);
                        if (Master.puntosTres[i] == 0)
                        {
                            String ruta ="img/img0.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco3.getWidth(),
                                     Frame.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco3.setIcon(icono);
                        } else if (Master.puntosTres[i] == 1) {
                            String ruta ="img/img1.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco3.getWidth(),
                                     Frame.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco3.setIcon(icono);
                        } else if (Master.puntosTres[i] == 2) {
                            String ruta ="img/img2.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco3.getWidth(),
                                     Frame.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco3.setIcon(icono);
                        } else if (Master.puntosTres[i] == 3) {
                            String ruta ="img/img3.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco3.getWidth(),
                                     Frame.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco3.setIcon(icono);
                        } else if (Master.puntosTres[i] == 4) {
                            String ruta ="img/img4.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco3.getWidth(),
                                     Frame.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco3.setIcon(icono);
                        } else if (Master.puntosTres[i] == 5) {
                            String ruta ="img/img5.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco3.getWidth(),
                                     Frame.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco3.setIcon(icono);
                        } else if (Master.puntosTres[i] == 6) {
                            String ruta ="img/img6.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco3.getWidth(),
                                     Frame.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco3.setIcon(icono);
                        } else if (Master.puntosTres[i] == 7) {
                            String ruta ="img/img7.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco3.getWidth(),
                                     Frame.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco3.setIcon(icono);
                        } else if (Master.puntosTres[i] == 8) {
                            String ruta ="img/img8.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco3.getWidth(),
                                     Frame.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco3.setIcon(icono);
                        } else if (Master.puntosTres[i] == 9) {
                            String ruta ="img/img9.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco3.getWidth(),
                                     Frame.blanco3.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco3.setIcon(icono);
                        }
                        Frame.RES.append("\nTiro Nº "+(i+1) +"\t"+this.getName()+":"+Master.puntosDos[i]+" ");
                        j=99;
                    }else{
                        j++;
                    }//else
                    
                } //for
                catch (InterruptedException ex) {
                }
            }//for  
            b3 = true;
            Frame.JL3.setLocation(Frame.JL3.getLocation().x,Frame.JL3.getLocation().y); 
            Frame.JL3.setLocation(Master.tiros[2].getCoorX(),Master.tiros[2].getCoorY());
    }//if
        
    if(getName().equals("cuatro")){
            long ti=System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    Frame.JL4.setLocation(Frame.JL4.getLocation().x+Master.tiros[3].getAvance(),Frame.JL4.getLocation().y);
                    sleep(Master.tiros[3].getVelocidad());
                    
                    if(Frame.JL4.getLocation().x>=Frame.meta.getLocation().x){
                        b4 = false;
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Master.tiros[3].setTiempo(tt);
                        if (Master.puntosCuatro[i] == 0)
                        {
                            String ruta ="img/img0.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco4.getWidth(),
                                     Frame.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco4.setIcon(icono);
                        } else if (Master.puntosCuatro[i] == 1) {
                            String ruta ="img/img1.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco4.getWidth(),
                                     Frame.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco4.setIcon(icono);
                        } else if (Master.puntosCuatro[i] == 2) {
                            String ruta ="img/img2.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco4.getWidth(),
                                     Frame.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco4.setIcon(icono);
                        } else if (Master.puntosCuatro[i] == 3) {
                            String ruta ="img/img3.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco4.getWidth(),
                                     Frame.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco4.setIcon(icono);
                        } else if (Master.puntosCuatro[i] == 4) {
                            String ruta ="img/img4.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco4.getWidth(),
                                     Frame.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco4.setIcon(icono);
                        } else if (Master.puntosCuatro[i] == 5) {
                            String ruta ="img/img5.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco4.getWidth(),
                                     Frame.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco4.setIcon(icono);
                        } else if (Master.puntosCuatro[i] == 6) {
                            String ruta ="img/img6.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco4.getWidth(),
                                     Frame.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco4.setIcon(icono);
                        } else if (Master.puntosCuatro[i] == 7) {
                            String ruta ="img/img7.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco4.getWidth(),
                                     Frame.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco4.setIcon(icono);
                        } else if (Master.puntosCuatro[i] == 8) {
                            String ruta ="img/img8.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco4.getWidth(),
                                     Frame.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco4.setIcon(icono);
                        } else if (Master.puntosCuatro[i] == 9) {
                            String ruta ="img/img9.png";
                                ImageIcon fot= new ImageIcon(ruta);
          
                            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Frame.blanco4.getWidth(),
                                     Frame.blanco4.getHeight(),Image.SCALE_DEFAULT));
                            Frame.blanco4.setIcon(icono);
                        }
                        Frame.RES.append("\nTiro Nº "+(i+1) +"\t"+this.getName()+":"+Master.puntosCuatro[i]+" ");
                        j=99;
                    }else{
                        j++;
                    }//else
                    
                } //for
                catch (InterruptedException ex) {
                }
            }//for
            b4 = true;
            Frame.JL4.setLocation(Frame.JL4.getLocation().x,Frame.JL4.getLocation().y);
            Frame.JL4.setLocation(Master.tiros[3].getCoorX(),Master.tiros[3].getCoorY());     
    }//if
          
    i++;
    
    
    }while(i<7);
    
    Frame.RES.setText("Macadores Finales: \nJugador 1: "+Master.a+"  \nJugador 2: "+Master.b+" "
                                        +"\nJugador 3: "+Master.c+"  \nJugador 4: "+Master.d+" ");
    this.stop();
    
    
    
    }//run
    
}
