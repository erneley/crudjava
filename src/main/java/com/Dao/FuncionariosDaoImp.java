/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Dao;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;


import com.models.Funcionariomodel;

import com.connection.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author traba
 */
public class FuncionariosDaoImp implements Daooperaciones {
Connection con;
boolean registrar = false;
    @Override
    public boolean registrar(Funcionariomodel funcionario) {
    
		
		//Statement stm= null;
		
		
		
		
		try {			
			con=Conexion.conectar();
                        
			PreparedStatement registrar =con.prepareStatement("INSERT INTO funcionarios VALUES(?,?,?,?,?,?,?,?,?,?)");
                        
                        
                       registrar.setInt(1,funcionario.getId());
                       registrar.setString(2,funcionario.getNumeroIdentificacion());
                       registrar.setString(3,funcionario.getNombre());
                       registrar.setString(4,funcionario.getApellido());
                        registrar.setString(5,String.valueOf(funcionario.getSexo()));
                       
                       registrar.setString(6,funcionario.getDireccion());
                       registrar.setString(7,funcionario.getTelefono());
                       
                       registrar.setString(8,funcionario.getFechaNacimiento());
                        
                       registrar.setInt(9,funcionario.getTipoIdentificacion());
                       registrar.setInt(10,funcionario.getEstadoCivil());
                      
                       
                    
                       
                       registrar.executeUpdate();
                       
                       
                        
			
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
                
                }
		
		return registrar;
    
    
    }

    @Override
    public List<Funcionariomodel> obtener() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Funcionariomodel funcionario) {
        try {			
			con=Conexion.conectar();
                        
			PreparedStatement actualizar =con.prepareStatement("UPDATE funcionarios set nombres=?,tipos_identificacion_id=? , numero_identificacion=?,apellidos=?"
                                + ",direccion=?,telefono=?,sexo=? ,estados_civil_id=?   where id=?");
                        
                        //,tipos_identificacion_id=?  
                     
                       actualizar.setString(1,funcionario.getNombre());
                       actualizar.setInt(2,funcionario.getTipoIdentificacion());
                       actualizar.setString(3,funcionario.getNumeroIdentificacion());
                      
                     actualizar.setString(4,funcionario.getApellido());
                     actualizar.setString(5,funcionario.getDireccion());
                      actualizar.setString(6,funcionario.getTelefono());
                       actualizar.setString(7,String.valueOf(funcionario.getSexo()));
                       
                     actualizar.setInt(8,funcionario.getEstadoCivil());
                     
                       actualizar.setInt(9,funcionario.getId());
                       
                       
                       
                       actualizar.executeUpdate();
                       
			
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
                
                }
		
		return registrar;
       
    }

    @Override
    public boolean eliminar(Funcionariomodel funcionario) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      try {			
			con=Conexion.conectar();
                        
			PreparedStatement eliminar =con.prepareStatement("DELETE FROM  funcionarios where id=?");
                        
                        
                     
                      /* actualizar.setString(1,funcionario.getNombre());
                       actualizar.setString(2,funcionario.getCedula());
                       actualizar.setString(3,funcionario.getApellido());*/
                        eliminar.setInt(1,funcionario.getId());
                       eliminar.executeUpdate();
                       
                       
                        
			
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
                
                }
		
		return registrar;
     
    }
    
    
    
}
