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
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;
import mack.entities.Usuario;

/**
 *
 * @author rb
 */
public class BuscaPorIdController extends AbstractController {
    public void execute() {
        try {
            String stringid = this.getRequest().getParameter("id");
            int id = Integer.parseInt(stringid);
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            Usuario u;
            u = (Usuario)dao.buscaUsuarioPorId(id);

            this.setReturnPage("/usuario.jsp");
            this.getRequest().setAttribute("usuario", u);
        } catch(Exception ex) {
            Logger.getLogger(BuscaTodosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}