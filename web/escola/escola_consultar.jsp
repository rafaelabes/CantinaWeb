<%-- 
    Document   : consultarFuncionario
    Created on : 12/03/2016, 23:28:33
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
                            <div class="panel-heading">Consultar Escola</div>
                            <div class="panel-body">
                                <div class="form-group">
                                <label for="nome">Nome</label>
                                <input type="text" name="nome" class="form-control" placeholder="Digite o nome da escola" required>
                                </div>
                                
                                <br>
                                <button type="button" class="btn btn-primary">Consultar</button>                 
                                <button type="button" class="btn btn-warning">Editar</button>
                                <button type="button" class="btn btn-danger">Excluir</button>
                                <br>
                                <table class="table table-bordered">
                                    <br>
                                    <th>Endereco</th>
                                    <th>Email</th>
                                    <th>Telefone</th>
                                    <tr>
                                        <td>aV 01</td>
                                        <td>escola1@gmail.com</td>
                                        <td>00000-0000</td>
                                    </tr>
                                    <tr>
                                        <td>aV 02</td>
                                        <td>escola2@gmail.com</td>
                                        <td>00000-0000</td>
                                    </tr>
                                    <tr>
                                        <td>aV 03</td>
                                        <td>escola3@gmail.com</td>
                                        <td>00000-0000</td>
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


