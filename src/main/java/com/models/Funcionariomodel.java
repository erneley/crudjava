/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author traba
 */
public class Funcionariomodel {
    private int id;
    private String numeroIdentificacion;
  private String nombre;
private String apellido;
    private String sexo;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;
   //* private LocalDateTime fechaCreacion;
   //* private LocalDateTime fechaActualizacion;
    
    private int tipoIdentificacion;
    private int estadoCivil;
        
        
	
        
        
        
        public Funcionariomodel(){}



	

    public Funcionariomodel(int id, String numeroIdentificacion,  String nombre, String apellido, String sexo, String direccion, String telefono, String fechaNacimiento, int tipoIdentificacion, int estadoCivil) {
        this.id = id;
        this.numeroIdentificacion = numeroIdentificacion;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
      //  this.fechaCreacion = fechaCreacion;
      //  this.fechaActualizacion = fechaActualizacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.estadoCivil = estadoCivil;
        
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

    public int getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(int tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
	
	@Override
	public String toString() {
		return this.id+", "+this.nombre+", "+this.apellido;
	}        
        
        
    
}
