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
                            <div class="panel-heading">Cadastrar Produto</div>
                            <div class="panel-body"> 
                                <a class="btn btn-primary" href="../produto/comida_cadastrar.jsp" role="button">Comida</a>
                                <a class="btn btn-primary" href="../produto/bebida_cadastrar.jsp" role="button">Bebida</a>


                            </div>

                            <!-- Conteudo -->                    
                        </div>
                        <div class="col-md-2"></div>
                    </div>
                    <div class="row"></div>
                </div>
                </body>
                </html>

