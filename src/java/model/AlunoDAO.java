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
import java.sql.CallableStatement;
import java.sql.PreparedStatement;

/**
 *
 * @author apmagalhaes
 */
public class AlunoDAO {
  public boolean consultar (Aluno aluno, String condicao){
      Connection conexao = ConnectionFactory.getConnection();
//      List<Aluno> listAluno = new ArrayList<Aluno>();
          boolean retorno = false;
      try{
      String sql = "select matricula,nome,turno,turma,saldo,idUsuario,idResponsavel,situacao from lp3.aluno where 1=1";
      if(aluno.getIdUsuario() > 0){
        sql +=" and idUsuario = '"+aluno.getIdUsuario()+"'";
      }else 
      if(aluno.getMatricula() > 0){
        sql +=" and matricula = '"+aluno.getMatricula()+"'";
      }// else if(!aluno.getNome().isEmpty()){
//        sql +=" and nome = '"+aluno.getNome()+"'";
//      }else if(!aluno.getTurma().isEmpty()){
//        sql +=" and turma = '"+aluno.getTurma()+"'";
//      }else if(!aluno.getTurno().isEmpty()){
//        sql +=" and turno = '"+aluno.getTurno()+"'";      
//      }else if(aluno.getSaldo() > 0){
//        sql +=" and saldo = '"+aluno.getSaldo()+"'";
//      }else if(aluno.getIdResponsavel()> 0){
//        sql +=" and idResponsavel = '"+aluno.getIdResponsavel()+"'";
//      }
      if(!condicao.isEmpty()){
            sql += condicao;
      }
      System.out.print(sql);
      PreparedStatement stmt = conexao.prepareStatement(sql);
      ResultSet resposta = stmt.executeQuery();
      //preenche os atributos do objeto com a resposta
      while (resposta.next()){
          aluno.setMatricula(resposta.getInt("matricula"));
          aluno.setNome(resposta.getString("nome"));
          aluno.setTurma( resposta.getString("turma"));
          aluno.setTurno(resposta.getString("turno"));
          aluno.setSaldo(resposta.getDouble("saldo"));
          aluno.setSituacao(resposta.getString("situacao")); 
                    
          retorno = true;
      }
      stmt.close();
      conexao.close();
      }catch(SQLException e){
        System.out.println("Erro na consulta do aluno");
      }
      finally{
          return retorno;
      }
  }
    public boolean cadastrar(Aluno aluno) {
            String sql = "insert into lp3.aluno(turma,turno,saldo,nome,idResponsavel,idUsuario,situacao) "
                    + "values('" + aluno.getTurma() + "','" + aluno.getTurno() + "','" 
                    + aluno.getSaldo() +"','" + aluno.getNome() + "','"  
                    + aluno.getIdResponsavel()+"','" + aluno.getIdUsuario()+"','" + aluno.getSituacao()+"')";
            FabricaConexao fabrica = new FabricaConexao();
            return fabrica.cadastrar(sql);
    }
    public ArrayList<Aluno> consultarLista(Aluno aluno,String condicao){
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        Connection conexao = ConnectionFactory.getConnection();

        try {
            String sql = "select matricula,nome,turno,turma,saldo,idUsuario,idResponsavel,situacao from lp3.aluno where 1=1";
//            if(aluno != null && aluno.getIdUsuario()> 0){
//              sql +=" and idUsusario = "+aluno.getIdUsuario()+"";
//            }else if(aluno != null && aluno.getMatricula() > 0){
//              sql +=" and matricula = "+aluno.getMatricula()+"";
//            }else if(aluno != null && !aluno.getNome().isEmpty()){
//              sql +=" and nome = "+aluno.getNome()+"";
//            }else if(aluno != null && !aluno.getTurma().isEmpty()){
//              sql +=" and turma = "+aluno.getTurma()+"";
//            }else if(aluno != null && !aluno.getTurno().isEmpty()){
//              sql +=" and turno = "+aluno.getTurno()+"";      
//            }else if(aluno != null && aluno.getSaldo() > 0){
//              sql +=" and saldo = "+aluno.getSaldo()+"";
//               }else 
              if(aluno != null && aluno.getIdResponsavel()> 0){
                sql +=" and idResponsavel = '"+aluno.getIdResponsavel()+"'";
              }
//            if(!condicao.isEmpty()){
//                  sql += condicao;

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resposta = stmt.executeQuery();
            while (resposta.next()) {
                
                // criando o objeto Contato
               Aluno alunoResposta = new Aluno();
               alunoResposta.setMatricula(resposta.getInt("matricula"));
               alunoResposta.setNome(resposta.getString("nome"));
               alunoResposta.setTurma( resposta.getString("turma"));
               alunoResposta.setTurno(resposta.getString("turno"));
               alunoResposta.setSaldo(resposta.getDouble("saldo"));
               alunoResposta.setIdUsuario(resposta.getInt("idUsuario"));
               alunoResposta.setIdResponsavel(resposta.getInt("idResponsavel"));
               alunoResposta.setSituacao(resposta.getString("situacao")); 
               // adicionando o objeto à lista
               listaAluno.add(alunoResposta);
            }

            stmt.close();
            conexao.close();
        }catch(SQLException e){
          System.out.println("Erro na consulta da lista alunos");
        }
        finally{
            return listaAluno;
        }
    }

  public int editar (Aluno aluno){
      Connection conexao = ConnectionFactory.getConnection();
      int resposta=0;
      try{
      Statement sentenca = conexao.createStatement();
      String sql = "update lp3.aluno "+
                   "set nome='"+aluno.getNome()+"', turma='"+aluno.getTurma()+"',turno='"+aluno.getTurno()+
                   "',situacao='"+aluno.getSituacao()+"' "+"where matricula='"+aluno.getMatricula()+"'";

      resposta = sentenca.executeUpdate(sql);
      
       sentenca.close();
       conexao.close();
      }catch(SQLException erro){
           System.out.println("Erro no update do aluno");
      }
      finally{
          return resposta;
      }
  }
    public boolean inserirSaldo (Aluno aluno){
      Connection conexao = ConnectionFactory.getConnection();
     boolean retorno = false;
//       String sql = "{call lp3.inserirSaldo("+
//                   + aluno.getSaldo()+ ","+aluno.getMatricula()+");}";
      //prepare para conexao e passa a query para executar logo depois

 
      try{
      //query para executar procedure
       String sql = "{call lp3.inserirSaldo(?,?);}";
      CallableStatement sentenca = conexao.prepareCall(sql);
      sentenca.setDouble(1, aluno.getSaldo());
      sentenca.setInt(2, aluno.getMatricula());
      ResultSet resposta = sentenca.executeQuery();
      while (resposta.next()) {
          resposta.getInt("saldo");
      }
       //retorno = sentenca.execute();

       sentenca.close();
       conexao.close();
      }catch(SQLException e){
            System.out.println("Erro ao executar a procedure inserirSaldo");
      }
      finally{
          return retorno;
      }
  } 
  /*
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
*/
  public int excluir (Aluno aluno){
      Connection conexao = ConnectionFactory.getConnection();
      int resposta=0;
      try{
      Statement sentenca = conexao.createStatement();

      String sql = "delete from lp3.aluno "+
                   "where matricula="+aluno.getMatricula();
      resposta = sentenca.executeUpdate(sql);
      
      sentenca.close();
      conexao.close();
      }catch(SQLException erro){
           System.out.println("Erro");
      }
      finally{
          return resposta;
      }
  }
  

}
