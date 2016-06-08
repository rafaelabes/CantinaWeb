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
    
    private String  email, nome;
    private int cpf,idFuncionario,idUsuario,responsavelEscola;

    public Funcionario(){
        
    }
    public void ConsultarListaFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setIdFuncionario(this.getIdFuncionario());
// 
           FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    }

    public int getResponsavelEscola() {
        return responsavelEscola;
    }

    public void setResponsavelEscola(int responsavelEscola) {
        this.responsavelEscola = responsavelEscola;
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


    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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
        if(funcionarioDAO.consultar(this))
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


}
