/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ResponsavelDAO;

/**
 *
 * @author Rafaela
 */
public class Responsavel{

    private String nome,cpf, telefone, email;
    private int idResponsavel,idUsuario;

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
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
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void consultar(Usuario usuario){
        this.setIdUsuario(usuario.getIdUsuario());
        ResponsavelDAO responsavelDAO = new ResponsavelDAO();
        responsavelDAO.consultar(this);
    }
    private void cadastrar() {

    }

    private void editar() {

    }

    private void bloquear() {

    }

    private void excluir() {

    }

}
