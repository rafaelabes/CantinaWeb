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
                                    <div class="form-group">
                                    <label for="nome">Nome</label>
                                    <input type="text" name="nome" class="form-control" placeholder="Joao" required>
                                    </div>
                                    <div class="form-group">
                                    <label for="nome">Escola</label>
                                    <input type="text" name="escola" class="form-control" placeholder="Pedacinho do céu" required>
                                    </div>
                                    <div class="form-group">
                                    <label for="nome">Matrícula</label>
                                    <input type="text" name="matricula" class="form-control" placeholder="0000000" required>
                                    </div>
                                    <div class="form-group">
                                    <label for="nome">Login</label>
                                    <input type="text" name="login" class="form-control" placeholder="Joaoteste" required>
                                    </div>
                                    <div class="form-group">
                                    <label for="nome">Senha</label>
                                    <input type="text" name="senha" class="form-control" placeholder="************">
                                    </div>
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

