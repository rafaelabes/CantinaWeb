/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Comida;

/**
 *
 * @author uoston
 */
public class ComidaDAO {
    public boolean cadastrar(Comida comida) {
        String sql = "insert into lp3.comida"
                + "(idProduto,nome,idIngrediente,valor,quantidade) "
                + "values('" + comida.getIdProduto()+ "','" + comida.getNome() + "','" + comida.getIdIngrediente()
                + "','" + comida.getValor()+ "','" + comida.getQuantidade()+"')";

        FabricaConexao fabrica = new FabricaConexao();
        return fabrica.executar(sql);
    }
}
