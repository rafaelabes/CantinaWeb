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
                        <div class="panel-heading">Consultar Alunos</div>
                        <div class="panel-body">
                            <form id="consultarAlunos">
                                <div class="form-group">
                                    <label for="nome">Matricula</label>
                                    <input type="text" name="matricula" class="form-control"  placeholder="0000">
                                </div>
                                <div class="form-group">
                                    <label for="nome">Nome</label>
                                    <input type="text" name="nome" class="form-control" placeholder="Digite seu nome">
                                </div>

                                <button type="submit" class="btn btn-primary">Consultar</button>
                                <a class="btn btn-warning" href="../aluno/aluno_editar.jsp" role="button">Editar</a>
                                <a class="btn btn-danger" href="../aluno/aluno_excluir.jsp" role="button">Excluir</a>



                                <br>
                                <table class="table table-bordered">
                                    <br>
                                    <th>Matrícula</th>
                                    <th>Nome</th>
                                    <th>Saldo</th>
                                    <th>Turma</th>
                                    <th>Responsável</th>

                                    <tr>
                                        <td>0001</td>
                                        <td>João</td>
                                        <td>100.00</td>
                                        <td>A</td>
                                        <td>Maria</td>
                                    </tr>
                                    <tr>
                                        <td>0002</td>
                                        <td>José</td>
                                        <td>100.00</td>
                                        <td>A</td>
                                        <td>Maria</td>
                                    </tr>
                                    <tr>
                                        <td>0003</td>
                                        <td>Ana</td>
                                        <td>100.00</td>
                                        <td>A</td>
                                        <td>Maria</td>

                                    </tr>


                                </table>



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