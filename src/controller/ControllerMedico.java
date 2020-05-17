/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Medico;
import model.MedicoDAO;

/**
 *
 * @author fefem
 */
public class ControllerMedico {
    public void CadastrarMedico(Medico medico){
        MedicoDAO mDAO = new MedicoDAO();
        mDAO.cadastrar(medico);
    }
    
    public ArrayList<Medico> listarMedico(){
        MedicoDAO mDAO = new MedicoDAO();
        return mDAO.buscar();
    }
}
