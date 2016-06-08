/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Bebida;

/**
 *
 * @author uoston
 */
public class BebidaDAO {
    public boolean cadastrar(Bebida bebida) {
        String sql = "insert into lp3.bebida"
                + "(idProduto,nome,fornecedor,valor,quantidade) "
                + "values('" + bebida.getIdProduto()+ "','" + bebida.getNome() + "','" + bebida.getFornecedor()
                + "','" + bebida.getValor()+ "','" + bebida.getQuantidade()+"')";
        
        FabricaConexao fabrica = new FabricaConexao();
        return fabrica.executar(sql);
    }
    
}
