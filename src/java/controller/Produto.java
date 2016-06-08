/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ProdutoDAO;

/**
 *
 * @author uoston
 */
public class Produto {
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
    public boolean consultarMax(){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        if(produtoDAO.consultarMax(this))
            return true;
        return false;
    }
    public boolean cadastrar() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.cadastrar(this);  
    }
}
