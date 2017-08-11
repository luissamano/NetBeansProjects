/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leondev
 */
public class CONN {

    private Connection conexion;

    public Connection CONN() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://yisti.org:8443/dbdirectorio","adminroot1","adminroot1");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error en la conexión de la base de datos");
        }
        return this.conexion;
    }
    
    
    public void closeCONN ()
    {
        try {
            this.conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(CONN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
