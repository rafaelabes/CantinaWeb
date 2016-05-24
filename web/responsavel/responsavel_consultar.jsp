<%-- 
    Document   : responsavel_cadastrar
    Created on : 18/03/2016, 01:37:02
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

                    <div class="panel panel-success">
                        <div class="panel-heading">Consultar Responsável</div>
                        <div class="panel-body">
                            <form>
                                <div class="form-group">
                                    <label for="nome">CPF</label>
                                    <input type="text" class="form-control" id="" placeholder="Nome">
                                </div>
                                <div class="form-group">
                                    <label for="nome">Nome</label>
                                    <input type="text" class="form-control" id="" placeholder="Nome">
                                </div>
                                <div class="form-group">
                                    <label for="nome">Telefone</label>
                                    <input type="text" class="form-control" id="" placeholder="Nome">
                                </div>
                                <div class="form-group">
                                    <label for="nome">Email</label>
                                    <input type="text" class="form-control" id="" placeholder="Nome">
                                </div>
                                <div class="form-group">
                                    <label for="nome">Login</label>
                                    <input type="text" class="form-control" id="" placeholder="Nome">
                                </div>
                                <div class="form-group">
                                    <label for="nome">Senha</label>
                                    <input type="text" class="form-control" id="" placeholder="Nome">
                                </div>


                                <a href="../index/index.jsp" class="btn btn-success active" role="button">Voltar</a>
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