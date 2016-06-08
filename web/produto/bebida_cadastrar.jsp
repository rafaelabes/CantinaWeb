<%-- 
    Document   : cadastrarProduto
    Created on : 12/03/2016, 23:32:52
    Author     : Rafaela Batista
--%>

<%@page import="controller.Bebida"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Bebida bebida = (Bebida) request.getAttribute("bebida");%>
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
                            <div class="panel-heading">Cadastrar Bebida</div>
                            <div class="panel-body">                        
                                <form name="Cadastro" action="ControlerFuncionario?opcao=inserirBebida" method="post">
                                    <div class="form-group">
                                        <input type="hidden" class="form-control" name="idProduto" value="<%=bebida.getIdProduto()%>">
                                    </div>
                                    <div class="form-group">
                                        <label for="nome">Nome</label>
                                        <input type="text" name="nome" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="fornecedor">Fornecedor</label>
                                        <input type="text"  name="fornecedor" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="valor">Valor</label>
                                        <input type="text" name="valor" class="form-control" required>
                                    </div>
                                    <div class="form-group">  
                                        <label for="quantidade">Quantidade</label>
                                        <input type="number" name="quantidade" class="form-control" required>
                                    </div>
                                    <div class="form-group">  
                                        <button type="submit" class="btn btn-success">Salvar</button>
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

