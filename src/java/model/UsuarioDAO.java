/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.FabricaConexao;
import controller.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author uoston
 */
public class UsuarioDAO {
    public boolean consultar (Usuario usuario, String condicao){
        Connection conexao = ConnectionFactory.getConnection();
        boolean retorno = false;
        try{
        String sql = "select idUsuario,login,tipo,idEscola from lp3.usuario where 1=1";
        if(usuario != null && usuario.getIdUsuario() > 0){
          sql +=" and idUsuario = "+usuario.getIdUsuario()+"";
        }else if(usuario != null && !usuario.getLogin().isEmpty()){
          sql +=" and login = '"+usuario.getLogin()+"'";
        }
        else if(usuario != null && !usuario.getSenha().isEmpty()){
          sql +=" and senha = "+usuario.getSenha()+"";
        }
        else if(usuario != null && usuario.getTipo()> 0){
          sql +=" and tipo = "+usuario.getTipo()+"";
        }
        else if(usuario != null && usuario.getIdEscola()> 0){
          sql +=" and idEscola = "+usuario.getIdEscola()+" ";
        }
        if(!condicao.isEmpty()){
            sql += condicao;
        }
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet resposta = stmt.executeQuery();
        //preenche o objeto com a resposta da consulta
        while (resposta.next()){
            usuario.setIdUsuario(resposta.getInt("idUsuario"));
            usuario.setTipo(resposta.getInt("tipo"));
            usuario.setIdEscola(resposta.getInt("idEscola"));
            retorno = true;
        }
        stmt.close();
        conexao.close();
        }catch(SQLException e){
          System.out.println("Erro");
        }
        finally{
            return retorno;
        }
    }
    public int login(Usuario usuario) throws SQLException {
        //abri a conexao
        Connection conexao = ConnectionFactory.getConnection();
        int retorno = 0;
        try {
            //cria o sql
            String sql = "select * from usuario where login = '"+ usuario.getLogin() +
                    "' and senha = '"+ usuario.getSenha() +"'";
            PreparedStatement sentenca = conexao.prepareStatement(sql);

            ResultSet rs = sentenca.executeQuery();      
        //trata o retorno do sql
        while (rs.next()) {
            usuario.setLogin(rs.getString("login"));
            usuario.setTipo(rs.getInt("tipo"));
            usuario.setIdUsuario(rs.getInt("idUsuario"));
            usuario.setIdEscola(rs.getInt("idEscola"));
            retorno = 1;
        }
        sentenca.close();
        conexao.close();
        //retorno do usuario com o nome prenchido 
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            System.out.println("Erro ao realizar o login");
        } finally {
            System.out.println("Sucesso!");
        }
        return retorno;
    }
    public boolean cadastrar(Usuario usuario) {  
            String sql = "insert into lp3.usuario(login,senha,tipo,idEscola) "
                    + "values('" + usuario.getLogin() + "','" + usuario.getSenha() + "','" 
                    + usuario.getTipo()+ "','" + usuario.getIdEscola() +"')";
            FabricaConexao fabrica = new FabricaConexao();          
            return  fabrica.cadastrar(sql);
    }
      public int excluir (Usuario usuario){
      Connection conexao = ConnectionFactory.getConnection();
      int resposta=0;
      try{
      Statement sentenca = conexao.createStatement();

      String sql = "delete from lp3.aluno "+
                   "where idUsuario="+usuario.getIdUsuario();
      resposta = sentenca.executeUpdate(sql);
      
      sentenca.close();
      conexao.close();
      }catch(SQLException erro){
           System.out.println("Erro no cadastro do usuario");
      }
      finally{
          return resposta;
      }
  }
}
