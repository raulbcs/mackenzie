/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.dao.usuario;

/**
 *
 * @author rb
 */
public final class UsuarioConstantes {

    public static final String URL = "jdbc:derby://localhost:1527/meuDB";
    public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    public static final String USER = "me";
    public static final String PASSWORD = "pass";
    public static final String USUARIO_TABLE_NAME = "tb_usuario";
    public static final String USUARIO_ID_SEQUENCE_NAME = "usuario_id_sequence";

    private UsuarioConstantes() {
    }
}
