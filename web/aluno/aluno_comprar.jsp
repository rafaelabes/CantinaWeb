<%-- 
    Document   : cadastrarProduto
    Created on : 12/03/2016, 23:32:52
    Author     : Rafaela Batista
--%>
<%@page import="controller.Aluno"%>
<%Aluno aluno = (Aluno) request.getAttribute("aluno");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="../estrutura/header.jspf"/> 
    <body>
        <div class="container-fluid">  
            <jsp:include page="../estrutura/nav.jspf"/> 
            <div class="row" ></div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <jsp:include page="../estrutura/tab.jspf"/>
                    <!-- Conteudo -->
                    <div class="panel panel-success">
                         <div class="panel panel-success">
                            <div class="panel-heading">Comprar Produto</div>

                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-sm-2">
                                        <div class="form-group">
                                        <label for="saldo">Saldo</label>
                                        <input type="text" class="form-control" name="saldo" value= "<%= aluno.getSaldo() %>" disabled>
                                    </div>
                                        </div>

                                </div>
                                <br>
                                <%-----------------------------Row1---------------------------------------------------%>
                                <div class="row">
                                    <div class="col-sm-6 col-md-4">
                                        <div class="thumbnail">
                                            <img src="../img/hamburguer.jpg" alt="psg">
                                            <div class="caption">
                                                <h3>Hamburguer</h3>
                                                <p></p>
                                                <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="col-sm-6 col-md-4">
                                        <div class="thumbnail">
                                            <img src="../img/hotdog.jpg" alt="psg">
                                            <div class="caption">
                                                <h3>Cachorro Quente</h3>
                                                <p></p>
                                                <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-6 col-md-4">
                                        <div class="thumbnail">
                                            <img src="../img/mistoQuente.jpg" alt="psg">
                                            <div class="caption">
                                                <h3>Misto</h3>
                                                <p></p>
                                                <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%-----------------------------Row1---------------------------------------------------%>
                                <%-----------------------------Row2---------------------------------------------------%>
                                <div class="row">
                                    <div class="col-sm-6 col-md-4">
                                        <div class="thumbnail">
                                            <img src="../img/saladaFruta.jpg" alt="psg">
                                            <div class="caption">
                                                <h3>Salada de Fruta</h3>
                                                <p></p>
                                                <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="col-sm-6 col-md-4">
                                        <div class="thumbnail">
                                            <img src="../img/sucoLaranja.jpg" alt="psg">
                                            <div class="caption">
                                                <h3>Suco de Laranja</h3>
                                                <p></p>
                                                <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-6 col-md-4">
                                        <div class="thumbnail">
                                            <img src="../img/saladaFruta.jpg" alt="psg">
                                            <div class="caption">
                                                <h3>Salada de Fruta</h3>
                                                <p></p>
                                                <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%-----------------------------Row2---------------------------------------------------%>
                                <%-----------------------------Row3---------------------------------------------------%>
                                <div class="row">
                                    <div class="col-sm-6 col-md-4">
                                        <div class="thumbnail">
                                            <img src="../img/kikkat.jpg" alt="psg">
                                            <div class="caption">
                                                <h3>KitKat</h3>
                                                <p></p>
                                                <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="col-sm-6 col-md-4">
                                        <div class="thumbnail">
                                            <img src="../img/mms.jpg" alt="psg">
                                            <div class="caption">
                                                <h3>MMs</h3>
                                                <p></p>
                                                <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-6 col-md-4">
                                        <div class="thumbnail">
                                            <img src="../img/kikkat.jpg" alt="psg">
                                            <div class="caption">
                                                <h3>KitKat</h3>
                                                <p></p>
                                                <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%-----------------------------Row3---------------------------------------------------%>



                                <!-- Conteudo -->                    
                            </div>
                            <div class="col-md-2"></div>
                        </div>
                        <div class="row"></div>
                    </div>
                    </body>
                    </html>

