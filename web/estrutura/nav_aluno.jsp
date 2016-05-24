<%-- 
    Document   : nav_aluno
    Created on : 21/03/2016, 23:46:07
    Author     : uoston
--%>

<%@page import="controller.Aluno"%>
<%@page import="controller.Usuario"%>
<div class="row" >
    <div class="col-md-2"></div>
    <div class="col-md-8"> 
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <ul class="nav navbar-nav navbar-left">
                    <li><a href="../index/index_aluno.jsp">Home</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li ><a href="#">
                            <%
                                Aluno aluno = (Aluno) request.getAttribute("aluno");
                               
                                out.print("Olá " + aluno.getNome());
                            %>                           
                            <span class="sr-only">(current) <div name="nome"></div></span></a></li>
                    <li><a class="" href="ControlerUsuario?opcao=false">Sair</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </nav>
    </div>
    <div class="col-md-2"></div>
</div>
