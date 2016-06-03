<%-- 
    Document   : alterarFuncionario
    Created on : 17/03/2016, 22:22:13
    Author     : Rafaela Batista
--%>
<%@page import="controller.Funcionario"%>
<%Funcionario funcionario = (Funcionario) request.getAttribute("funcionario");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="../estrutura/header.jspf"/> 
    <body>
        <div class="container-fluid">  
            <jsp:include page="../estrutura/nav_funcionario.jsp"/> 
            <div class="row" ></div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <jsp:include page="../estrutura/tab_funcionario.jspf"/>
                    <!-- Conteudo -->
                    <div class="panel panel-success"
                         <div class="panel panel-success">
                            <div class="panel-heading">Editar Funcionário</div>
                            <div class="panel-body">
                                <div class="form-group">
                                <label for="nome">Nome</label>
                                    <input type="text" name="nome" class="form-control" placeholder="Joao" required>
                                    </div>
                                <div class="form-group">
                                    <label for="escola">Escola</label>
                                    <input type="text" name="escola" class="form-control" placeholder="Pedacinho do céu" required >
                                </div>
                                <div class="form-group">'
                                    <label for="matricula">Matrícula</label>
                                    <input type="text" name="matricula" class="form-control" placeholder="0000000" required>
                                </div>
                                <div class="form-group">
                                    <label for="login">Login</label>
                                    <input type="text" name="login" class="form-control" placeholder="Joaoteste" required>
                                </div>
                                <div class="form-group">
                                    <label for="senha">Senha</label>
                                    <input type="text" name="senha" class="form-control" placeholder="************" required>
                                </div>
                                    <br>
                                    
                                <button type="button" class="btn btn-success">Salvar</button>
                                <button type="button" class="btn btn-primary">Cancelar</button>




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

