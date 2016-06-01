<%-- 
    Document   : nav_responsavel
    Created on : 21/03/2016, 23:49:34
    Author     : uoston
--%>

<%@page import="controller.Responsavel"%>
<%@page import="controler.Mensagem"%>
<%@page import="controller.Usuario"%>
<div class="row" >
    <div class="col-md-2"></div>
    <div class="col-md-8"> 
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <ul class="nav navbar-nav navbar-left">
                    <li><a href="ControlerUsuario">Home</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li ><a href="#"> 
                            <%
                                Responsavel responsavel = (Responsavel) session.getAttribute("responsavel");

                                out.print("Olá " + responsavel.getNome());
                            %>
                            <span class="sr-only">(current)</span></a></li>
                    <li><a class="" href="ControlerUsuario?opcao=false">Sair</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </nav>
    </div>
    <div class="col-md-2"></div>
</div>

