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
                            <div class="panel-heading">Consultar Produto</div>
                            <div class="panel-body">
                                <label for="codigo">Tipo</label>
                                <select class="form-control" name="tipoProduto">
                                    <option value="1">Comida</option>
                                    <option value="2">Bebida</option>
                                </select>
                                <label for="codigo">Código</label>
                                <input type="text" name="codigo" class="form-control" placeholder="00000">
                                <br>
                                <button type="button" class="btn btn-primary">Consultar</button>                 
                                <button type="button" class="btn btn-warning">Editar</button>
                                <button type="button" class="btn btn-danger">Excluir</button>


                                <br>
                                <table class="table table-bordered">
                                    <br>
                                    <th>Código</th>
                                    <th>Nome</th>
                                    <th>Preço</th>

                                    <tr>
                                        <td>0001</td>
                                        <td>Salada de Frutas</td>
                                        <td>6,00</td>
                                    </tr>
                                    <tr>
                                        <td>0002</td>
                                        <td>Sanduiche Natural</td>
                                        <td>6,00</td>
                                    </tr>
                                    <tr>
                                        <td>0003</td>
                                        <td>Açai na tigela</td>
                                        <td>8,00</td>
                                    </tr>


                                </table>


                                <!-- Conteudo -->                    
                            </div>
                            <div class="col-md-2"></div>
                        </div>
                        <div class="row"></div>
                    </div>
                    </body>
                    </html>

