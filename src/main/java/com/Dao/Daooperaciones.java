/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Dao;

import java.util.List;

import com.models.Funcionariomodel;

/**
 *
 * @author traba
 */
public interface Daooperaciones {
    
    public boolean registrar(Funcionariomodel funcionario);
	public List<Funcionariomodel> obtener();
	public boolean actualizar(Funcionariomodel funcionario);
	public boolean eliminar(Funcionariomodel funcionario);
    
    
}
