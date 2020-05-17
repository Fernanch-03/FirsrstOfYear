/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.AddEnfermeiro2;
import view.AddMedico2;
import view.CadastrarHospital2;
import view.CadastrarPaciente2; 
import view.CadastrarFuncionario2;
import view.CadastrarProntoSocorro2;
      


/**
 *
 * @author Aluno02
 */
public class Principal {

 
       public static void main(String[] args) {
        try{
            Connection con = new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null,"Conectado");
            con.close();
        }
        catch(RuntimeException | ClassNotFoundException | SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        Paciente p = new Paciente();
        Funcionario f = new Funcionario();
        Enfermeiro e = new Enfermeiro();
        Medico m = new Medico();
        Hospital h = new Hospital("J.Pereira");
        ProntoSocorro ps = new ProntoSocorro(h,1);
        CadastrarHospital2 cadh = new CadastrarHospital2();
        CadastrarPaciente2 cp = new CadastrarPaciente2();
        CadastrarProntoSocorro2 cps = new CadastrarProntoSocorro2();
        CadastrarFuncionario2 cf = new CadastrarFuncionario2();
        AddMedico2 am = new AddMedico2();
        AddEnfermeiro2 ae = new AddEnfermeiro2();
               
        /*Anotações sobre os erros: 
        1- Eu não sei star double no cadastro do valor hora
        2- Eu não sei porque está reclamando do crm estar nulo no medico, sendo que eta certo
        */
        //cadh.setVisible(true);
        //cp.setVisible(true); 
        //cps.setVisible(true);
        //cf.setVisible(true);
        //am.setVisible(true);
        //ae.setVisible(true);
        
        
       
       
        
    }
   
    
}
