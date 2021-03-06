<%-- 
    Document   : index_funcionario
    Created on : 21/03/2016, 20:51:28
    Author     : uoston
--%>
<%@page import="controller.Comida"%>
<%@page import="java.util.Iterator"%>
<%@page import="controller.Bebida"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.Aluno"%>
<% Aluno aluno = (Aluno) request.getAttribute("aluno");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <jsp:include page="../estrutura/header_info.jspf"/> 
    <body>
        <div class="container-fluid">  
            <jsp:include page="../estrutura/nav_aluno.jsp"/> 
            <div class="row" ></div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <!-- Conteudo -->
                    <div class="panel panel-success">
                        <div class="panel-heading">Comprar Produto</div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-sm-2">
                                    <label for="nome">Saldo</label>
                                    <input type="text" class="form-control" disabled value="<%= aluno.getSaldo()%>">
                                </div>

                            </div>
                            <div class="row">
                            <%-----------------------------Row1---------------------------------------------------%>
                            <%
                                 ArrayList<Bebida> bebidas = aluno.getbebidas();
                                 Iterator<Bebida> iterator = bebidas.iterator();

                                 while (iterator.hasNext()) {
                                      Bebida bebida = (Bebida)iterator.next();
                             %>
                                <div class="col-sm-6 col-md-4">
                                    <div class="thumbnail">
                                        <img src="img/<%= bebida.getNome()%>.jpg" alt="psg">
                                        <div class="caption">
                                            <h3><%= bebida.getNome()%></h3>
                                            <p></p>
                                            <p><a href="ControlerAluno?opcao=editar&bebida=<%= bebida.getIdBebida() %>" class="btn btn-primary" role="button">Comprar</a></p>
                                        </div>
                                    </div>
                                </div>

                                <% }
                                %>
                                         <%
                                 ArrayList<Comida> comidas = aluno.getComidas();
                                 Iterator<Comida> iteratorComida = comidas.iterator();

                                 while (iteratorComida.hasNext()) {
                                      Comida comida = (Comida)iteratorComida.next();
                             %>
                                <div class="col-sm-6 col-md-4">
                                    <div class="thumbnail">
                                        <img src="img/<%= comida.getNome()%>.jpg" alt="psg">
                                        <div class="caption">
                                            <h3><%= comida.getNome()%></h3>
                                            <p></p>
                                            <p><a href="ControlerAluno?opcao=editar&comida=<%= comida.getIdComida() %>" class="btn btn-primary" role="button">Comprar</a></p>
                                        </div>
                                    </div>
                                </div>

                                <% }
                                %>
                                <div class="col-sm-6 col-md-4">
                                    <div class="thumbnail">
                                        <img src="img/hotdog.jpg" alt="psg">
                                        <div class="caption">
                                            <h3>Cachorro Quente</h3>
                                            <p></p>
                                            <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-sm-6 col-md-4">
                                    <div class="thumbnail">
                                        <img src="img/mistoQuente.jpg" alt="psg">
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
                                        <img src="img/saladaFruta.jpg" alt="psg">
                                        <div class="caption">
                                            <h3>Salada de Fruta</h3>
                                            <p></p>
                                            <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                        </div>
                                    </div>
                                </div>


                                <div class="col-sm-6 col-md-4">
                                    <div class="thumbnail">
                                        <img src="img/sucoLaranja.jpg" alt="psg">
                                        <div class="caption">
                                            <h3>Suco de Laranja</h3>
                                            <p></p>
                                            <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-sm-6 col-md-4">
                                    <div class="thumbnail">
                                        <img src="img/saladaFruta.jpg" alt="psg">
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
                                        <img src="img/kikkat.jpg" alt="psg">
                                        <div class="caption">
                                            <h3>KitKat</h3>
                                            <p></p>
                                            <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                        </div>
                                    </div>
                                </div>


                                <div class="col-sm-6 col-md-4">
                                    <div class="thumbnail">
                                        <img src="img/mms.jpg" alt="psg">
                                        <div class="caption">
                                            <h3>MMs</h3>
                                            <p></p>
                                            <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-sm-6 col-md-4">
                                    <div class="thumbnail">
                                        <img src="img/kikkat.jpg" alt="psg">
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
                        <!-- Conteudo -->      

                    </div>
                    <div class="col-md-2"></div>
                </div>
                <div class="row"></div>
            </div>
    </body>
</html>

