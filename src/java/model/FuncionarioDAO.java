/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Aluno;
import controller.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author uoston
 */
public class FuncionarioDAO {
     public boolean consultar (Funcionario funcionario){
      Connection conexao = ConnectionFactory.getConnection();
//      List<Aluno> listAluno = new ArrayList<Aluno>();
          boolean retorno = false;
      try{
      String sql = "select idAluno,matricula,nome,turno,turma,saldo from lp3.aluno where 1=1";
      if(funcionario != null && funcionario.getIdUsuario() > 0){
        sql +=" and idUsuario = "+funcionario.getIdUsuario()+"";
      }
      PreparedStatement stmt = conexao.prepareStatement(sql);
      ResultSet resposta = stmt.executeQuery();

      while (resposta.next()){


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
    public int cadastrar(Aluno aluno) {
        Connection conexao = ConnectionFactory.getConnection();
        int resposta = 0;
        try {
            Statement sentenca = conexao.createStatement();
            String sql = "insert into lp3.aluno(matricula,turma,turno,saldo,consumo) "
                    + "values('" + aluno.getMatricula() + "','" + aluno.getTurma() + "','" + aluno.getTurno() + "','" + aluno.getSaldo() + "','" + aluno.getConsumo()+ "')";
            resposta = sentenca.executeUpdate(sql);
        } catch (SQLException erro) {
            System.out.println("Erro");
        } finally {
            System.out.println("Sucesso!");
            return resposta;
        }
        
    }
    
}
