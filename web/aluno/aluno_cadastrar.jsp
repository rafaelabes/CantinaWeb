<%-- 
    Document   : responsavel_cadastrar
    Created on : 18/03/2016, 01:37:02
    Author     : Rafaela Batista
--%>
<%@page import="controller.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% Usuario usuarioAluno = (Usuario) request.getAttribute("usuarioAluno");%>
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
                            <div class="panel-heading">Cadastrar Aluno</div>
                            <div class="panel-body">
                                <form name="Cadastro" action="ControlerAluno" method="post">
                                    <div class="form-group">
                                        <label for="nome">Nome</label>
                                        <input type="text" class="form-control" name="nome" placeholder="Digite seu nome" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="nome">Turma</label>
                                        <input type="text" class="form-control" name="turma" placeholder="Digite sua turma" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="turma">Turno</label>
                                        <input type="text" class="form-control" name="turno" placeholder="Digite seu turno" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="turno">Saldo</label>
                                        <input type="text" class="form-control" name="saldo" placeholder="saldo" required>
                                        <!--Campos hidden não aparecem para o usuario digitar são setados-->
                                        <% if (usuarioAluno != null) { %>
                                        <input type="hidden" class="form-control" name="idUsuario" value="<%=usuarioAluno.getIdUsuario()%>">
                                        <% } else { %>
                                        <input type="hidden" class="form-control" name="idUsuario">
                                        <% } %>
                                    </div>
                                    <div class="form-group"> 
                                        <div class="col-sm-offset-4 col-md-4">
                                            <button type="submit" name="opcao" value="inserir">Continue</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>   
                    <!-- Conteudo -->
                    </div>
                </div>
                <div class="col-md-2"></div>
            </div>
            <div class="row"></div>
        </div>
    </body>
</html>