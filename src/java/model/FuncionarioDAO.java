/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Aluno;
import controller.Funcionario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author uoston
 */
public class FuncionarioDAO {
     public boolean consultar (Funcionario funcionario){
      Connection conexao = ConnectionFactory.getConnection();

          boolean retorno = false;
      try{
      String sql = "select idFuncionario,nome,responsavelEscola,cpf,email,idUsuario from lp3.funcionario where 1=1";
      if(funcionario.getIdUsuario() > 0){
        sql +=" and idUsuario = '"+funcionario.getIdUsuario()+"'";
      }else if(funcionario.getIdFuncionario()> 0){
        sql +=" and idFuncionario = '"+funcionario.getIdFuncionario()+"'";
      }

      PreparedStatement stmt = conexao.prepareStatement(sql);
      ResultSet resposta = stmt.executeQuery();
      //preenche os atributos do objeto com a resposta
      while (resposta.next()){
          funcionario.setIdFuncionario(resposta.getInt("idFuncionario"));
          funcionario.setNome(resposta.getString("nome"));
          funcionario.setResponsavelEscola(resposta.getInt("responsavelEscola"));
          funcionario.setCpf(resposta.getInt("cpf"));
          funcionario.setEmail(resposta.getString("email"));
                    
          retorno = true;
      }
      stmt.close();
      conexao.close();
      }catch(SQLException e){
        System.out.println("Erro na consulta do funcionario");
      }
      finally{
          return retorno;
      }
  }
    public boolean cadastrar(Funcionario funcionario) {
            String sql = "insert into lp3.funcionario(nome,responsavelEscola,cpf,email,idUsuario) "
                    + "values('" + funcionario.getNome() + "','" + funcionario.getResponsavelEscola()+ "','" 
                    + funcionario.getCpf() +"','" + funcionario.getEmail()+ "','"  
                    + funcionario.getIdUsuario()+"','" + "')";
            FabricaConexao fabrica = new FabricaConexao();
            return fabrica.executar(sql);
    }
//    public ArrayList<Funcionario> consultarLista(Funcionario funcionario,String condicao){
//        ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
//        Connection conexao = ConnectionFactory.getConnection();
//
//        try {
//            String sql = "select idFuncionario,nome,responsavelEscola,cpf,email,idUsuario,situacao from lp3.funcionario where 1=1";
////            
//            PreparedStatement stmt = conexao.prepareStatement(sql);
//            ResultSet resposta = stmt.executeQuery();
//            while (resposta.next()) {
//                
//                // criando o objeto Contato
//               Funcionario funcionarioResposta = new Funcionario();
//               funcionarioResposta.setIdFuncionario(resposta.getInt("idFuncionario"));
//               funcionarioResposta.setNome(resposta.getString("nome"));
//               funcionarioResposta.setEscola(resposta.getString("responsavelEscola"));
//               funcionarioResposta.setCpf(resposta.getString("cpf"));
//               funcionarioResposta.setEmail(resposta.getString("email"));
//               funcionarioResposta.setIdUsuario(resposta.getInt("idUsuario"));
//               funcionarioResposta.setSituacao(resposta.getString("situacao"));
//               
//                
//               // adicionando o objeto à lista
//               listaFuncionario.add(funcionarioResposta);
//            }
//
//            stmt.close();
//            conexao.close();
//        }catch(SQLException e){
//          System.out.println("Erro na consulta da lista funcionarios");
//        }
//        finally{
//            return listaFuncionario;
//        }
//    }

  public int editar (Funcionario funcionario){
      Connection conexao = ConnectionFactory.getConnection();
      int resposta=0;
      try{
      Statement sentenca = conexao.createStatement();
//      String sql = "update lp3.funcionario "+
//                   "set nome='"+funcionario.getNome()+"', responsavelEscola='"+funcionario.getEscola()+"',cpf='"+funcionario.getCpf()+
//                   "', situacao='"+funcionario.getSituacao()+"' "+"where idFuncionario='"+funcionario.getIdFuncionario()+"'";

//      resposta = sentenca.executeUpdate(sql);
      
       sentenca.close();
       conexao.close();
      }catch(SQLException erro){
           System.out.println("Erro no update do funcionario");
      }
      finally{
          return resposta;
      }
  }
    
  public int excluir (Funcionario funcionario){
      Connection conexao = ConnectionFactory.getConnection();
      int resposta=0;
      try{
      Statement sentenca = conexao.createStatement();

      String sql = "delete from lp3.funcionario "+
                   "where idFuncionario="+funcionario.getIdFuncionario();
      resposta = sentenca.executeUpdate(sql);
      
      sentenca.close();
      conexao.close();
      }catch(SQLException erro){
           System.out.println("Erro ao excluir funcionario");
      }
      finally{
          return resposta;
      }
  }
    
}
