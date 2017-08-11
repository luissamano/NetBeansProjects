
package carrera;

public class Carrera {

    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            Final miCarrera = new Final();
            miCarrera.setLocationRelativeTo(null);
            miCarrera.setVisible(true);
        }
    });
    }
}
