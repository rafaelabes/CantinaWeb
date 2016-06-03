/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.FuncionarioDAO;

/**
 *
 * @author Rafaela
 */
public class Funcionario{
    
    private String cpf, email, nome, escola,situacao;
    private int idFuncionario,idUsuario;
    private ArrayList< Funcionario > listaFuncionario = new ArrayList< Funcionario >();

    public Funcionario(){
        
    }
    public void ConsultarListaFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setIdFuncionario(this.getIdFuncionario());
//        
           FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
           this.setListaFuncionario(funcionarioDAO.consultarLista(funcionario,null));
    }
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
     
    

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
    
    public boolean consultar(){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        String condicao = " and situacao = 'Desbloqueado'";
        if(funcionarioDAO.consultar(this,condicao))
            return true;
        return false;
    }
    public boolean cadastrar() {
        FuncionarioDAO funcionario = new FuncionarioDAO();
        return funcionario.cadastrar(this);  
    }
    
    

    public void editar() {
        FuncionarioDAO funcionario = new FuncionarioDAO();
        funcionario.editar(this);  
    }

    private void setListaFuncionario(ArrayList<Funcionario> consultarLista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
