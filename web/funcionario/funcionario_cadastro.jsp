<%-- 
    Document   : cadastrarFuncionario
    Created on : 12/03/2016, 22:39:18
    Author     : Rafaela Batista
--%>

<%@page import="controller.Funcionario"%>
<%@page import="controller.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%Funcionario funcionario = (Funcionario) request.getAttribute("funcionario");%>
<html>
    <jsp:include page="../estrutura/header_info.jspf"/> 
    <body>
        <div class="container-fluid">  
            <jsp:include page="../estrutura/nav_funcionario.jsp"/> 
            <div class="row" ></div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <jsp:include page="../estrutura/tab_funcionario.jspf"/>
                    <!-- Conteudo -->
                    <div class="panel panel-success">
                        <div class="panel panel-success">
                            <div class="panel-heading">Cadastrar Funcionário</div>
                            <div class="panel-body">
                                <form name="Cadastro" action="ControlerFuncionario" method="post">
                                    <div class="form-group">
                                    <label for="nome">Nome</label>
                                    <input type="text" name="nome" class="form-control" placeholder="Nome..." required>
                                    </div>
                                    <div class="form-group">
                                    <label for="escola">Escola</label>
                                    <input type="text" name="escola" class="form-control" placeholder="Nome da Escola..." required>
                                    </div>
                                    <div class="form-group">
                                    <label for="cpf">CPF</label>
                                    <input type="text" name="cpf" class="form-control" placeholder="Cpf..." required>
                                    </div>
                                    <div class="form-group">
                                    <label for="email">Email</label>
                                    <input type="text" name="email" class="form-control" placeholder="Email..." required>
                                    <div class="form-group">
                                        <!--Campos hidden não aparecem para o usuario digitar são setados-->
                                        <% if (funcionario != null) { %>
                                        <input type="hidden" class="form-control" name="idUsuario" value="<%=funcionario.getIdUsuario()%>">
                                        <% } else { %>
                                        <input type="hidden" class="form-control" name="idUsuario">
                                        <% } %>
                                    </div>
                                    <div class="form-group"> 
                                        <div class="col-sm-offset-4 col-md-4">
                                            <button type="submit" class="btn btn-primary" name="opcao" value="inserir">Salvar</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
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

