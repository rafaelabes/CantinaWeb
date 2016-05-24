<%-- 
    Document   : index_funcionario
    Created on : 21/03/2016, 20:51:28
    Author     : uoston
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <div class="tab-content">
                        <div role="tabpanel painelgeral" class="tab-pane active" id="Cadastrar">     
                            <div class="panel panel-default">
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-sm-6 col-md-6">
                                            <div class="thumbnail">
                                                <img src="../img/Escola.jpg" alt="psg">
                                                <div class="caption">
                                                    <h2>Escola</h2>
                                                    <p>A cinco anos no mercado a school food. è um sistema que proporciona um controle integral da vida alimentar de seus filhos. </p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 col-md-6">
                                            <div class="thumbnail">
                                                <img src="../img/livro.jpg" alt="psg">
                                                <div class="caption">
                                                    <h2>Eventos</h2>
                                                    <p>A cinco anos no mercado a school food. è um sistema que proporciona um controle integral da vida alimentar de seus filhos. </p>

                                                    <p>.</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
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

