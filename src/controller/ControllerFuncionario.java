/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Funcionario;
import model.FuncionarioDAO; 


public class ControllerFuncionario {

    public void CadastrarFuncionario(Funcionario funcionario){
        FuncionarioDAO fDAO = new FuncionarioDAO();
        fDAO.cadastrar(funcionario);
    }
    
    public ArrayList<Funcionario> listarFuncionario(){
        FuncionarioDAO fDAO = new FuncionarioDAO();
        return fDAO.buscar();
    }


    
}
