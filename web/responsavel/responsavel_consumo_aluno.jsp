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
            <jsp:include page="../estrutura/nav_funcionario.jsp"/> 
            <div class="row" ></div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <jsp:include page="../estrutura/tab_funcionario.jspf"/>
                    <!-- Conteudo -->

                    <div class="panel panel-success">
                        <div class="panel-heading">Histório de Consumo do Aluno</div>
                        <div class="panel-body">
                            <form>
                                <div>
                                    <label for="matricula">Matrícula</label>
                                    <input type="text" name="matricula" class="form-control" placeholder="000000" required>

                                </div>
                                <div>
                                    <label for="data">Período</label>
                                    <input type="date" class="form-control" placeholder="início">
                                    <input type="date" class="form-control" placeholder="fim">

                                </div>
                                <a href="../index.jsp" class="btn btn-primary active" role="button">Consultar</a>

                                <br>
                                <table class="table table-bordered">
                                    <br>

                                    <th>Data</th>
                                    <th>Produto</th>

                                    <tr>
                                        <td>07/01/2016</td>
                                        <td>Salada de Frutas</td>

                                    </tr>
                                    <tr>
                                        <td>08/01/2016</td>
                                        <td>Sanduiche Natural</td>

                                    </tr>
                                    <tr>
                                        <td>09/01/2016</td>
                                        <td>Açai na tigela</td>

                                    </tr>


                                </table>



                                <a href="../index.jsp" class="btn btn-success active" role="button">Voltar</a>
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