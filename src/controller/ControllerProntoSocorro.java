/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.ProntoSocorro;
import model.ProntoSocorroDAO;

/**
 *
 * @author fefem
 */
public class ControllerProntoSocorro {
     public void CadastrarProntoSocorro(ProntoSocorro hospital){
        ProntoSocorroDAO hDAO = new ProntoSocorroDAO();
        hDAO.cadastrar(hospital);
    }
    
    public ArrayList<ProntoSocorro> listarProntoSocorro(){
        ProntoSocorroDAO psDAO = new ProntoSocorroDAO();
        return psDAO.buscar();
}
}