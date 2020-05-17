/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.lang.Exception;
import java.sql.SQLException;


public class MedicoDAO {
    Medico m = new Medico();
    public void cadastrar(Medico medico) {
        try{
            String query = "insert into medicos (crm,especialidade) values (?,?) ";
            try (Connection con = new ConnectionFactory().getConnection()) {
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString(1, m.getCrm());
                preparedStmt.setString(2, m.getEspecialidade());
                preparedStmt.executeUpdate();
            }
        }catch(RuntimeException | ClassNotFoundException | SQLException e){throw new RuntimeException(e.getMessage());}
    }
    
    public ArrayList<Medico> buscar(){
        ArrayList<Medico> ah = new ArrayList<Medico>(); 
        try{
            Connection con = new ConnectionFactory().getConnection();
            String query = "select * from medicos;";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();  
            
            while(rs.next()){
                m.setMatricula(rs.getInt("id"));
                ah.add(m);
            }
            
        }catch(RuntimeException | ClassNotFoundException | SQLException e){throw new RuntimeException(e.getMessage());}
        
        return ah;
    }
    
}
