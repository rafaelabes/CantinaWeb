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
import controller.Bebida;
import controller.Comida;
import controller.Produto;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
            return fabrica.executar(sql);
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
    public ArrayList<Bebida> consultarListaBebida(Aluno aluno,String condicao){
        ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
        Connection conexao = ConnectionFactory.getConnection();

        try {
            String sql = "select p.idProduto,b.idBebida,b.nome,b.valor from lp3.produto p " 
                    + " inner join bebida b " 
                    + " where p.idProduto = b.idProduto "
                    + " and p.situacao = 'Desbloqueado'"
                    + " and b.quantidade > 0 " ;
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resposta = stmt.executeQuery();
            while (resposta.next()) {
    
                // criando o objeto Contato
               Bebida bebida = new Bebida();
               bebida.setIdBebida(resposta.getInt("idBebida"));
               bebida.setNome(resposta.getString("nome"));
               bebida.setValor(Double.parseDouble(resposta.getString("valor")));
               // adicionando o objeto à lista
               bebidas.add(bebida);
            }
            stmt.close();
            conexao.close();
        }catch(SQLException e){
          System.out.println("Erro na consulta da lista Bebidas");
        }
        finally{
            return bebidas;
        }
    }
    public ArrayList<Comida> consultarListaComida(Aluno aluno,String condicao){
        ArrayList<Comida> comidas = new ArrayList<Comida>();
        Connection conexao = ConnectionFactory.getConnection();

        try {
            String sql = "select p.idProduto,c.idComida,c.nome,c.valor from lp3.produto p " 
                    + " inner join comida c " 
                    + " where p.idProduto = c.idProduto "
                    + " and p.situacao = 'Desbloqueado'"
                    + " and b.quantidade > 0 " ;
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resposta = stmt.executeQuery();
            while (resposta.next()) {
                // criando o objeto Comida
               Comida comida = new Comida();
               comida.setIdComida(resposta.getInt("idComida"));
               comida.setNome(resposta.getString("nome"));
               comida.setValor(Double.parseDouble(resposta.getString("valor")));
               // adicionando o objeto à lista
               comidas.add(comida);
            }
            stmt.close();
            conexao.close();
        }catch(SQLException e){
          System.out.println("Erro na consulta da lista Bebidas");
        }
        finally{
            return comidas;
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
   public boolean inserirSaldo (Aluno aluno,Double saldo) throws SQLException{
        boolean retorno;
        FabricaConexao fabrica = new FabricaConexao();        
        Date data = new Date(System.currentTimeMillis());  
        SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd"); 
        String sqlInseriSaldo = "insert into lp3.saldo (dataInsercao,valor,matriculaAluno) values ('"
                +formatarDate.format(data)+"','"+saldo+"',"+aluno.getMatricula()+");";

        retorno = fabrica.executar(sqlInseriSaldo);
 
        if(retorno){
 
        }
       
        return retorno;
   }
    public boolean updataSaldo (Aluno aluno,Double saldo) throws SQLException{
      Connection conexao = ConnectionFactory.getConnection();
      boolean retorno = false;
      try{
            double valorSaldo = 0;
            valorSaldo = saldo + aluno.getSaldo();
                       System.out.print(valorSaldo);
            String sqlSaldoUp = "update lp3.aluno "+
                      "set saldo = '"+ valorSaldo +"' where matricula='"+aluno.getMatricula()+"';";
            PreparedStatement stmtUp = conexao.prepareStatement(sqlSaldoUp);
            stmtUp.executeUpdate(sqlSaldoUp);
            stmtUp.close();
            conexao.close();
            retorno = true;

      }catch(SQLException e){
            System.out.println("Erro ao executar a procedure inserirSaldo");
      }
      finally{
        return retorno;
      }
 } 
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
