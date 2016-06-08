/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uoston
 */
public class ProdutoDAO {
    private int idProduto;
    private String situacao;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public boolean cadastrar(Produto produto) {
            String sql = "insert into lp3.produto"
                    + "(situacao) "
                    + "values('" + produto.getSituacao()+"')";
            FabricaConexao fabrica = new FabricaConexao();
            return fabrica.executar(sql);
    }
    public boolean consultarMax (Produto produto){
      Connection conexao = ConnectionFactory.getConnection();
//      List<Aluno> listAluno = new ArrayList<Aluno>();
          boolean retorno = false;
      try{
      String sql = "select max(idProduto) as idProduto,situacao from lp3.produto";

      PreparedStatement stmt = conexao.prepareStatement(sql);
      ResultSet resposta = stmt.executeQuery();
      //preenche os atributos do objeto com a resposta
      while (resposta.next()){
          produto.setIdProduto(resposta.getInt("idProduto"));
          produto.setSituacao(resposta.getString("situacao")); 
                    
          retorno = true;
      }
      stmt.close();
      conexao.close();
      }catch(SQLException e){
        System.out.println("Erro na consulta do Produto");
      }
      finally{
          return retorno;
      }
  }
    
}
