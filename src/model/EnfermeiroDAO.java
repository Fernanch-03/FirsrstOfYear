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

public class EnfermeiroDAO {
    public void cadastrar(Enfermeiro enfermeiro){
        try{
            String query = "insert into enfermeiro (corem) values (?) ";
            try (Connection con = new ConnectionFactory().getConnection()) {
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString(1, enfermeiro.getCorem());
                preparedStmt.executeUpdate();
            }
        }catch(RuntimeException | ClassNotFoundException | SQLException e){throw new RuntimeException(e.getMessage());}
    }
    
    public ArrayList<Enfermeiro> buscar(){
        ArrayList<Enfermeiro> ae = new ArrayList<Enfermeiro>(); 
        try{
            String query = "select * from enfermeiro;";
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement preparedStmt = con.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery(); 
            
            while(rs.next()){
                Enfermeiro e = new Enfermeiro();
                e.setMatricula(rs.getInt("id"));
                ae.add(e);
            }
            
        }catch(RuntimeException | ClassNotFoundException | SQLException e){throw new RuntimeException(e.getMessage());}
        
        return ae;
    }
}
