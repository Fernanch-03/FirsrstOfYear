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
/**
 *
 * @author fefem
 */
public class ProntoSocorroDAO {
    Hospital h = new Hospital("H");
    ProntoSocorro pss = new ProntoSocorro(h,0);
    public void cadastrar(ProntoSocorro prontosocorro) {
        try{
            String query = "insert into prontosocorro (endereco) values (?,?) ";
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, prontosocorro.getEndereco());
            
            preparedStmt.executeUpdate();
            
            con.close();
        }catch(RuntimeException | ClassNotFoundException | SQLException e){throw new RuntimeException(e.getMessage());}
    }
    
    public ArrayList<ProntoSocorro> buscar(){
        ArrayList<ProntoSocorro> ps = new ArrayList<ProntoSocorro>(); 
        try{
            Connection con = new ConnectionFactory().getConnection();
            String query = "select * from prontosocorro;";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();  // <Giulliano> Nao precisa de parametro no executeQuery
            
            while(rs.next()){
                pss.setIdFilial(rs.getInt("id"));
                ps.add(pss);

            }
            
        }catch(RuntimeException | ClassNotFoundException | SQLException e){throw new RuntimeException(e.getMessage());}
        
        return ps;
    }
    
}
