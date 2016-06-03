<%-- 
    Document   : nav_funcionario
    Created on : 03/06/2016, 22:05:27
    Author     : uoston
--%>
<%@page import="controller.Funcionario"%>
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
                                Usuario usuarioFuncionario = (Usuario) session.getAttribute("funcionario");
                                
                                out.print("Olá " + usuarioFuncionario.getLogin());
                            %>
                            <span class="sr-only">(current)</span></a></li>
                    <li><a class="" href="ControlerUsuario?opcao=false">Sair</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </nav>
    </div>
    <div class="col-md-2"></div>
</div>
