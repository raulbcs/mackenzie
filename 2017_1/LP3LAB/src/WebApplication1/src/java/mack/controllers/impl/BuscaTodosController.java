/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.controllers.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.entities.Usuario;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;

/**
 *
 * @author rb
 */
public class BuscaTodosController extends AbstractController {
    public void execute() {
        try {

            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            List usuarios = new ArrayList<Usuario>();

            this.setReturnPage("/index.jsp"); // método não existente?
            this.getRequest().setAttribute("usuarios", usuarios);
        } catch(Exception ex) {
            Logger.getLogger(BuscaTodosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}