<%-- 
    Document   : cadastrarFuncionario
    Created on : 12/03/2016, 22:39:18
    Author     : Rafaela Batista
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                                <form name="Cadastro" action="../ServletAluno" method="post">
                                    <label for="nome">Nome</label>
                                    <input type="text" class="form-control" placeholder="">
                                    <label for="nome">Escola</label>
                                    <input type="text" class="form-control" placeholder="">
                                    <label for="nome">Matrícula</label>
                                    <input type="text" class="form-control" placeholder="">
                                    <label for="nome">Login</label>
                                    <input type="text" class="form-control" placeholder="">
                                    <label for="nome">Senha</label>
                                    <input type="text" class="form-control" placeholder="">
                                    <br>
                                    <button type="submit" class="btn btn-primary">Salvar</button>
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

