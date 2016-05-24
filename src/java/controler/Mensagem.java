/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author uoston
 */
public class Mensagem {
    private String erro,tipo;
    private String mensagemRetorno;
    
    
    public Mensagem(String erro, String tipo){
        this.setErro(erro);
        this.setTipo(tipo);
        this.setMensagemRetorno("<div  class = \"alerta "+this.getTipo() +"\"  role = \"alert\" > "+this.getErro()+"</ div>" );
    }

    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //tipo são: -sucesso | -info | -perigo
    public String getMensagemRetorno() {
        return mensagemRetorno;
    }

    private void setMensagemRetorno(String mensagemRetorno) {
        this.mensagemRetorno = mensagemRetorno;
    }

    private String getErro() {
        return erro;
    }

    private void setErro(String erro) {
        this.erro = erro;
    }
}
