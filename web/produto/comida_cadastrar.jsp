<%-- 
    Document   : cadastrarProduto
    Created on : 12/03/2016, 23:32:52
    Author     : Rafaela Batista
--%>

<%@page import="controller.Comida"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Comida comida = (Comida) request.getAttribute("comida");%>
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
                            <div class="panel-heading">Cadastrar Comida</div>
                            <div class="panel-body">                        
                                <form name="Cadastro" action="ControlerFuncionario?opcao=inserirComida" method="post">
                                     <div class="form-group">
                                         <input type="hidden" name="idProduto" class="form-control" value="<%=comida.getIdProduto()%>">
                                     </div>
                                     <div class="form-group">
                                        <label for="nome">Nome</label>
                                        <input type="text" name="nome" class="form-control"  required>                                    
                                     </div>
                                     <div class="form-group">
                                        <label for="valor">Valor</label>
                                        <input type="text" name="valor" class="form-control" required>
                                     </div>
                                     <div class="form-group">
                                        <label for="idIngrediente">Ingredientes</label>
                                        <select class="form-control" name="idIngrediente">
                                            <option value="1">Leite</option>
                                            <option value="2">Sal</option>
                                            <option value="3">Açúcar</option>
                                            <option value="4">Chocolate</option>
                                        </select>
                                     </div>
                                     <div class="form-group">
                                        <label for="quantidade">Quantidade</label>
                                        <input type="text" name="quantidade" class="form-control" required>
                                     </div>>
                                    <div class="form-group">  
                                        <button type="submit" class="btn btn-success">Salvar</button>
                                    </div>
                                </form>       
                            </div>                           
                           <!-- Conteudo -->     
                          </div>
                     </div>
                </div>
                <div class="col-md-2"></div>
            </div>
            <div class="row"></div>
        </div>
    </body>
</html>

