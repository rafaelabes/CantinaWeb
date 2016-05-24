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
                            <div class="panel-heading">Editar Comida</div>
                            <div class="panel-body">                        
                                <div>
                                    <label for="nome">Código</label>
                                    <input type="text" class="form-control" placeholder="" required>
                                    <label for="nome">Nome</label>
                                    <input type="text" class="form-control" placeholder="" required>
                                    <label for="nome">Preço</label>
                                    <input type="text" class="form-control" placeholder="" required>
                                    <label for="nome">Ingredientes</label>
                                    <select class="form-control" name="ingredientes">
                                        <option value="">Leite</option>
                                        <option value="s">Sal</option>
                                        <option value="m">Açúcar</option>
                                        <option value="l">Chocolate</option>
                                        <option value="xl">Item</option>
                                    </select>
                                    <label for="nome">Quantidade</label>
                                    <input type="text" class="form-control" placeholder="" required>
                                    <br>
                                    <button type="submit" class="btn btn-success">Salvar</button>
                                    <a class="btn btn-primary" href="../produto/produto_editar.jsp" role="button">Voltar</a>

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

