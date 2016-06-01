/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.SQLException;
import model.UsuarioDAO;
/**
 *
 * @author Rafaela
 */
public class Usuario {

    private String senha,login;
    private int tipo,idUsuario,idEscola;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(int idEscola) {
        this.idEscola = idEscola;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean  consultar(String condicao){
        UsuarioDAO usuario = new UsuarioDAO();
        if(usuario.consultar(this, condicao))
            return true;
        return false;
    }
    public void verificaLogin() throws SQLException {
     UsuarioDAO usuarioDAO = new UsuarioDAO();
     usuarioDAO.login(this);
    }
    public boolean cadastrar() {
        UsuarioDAO usuario = new UsuarioDAO();
        return usuario.cadastrar(this);
    }

    private void editar() {
    }

    private void bloquear() {
    }

    public void excluir() {
        UsuarioDAO usuario = new UsuarioDAO();
        usuario.excluir(this);
    }
}
