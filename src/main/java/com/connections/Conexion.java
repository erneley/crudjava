/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author traba
 */
public class Conexion {
    
    public static Connection conectar()  {
		Connection con = null;
		
		
                

		
		try {
                    
                    
                   
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recursosiud", "root", "");
        } catch (ClassNotFoundException ex) {

       
                          // Class.forName("com.mysql.jdbc.driver");
			//Class.forName("com.mysql.jdbc.Driver");
     //con= DriverManager.getConnection("jdbc:mysql://localhost:3306/iudigital&user=root&password=");
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.getMessage();
		}
		return con;
	}
    
}
