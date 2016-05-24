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
                    <li><a href="../index/index_responsavel.jsp">Home</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li ><a href="#"> 
                            <%
                                Responsavel responsavel = (Responsavel) session.getAttribute("responsavel");
                                if(responsavel != null)
                                out.print("Olá " + responsavel.getNome());
                            %>
                            <span class="sr-only">(current)</span></a></li>
                    <li><a class="" href="ControlerUsuario?opcao=false">Sair</a></li>
                </ul>
                <div  class = "Alerta-sucesso"  role = "alert" > Sucesso </ div> 
            </div><!-- /.navbar-collapse -->
        </nav>
    </div>
    <div class="col-md-2"></div>
</div>

