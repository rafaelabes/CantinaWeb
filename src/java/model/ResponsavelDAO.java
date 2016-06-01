/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import controller.Responsavel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uoston
 */
public class ResponsavelDAO {
      public boolean consultar (Responsavel responsavel){
      Connection conexao = ConnectionFactory.getConnection();
//     List<Aluno> listAluno = new ArrayList<Aluno>();       
      boolean retorno = false;

      try{
      String sql = "select idResponsavel,nome,cpf,telefone,email from lp3.responsavel where 1=1";
      if(responsavel != null && responsavel.getIdUsuario() > 0){
        sql +=" and idUsuario = '"+responsavel.getIdUsuario()+"'";
      }           
            
      PreparedStatement stmt = conexao.prepareStatement(sql);
      ResultSet resposta = stmt.executeQuery();

      while (resposta.next()){
          responsavel.setIdResponsavel(resposta.getInt("idResponsavel"));        
          responsavel.setNome(resposta.getString("nome"));
          responsavel.setCpf(resposta.getString("cpf"));
          responsavel.setTelefone(resposta.getString("telefone"));
          responsavel.setEmail(resposta.getString("email"));
          retorno = true;
      }
      stmt.close();
      conexao.close();
      }catch(SQLException e){
        System.out.println("Erro na consulta do responsavel");
      }
      finally{
          return retorno;
      }
  }
}
