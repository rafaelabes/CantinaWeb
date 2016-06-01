<%-- 
    Document   : responsavel_cadastrar
    Created on : 18/03/2016, 01:37:02
    Author     : Rafaela Batista
--%>
<%@page import="controller.Aluno"%>
<%Aluno aluno = (Aluno) request.getAttribute("aluno");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="../estrutura/header_info.jspf"/> 
    <body>
        <div class="container-fluid">  
            <jsp:include page="../estrutura/nav_responsavel.jsp"/> 
            <div class="row" ></div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <jsp:include page="../estrutura/tab_responsavel.jspf"/>
                    <!-- Conteudo -->

                    <div class="panel panel-success">
                        <div class="panel-heading">Editar Aluno</div>
                        <div class="panel-body">
                            <form class="form" id="editarAluno" action="ControlerAluno?opcao=editarAluno" method="post">
                                 <div class="form-group">
                                    <input type="hidden" class="form-control" name="matriculaEditar" value="<%=aluno.getMatricula()%>">
                                </div>
                                <div class="form-group">
                                    <label for="nome">Nome</label>
                                    <input type="text" class="form-control" name="nomeEditar" value="<%=aluno.getNome()%>">
                                </div>
                                <div class="form-group">
                                    <label for="turma">Turma</label>
                                    <input type="text" class="form-control" name="turmaEditar"  value="<%=aluno.getTurma()%>">
                                </div>
                                <div class="form-group">
                                    <label for="turno">Turno</label>
                                    <select class="form-control" name="turnoEditar">
                                        <% if (aluno.getTurno().equals("Matutino")) { %>
                                            <option value="Matutino" selected>Matutino</option>
                                            <option value="Vespertino" >Vespertino</option>
                                            <option value="Noturno" >Noturno</option>
                                        <% } else if (aluno.getTurno().equals("Vespertino")) { %>
                                            <option value="Matutino" >Matutino</option>
                                            <option value="Vespertino" selected>Vespertino</option>
                                            <option value="Noturno" >Noturno</option>
                                        <% } else { %>
                                            <option value="Matutino" >Matutino</option>
                                            <option value="Vespertino" >Vespertino</option>7
                                            <option value="Noturno" selected>Noturno</option>
                                        <% } %>
                                    </select>
                                </div>   
                                <div class="form-group">
                                    <label for="turno">Situação</label>
                                    <select class="form-control" name="situacao">
                                        <% if (aluno.getSituacao().equals("Desbloqueado")) { %>
                                            <option value="Desbloqueado" selected>Desbloqueado</option>
                                            <option value="Bloqueado" >Bloqueado</option>
                                          <% } else { %>
                                            <option value="Desbloqueado" >Desbloqueado</option>
                                            <option value="Bloqueado" selected>Bloqueado</option>
                                          <% } %>
                                    </select>
                                </div>
                                <button type="submit" class="btn btn-primary">Salvar</button>
                                <a href="ControlerAluno?opcao=consultar" class="btn btn-success active" role="button">Voltar</a>
                            </form>
                        </div>
                    </div>   
                    <!-- Conteudo -->                    
                </div>
                <div class="col-md-2"></div>
            </div>
            <div class="row"></div>
        </div>
    </body>
</html>