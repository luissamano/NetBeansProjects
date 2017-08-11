package carrera;

import java.awt.Button;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Interfaz_carrera extends javax.swing.JFrame {
    
    public boolean guepardo=true;
    public boolean tortuga=true;
    
class Guepardo implements Runnable{
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
 }
    public void fin(){
    if(tortuga==false && guepardo==false){
    } if(tortuga==true){
        System.out.println("TORTUGA GANA");
        jL1.setText("");
    }
    if(guepardo==true){
        System.out.println("GUEPARDO GANA");
        jL3.setText("");   
    }
}
    
    
 class Toturga implements Runnable{
     
     private double tiempo=5;
	private JLabel imagen;
	private JPanel movimiento;
	private JLabel tiro;	
	private JLabel ganador;
	private JButton iniciar;

    Toturga(double tiempo,JLabel imagen,JPanel movimiento,JLabel tiro,JLabel ganador,JButton iniciar) {
         this.tiempo = tiempo;
     this.imagen = imagen;
     this.movimiento = movimiento;
     this.tiro = tiro;
     this.ganador = ganador;
     this.iniciar = iniciar;
    }
    
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
          String ruta ="img/tortuga.gif";
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
         Thread.sleep(50);
     }catch(InterruptedException e){
          System.err.println(e.getMessage());
          }
 }
    
}
    

    public Interfaz_carrera() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB1 = new javax.swing.JButton();
        jP1 = new javax.swing.JPanel();
        jL5 = new javax.swing.JLabel();
        jP2 = new javax.swing.JPanel();
        jL6 = new javax.swing.JLabel();
        jL1 = new javax.swing.JLabel();
        jL3 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jL4 = new javax.swing.JLabel();
        jLG = new javax.swing.JLabel();
        jLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jB1.setText("Iniciar");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jL5.setText("jLabel1");

        javax.swing.GroupLayout jP1Layout = new javax.swing.GroupLayout(jP1);
        jP1.setLayout(jP1Layout);
        jP1Layout.setHorizontalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jL5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jL5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jL6.setText("jLabel1");

        javax.swing.GroupLayout jP2Layout = new javax.swing.GroupLayout(jP2);
        jP2.setLayout(jP2Layout);
        jP2Layout.setHorizontalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jL6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP2Layout.setVerticalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL6, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        jL1.setText("jLabel1");

        jL3.setText("jLabel1");

        jL2.setText("jLabel1");

        jL4.setText("jLabel1");

        jLG.setText("jLabel1");

        jLab.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jL1)
                .addGap(39, 39, 39)
                .addComponent(jL2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLab)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jL3)
                        .addGap(41, 41, 41)
                        .addComponent(jL4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jB1)
                        .addGap(128, 128, 128)
                        .addComponent(jLG)))
                .addGap(0, 147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL2)
                        .addComponent(jLab)))
                .addGap(11, 11, 11)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL3)
                    .addComponent(jL4))
                .addGap(18, 18, 18)
                .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLG)
                    .addComponent(jB1))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        new Thread(new Guepardo(1.3,jL5,jP1,jL2,jLab,jB1)).start();
        new Thread(new Toturga(2.3,jL6,jP2,jL4,jLab,jB1)).start();
    }//GEN-LAST:event_jB1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Interfaz_carrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jL4;
    private javax.swing.JLabel jL5;
    private javax.swing.JLabel jL6;
    private javax.swing.JLabel jLG;
    private javax.swing.JLabel jLab;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jP2;
    // End of variables declaration//GEN-END:variables
}
