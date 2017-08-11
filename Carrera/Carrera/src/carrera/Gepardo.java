/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author marti
 */
    class Guepardo implements Runnable{
        
        
    public boolean guepardo=true;
    
        private double tiempo=5;
	private JLabel imagen;
	private JPanel movimiento;
	private JLabel tiro;	
	private JLabel ganador;
	private JButton iniciar;

        
 public Guepardo(double tiempo,JLabel imagen,JPanel movimiento,JLabel tiro,JLabel ganador,JButton iniciar){
     this.tiempo = tiempo;
     this.imagen = imagen;
     this.movimiento = movimiento;
     this.tiro = tiro;
     this.ganador = ganador;
     this.iniciar = iniciar;
}

 @Override
 public void run (){
      ganador.setVisible(false);
      iniciar.setVisible(false);
      
      int width = movimiento.getWidth();
      int cX = imagen.getLocation().x;
      int cY = imagen.getLocation().y;
      int temp = cX;
      int var = width - cX;
      var = var/20;
      
      for(int y=0;y<5;y++){
          guepardo=false;
          cX=temp;
          tiro.setText(String.valueOf(y+1));
      for(int x=0;x<20;x++){
          String ruta ="img/guepardo.gif";
          ImageIcon fot= new ImageIcon(ruta);
          
          Icon icono = new ImageIcon(fot.getImage().getScaledInstance(imagen.getWidth(),
                                     imagen.getHeight(),Image.SCALE_DEFAULT));
          imagen.setIcon(icono);
          cX=cX+var;
          
          imagen.setLocation(cX,cY);
          for(double i=1;i<= this.tiempo;i=i+0.1){
              dormir();
          }
      }    
      String ruta ="";
      ImageIcon fot= new ImageIcon(ruta);
      Icon icono = new ImageIcon(fot.getImage().getScaledInstance(imagen.getWidth(),
                  imagen.getHeight(),Image.SCALE_DEFAULT));
      imagen.setIcon(icono);
      imagen.setLocation(temp,cY);
      int anota = 5 + (int)(Math.random()*((10-5)+1));
      guepardo = true;
      fin();
      }
      ganador.setVisible(true);
      iniciar.setVisible(true);
 }
      public void dormir(){
        try {
         Thread.sleep(100);
        }catch(InterruptedException e){
          System.err.println(e.getMessage());
        }
    }
 
    public void fin(){
    if(guepardo==true){
        System.out.println("GUEPARDO GANA");
        //t1.setText("");   
    }
    }
}