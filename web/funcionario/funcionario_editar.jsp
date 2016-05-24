<%-- 
    Document   : alterarFuncionario
    Created on : 17/03/2016, 22:22:13
    Author     : Rafaela Batista
--%>

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
                                <label for="nome">Nome</label>
                                    <input type="text" name="nome" class="form-control" placeholder="Joao">
                                    <label for="nome">Escola</label>
                                    <input type="text" name="escola" class="form-control" placeholder="Pedacinho do céu">
                                    <label for="nome">Matrícula</label>
                                    <input type="text" name="matricula" class="form-control" placeholder="0000000">
                                    <label for="nome">Login</label>
                                    <input type="text" name="login" class="form-control" placeholder="Joaoteste">
                                    <label for="nome">Senha</label>
                                    <input type="text" name="senha" class="form-control" placeholder="************">
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

