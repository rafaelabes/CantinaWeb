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
            <jsp:include page="../estrutura/nav_responsavel.jsp"/> 
            <div class="row" ></div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <jsp:include page="../estrutura/tab_responsavel.jspf"/>
                    <!-- Conteudo -->

                    <div class="panel panel-success">
                        <div class="panel-heading">Bloquear Produtos</div>
                        <div class="panel-body">
                            <form>

                                <div>
                                    <label for="codigo">Aluno</label>
                                    <select class="form-control" name="tipoProduto">
                                        <option value="1">João</option>
                                        <option value="2">José</option>
                                        <option value="3">Ana</option>
                                        <option value="4">Maria</option>

                                    </select>

                                </div>
                                <div>
                                    <label for="codigo">Produtos</label>
                                    <select class="form-control" name="tipoProduto">
                                        <option value="1">Refrigerante</option>
                                        <option value="2">Salgadinhos</option>
                                        <option value="3">Doces</option>
                                        <option value="4">Leite</option>

                                    </select>

                                </div>
                                <div>
                                    <br>
                                    <button type="button" class="btn btn-danger">Bloquear</button>
                                    <button type="button" class="btn btn-success">Desbloquear</button>
                                </div>
                                <div>

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
                                </div>



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