/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.AlunoDAO;

/**
 *
 * @author Rafaela
 */
public class Aluno{

    private String nome,turno, turma,  consumo,situacao;
    private int matricula,idResponsavel,idUsuario;
    private double saldo;
    public Aluno(){
    };
    public Aluno(int matricula, String turma , String turno, int saldo, String consumo) {
        this.matricula = matricula;
        this.turno = turma;
        this.turma = turno;
        this.saldo = saldo;
        this.consumo = consumo;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }
    public boolean consultar(String condicao){
        AlunoDAO alunoDAO = new AlunoDAO();
        if(alunoDAO.consultar(this,condicao))
            return true;
        return false;
    }
    public boolean cadastrar() {
        AlunoDAO aluno = new AlunoDAO();
        return aluno.cadastrar(this);  
    }
//    public List<Aluno> consultarLista(){
//        AlunoDAO alunoDAO = new AlunoDAO();
//        return alunoDAO.consultarLista(this,null);
//    }
    public void editar() {
        AlunoDAO aluno = new AlunoDAO();
        aluno.editar(this);  
    }
    public void inserirSaldo(Double saldo) throws SQLException {
        AlunoDAO aluno = new AlunoDAO();
        aluno.inserirSaldo(this,saldo); 
        aluno.editar(this);
    }
    public void bloquear() {

    }

    public void excluir() {
        AlunoDAO aluno = new AlunoDAO();
        aluno.excluir(this); 
    }

    /* public int alterar(){
      
      AlunoDAO liv=new AlunoDAO();
      int resposta = liv.alterar(this);
      return resposta;
  }

      public int excluir(){
      
      AlunoDAO aluno=new AlunoDAO();
      int resposta = aluno.excluir(this);
      return resposta;
  }
      public List<Aluno> consultar(){
      
      AlunoDAO aluno=new AlunoDAO();
      List<Aluno> retornoAluno = aluno.consultar(this);
      return retornoAluno;
  }
     */
}
