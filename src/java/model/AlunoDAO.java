/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rafaela
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import controller.Aluno;
import java.sql.PreparedStatement;

/**
 *
 * @author apmagalhaes
 */
public class AlunoDAO {
  public boolean consultar (Aluno aluno){
      Connection conexao = ConnectionFactory.getConnection();
//      List<Aluno> listAluno = new ArrayList<Aluno>();
          boolean retorno = false;
      try{
      String sql = "select idAluno,matricula,nome,turno,turma,saldo from lp3.aluno where 1=1";
      if(aluno != null && aluno.getIdUsuario() > 0){
        sql +=" and idUsuario = "+aluno.getIdUsuario()+"";
      }
      PreparedStatement stmt = conexao.prepareStatement(sql);
      ResultSet resposta = stmt.executeQuery();

      while (resposta.next()){
          aluno.setMatricula(resposta.getInt("matricula"));
          aluno.setNome(resposta.getString("nome"));
          aluno.setTurma( resposta.getString("turma"));
          aluno.setTurno(resposta.getString("turno"));
          aluno.setSaldo(resposta.getString("saldo"));
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
    public boolean cadastrar(Aluno aluno) {
            String sql = "insert into lp3.aluno(turma,turno,saldo,nome,idResponsavel,idUsuario) "
                    + "values('" + aluno.getTurma() + "','" + aluno.getTurno() + "','" 
                    + aluno.getSaldo() +"','" + aluno.getNome() + "','"  
                    + aluno.getIdResponsavel()+"','" + aluno.getIdUsuario()+"')";
            FabricaConexao fabrica = new FabricaConexao();
            return fabrica.cadastrar(sql);
    }
    /*
  public int alterar (Aluno aluno){
      Connection conexao = ConnectionFactory.getConnection();
      int resposta=0;
      try{
      Statement sentenca = conexao.createStatement();
      String sql = "update exercicio.aluno "+
                   "set cpf='"+aluno.getCpf()+"', nome='"+aluno.getNome()+"',tel='"+aluno.getTel()+"',email='"+aluno.getEmail()+"' "+
                   "where idAluno='"+aluno.getIdAluno()+"'";
      resposta = sentenca.executeUpdate(sql);
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, erro.getMessage());
      }
      finally{
          JOptionPane.showMessageDialog(null, "Alterado com sucesso !");
          return resposta;
      }
         String sql = "update contatos set matricula=?, turma=?, turno=?," +
             "turno=?, saldo=? where id=?";
     try {
         PreparedStatement stmt = conexao.prepareStatement(sql);
         stmt.setString(1, contato.getNome());
         stmt.setString(2, contato.getEmail());
         stmt.setString(3, contato.getEndereco());
         stmt.setDate(4, new Date(contato.getDataNascimento()
                 .getTimeInMillis()));
         stmt.setLong(5, contato.getId());
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
  }
  
  public int excluir (Aluno aluno){
      Connection conexao = ConnectionFactory.getConnection();
      int resposta=0;
      try{
      Statement sentenca = conexao.createStatement();
      
      /* Alterar os inserts pra funcionar com companhia*/
 /*String sql = "delete from exercicio.aluno "+
                   "where idAluno="+aluno.getIdAluno();
      resposta = sentenca.executeUpdate(sql);
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, erro.getMessage());
      }
      finally{
          JOptionPane.showMessageDialog(null, "Excluído com sucesso !");
          return resposta;
      }
  }
  */

}
