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

public class Final extends javax.swing.JFrame {
    
    
    public boolean guepardo=true;
    public boolean tortuga=true;
    
    Image ImagenesUno[] = new Image[8];

    public Final() {
        initComponents();
    }
    
    
    
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
      
      for(int y=0;y<12;y++)
      {
          
          guepardo=false;
          cX=temp;
          tiro.setText(String.valueOf(y+1));
          
          String[] vector_img = {"saltar01.png",
                                 "saltar02.png",
                                 "saltar03.png",
                                 "saltar04.png",
                                 "saltar05.png",
                                 "saltar06.png",
                                 "saltar07.png",
                                 "saltar08.png",
                                 "saltar09.png",
                                 "saltar10.png",
                                 "saltar11.png",
                                 "saltar12.png",};
	
          for(int x=0;x<12;x++){
            
              //String ruta ="img/guepardo.gif";
              ImageIcon fot= new ImageIcon(vector_img[y]);
          
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
    
    
    
    
    
    
    public void fin(){
    if(tortuga==false && guepardo==false){
    } 
    if(tortuga == true){
        System.out.println("TORTUGA GANA");
    }
    if(guepardo == true){
        System.out.println("GUEPARDO GANA");
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
      tortuga = true;
      fin();
      }
      ganador.setVisible(true);
      iniciar.setVisible(true);
 }
    public void dormir(){
      try {
         Thread.sleep(80);
     }catch(InterruptedException e){
          System.err.println(e.getMessage());
     }
 }
    
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPista = new javax.swing.JPanel();
        P1 = new javax.swing.JPanel();
        lbGepardo = new javax.swing.JLabel();
        P2 = new javax.swing.JPanel();
        lbTortuga = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbVuelta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        g5 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Ganador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        PanelPista.setBackground(new java.awt.Color(204, 255, 204));
        PanelPista.setBorder(new javax.swing.border.MatteBorder(null));

        lbGepardo.setText("Gepardo");

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbGepardo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbGepardo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbTortuga.setText("Tortuga");

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTortuga, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTortuga, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setText("Green");

        jLabel11.setText("Orange");

        jLabel12.setText("Red");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setText("Gepardo vs Tortuga");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Gepardo");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Carrera:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Tortuga");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Carrera:");

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jButton2.setText("Nueva");

        lbVuelta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbVuelta.setText("0");

        javax.swing.GroupLayout PanelPistaLayout = new javax.swing.GroupLayout(PanelPista);
        PanelPista.setLayout(PanelPistaLayout);
        PanelPistaLayout.setHorizontalGroup(
            PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelPistaLayout.createSequentialGroup()
                        .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPistaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(146, 146, 146)
                                .addComponent(jLabel5))
                            .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelPistaLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(145, 145, 145)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbVuelta)
                        .addGap(44, 44, 44)
                        .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelPistaLayout.setVerticalGroup(
            PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPistaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)))
                    .addGroup(PanelPistaLayout.createSequentialGroup()
                        .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelPistaLayout.createSequentialGroup()
                                .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnIniciar)
                                    .addComponent(lbVuelta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Score");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Gepardo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tortuga");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Carrera");

        g1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        g1.setText("jLabel10");

        t1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t1.setText("jLabel11");

        g2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        g2.setText("jLabel12");

        t2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t2.setText("jLabel13");

        g3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        g3.setText("jLabel14");

        t3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t3.setText("jLabel15");

        g4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        g4.setText("jLabel16");

        t4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t4.setText("jLabel17");

        g5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        g5.setText("jLabel18");

        t5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t5.setText("jLabel19");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Gana:");

        Ganador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ganador.setText("jLabel21");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(113, 113, 113)
                                        .addComponent(g1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(t1)))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(g2)
                                    .addComponent(t2))
                                .addGap(73, 73, 73))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(378, 378, 378)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(t3)
                            .addComponent(g3))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(g4)
                            .addComponent(t4)))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t5)
                            .addComponent(g5))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Ganador)
                        .addGap(49, 49, 49))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(g1)
                    .addComponent(g2)
                    .addComponent(g3)
                    .addComponent(g4)
                    .addComponent(g5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(t1)
                    .addComponent(t2)
                    .addComponent(t3)
                    .addComponent(t4)
                    .addComponent(t5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(Ganador))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelPista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        
        
        
        new Thread(new Guepardo(1.5,lbGepardo,P1,g1,lbVuelta,btnIniciar)).start();
        new Thread(new Toturga(1.5,lbTortuga,P2,t1,lbVuelta,btnIniciar)).start();
    }//GEN-LAST:event_btnIniciarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ganador;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel PanelPista;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel g3;
    private javax.swing.JLabel g4;
    private javax.swing.JLabel g5;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbGepardo;
    private javax.swing.JLabel lbTortuga;
    private javax.swing.JLabel lbVuelta;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    // End of variables declaration//GEN-END:variables
}
