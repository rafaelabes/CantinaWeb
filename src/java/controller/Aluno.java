/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.AlunoDAO;

/**
 *
 * @author Rafaela
 */
public class Aluno{

    private String nome,turno, turma, saldo, consumo;
    private int matricula,idResponsavel,idUsuario;
    public Aluno(){
    };
    public Aluno(int matricula, String turma , String turno, String saldo, String consumo) {
        this.matricula = matricula;
        this.turno = turma;
        this.turma = turno;
        this.saldo = saldo;
        this.consumo = consumo;
    }

    public Aluno(String matricula, String turma, String turno, String saldo, String consumo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }
    public void consultar(Usuario usuario){
        this.setIdUsuario(usuario.getIdUsuario());
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.consultar(this);
 
    }
    public boolean cadastrar() {
        AlunoDAO aluno = new AlunoDAO();
        return aluno.cadastrar(this);  
    }

    public void editar() {

    }

    public void bloquear() {

    }

    public void excluir() {

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
