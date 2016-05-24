<%-- 
    Document   : Login
    Created on : 12/03/2016, 16:26:13
    Author     : uoston
--%>

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
                    <!--                         Conteudo -->
                    <div class="panel panel-success">
                        <div class="panel-heading">Login</div>
                        <div class="panel-body">
                            <form action="sessao.jsp" method="post" >
                                <div class="form-group">
                                    <label for="nome">Nome</label>
                                    <input type="text" class="form-control" id="nome" name="nome" placeholder="Nome">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Senha</label>
                                    <input type="password" class="form-control" id="senha" name="senha" placeholder="Senha">
                                </div>
                                <button type="submit" class="btn btn-primary">Entrar</button>
                                <a href="index.jsp" class="btn btn-success active" role="button">Voltar</a>
                            </form>
                        </div>
                    </div>
                    <!--                         Conteudo -->
                </div>
                <div class="col-md-2"></div>
            </div>
            <div class="row"></div>
        </div>
    </body>
</html>
