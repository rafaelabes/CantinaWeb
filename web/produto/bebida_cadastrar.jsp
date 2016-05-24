<%-- 
    Document   : cadastrarProduto
    Created on : 12/03/2016, 23:32:52
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
                            <div class="panel-heading">Cadastrar Bebida</div>
                            <div class="panel-body">                        

                                <div>
                                    <br>
                                    <label for="nome">Código</label>
                                    <input type="text" name="codigo" class="form-control" placeholder="000000000" required>
                                    <label for="nome">Nome</label>
                                    <input type="text" name="nome" class="form-control" placeholder="Digite o seu nome" required>
                                    <label for="nome">Fornecedor</label>
                                    <input type="text"  name="fornecedor" class="form-control" placeholder="Digite o nome do fornecedor" required>
                                    <label for="nome">Preço</label>
                                    <input type="text" name="preco" class="form-control" placeholder="00,00" required>
                                    <label for="nome">Quantidade</label>
                                    <input type="text" name="quantidade" class="form-control" placeholder="0" required>
                                    <br>
                                    <button type="submit" class="btn btn-success">Salvar</button>
                                    <a class="btn btn-primary" href="../produto/produto_cadastrar.jsp" role="button">Voltar</a>

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

