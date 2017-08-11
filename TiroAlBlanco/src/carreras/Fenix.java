/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreras;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import tiroalblanco.Interfaz;
import static tiroalblanco.Interfaz.JL1;
import static tiroalblanco.Interfaz.btnIniciar;

/**
 *
 * @author leondev
 */
public class Fenix extends Thread implements Runnable {
    
    private double Tiempo;
    private JLabel Imagen;
    private JButton Iniciar;
    private JLabel shot;
    private boolean Fenix = false;
    
    public Fenix(double Tiempo,JLabel Imagen,JButton Iniciar) {
        this.Tiempo= Tiempo;
        this.Imagen =Imagen;
        this.Iniciar = Iniciar;
        this.shot = shot;
    }

    @Override
    public void run() {
        btnIniciar.setVisible(false);
                int cX = JL1.getLocation().x;
                int cY = JL1.getLocation().y;
                
                int temp = cX;
                int var = 10 - cX;
                var = var /20;
                
                for (int y = 0; y < 5; y++)
                {
                    Fenix = false;
                    cX = temp;
                    //shot.setText(String.valueOf(y + 1));
                    
                    for (int x = 0; x < 20; x++)
                    {
                        String ruta = "imagenes/flecha1.png";
                        ImageIcon fot = new ImageIcon(ruta);
                        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(JL1.getWidth(),
                                JL1.getHeight(),Image.SCALE_DEFAULT));
                        Interfaz.JL1.setIcon(icono);
                        //Imagen.setLocation(temp, cY);
                        
                        //int anota = 5 + (int) (Math.random() *((10-5) + 1))
                        cX = cX + var;
                        Interfaz.JL1.setLocation(cX,cY);
                        
                        for (double i = 0; i <= this.Tiempo; i = i + 0.1)
                        {
                            dormir();
                        }


                        }

                        String ruta ="";
                        ImageIcon fot = new ImageIcon(ruta);
                        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(JL1.getWidth(),
                                JL1.getHeight(),
                                Image.SCALE_DEFAULT));

                        JL1.setIcon(icono);
                        JL1.setLocation(temp, cY);

                        int anota = 5 + (int) (Math.random() * ((10 -5) + 1));
                        Fenix = true;
                        fin();

                    

                    Iniciar.setVisible(true);

                }
    }
    
    public void fin()
    {
        
    }
    
    public void dormir() 
    {
        try{
                Thread.sleep(500);
        } catch (InterruptedException e)
        {
            System.err.println(e.getMessage());
        }
    }

        
}
