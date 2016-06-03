<%-- 
    Document   : consultarFuncionario
    Created on : 12/03/2016, 23:28:33
    Author     : Rafaela Batista
--%>
<%@page import="controller.Funcionario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.Aluno"%>
<%@page import="controller.Responsavel"%>
<%Funcionario funcionario = (Funcionario) request.getAttribute("funcionario");%>


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
                            <div class="panel-heading">Consultar Funcionário</div>
                            <div class="panel-body">
                                <div class="form-group">
                                <label for="matricula">Matrícula</label>
                                <input type="text" name="matricula" class="form-control" placeholder="0000000" required>
                                </div>
                                <div class="form-group">
                                <label for="nome">Nome</label>
                                <input type="text" name="nome" class="form-control" placeholder="Joao" required>
                                </div>
                                <br>
                                <button type="button" class="btn btn-primary">Consultar</button>                 
                                <button type="button" class="btn btn-warning">Editar</button>
                                <button type="button" class="btn btn-danger">Excluir</button>
                                <br>
                                <table class="table table-bordered">
                                    <br>
                                    <th>Matrícula</th>
                                    <th>Nome</th>
                                    <th>Escola</th>
                                    <tr>
                                        <td>0001</td>
                                        <td>Rafaela Batista</td>
                                        <td>UNEB</td>
                                    </tr>
                                    <tr>
                                        <td>0002</td>
                                        <td>Uoston</td>
                                        <td>UNEB</td>
                                    </tr>
                                    <tr>
                                        <td>0003</td>
                                        <td>Iago</td>
                                        <td>UNEB</td>
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


