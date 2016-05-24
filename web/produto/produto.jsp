<%-- 
    Document   : produto
    Created on : 17/03/2016, 21:51:35
    Author     : uoston
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jspf"/> 
    <body>
        <div class="container-fluid">  
            <jsp:include page="nav.jspf"/> 
            <div class="row" >
            </div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <jsp:include page="tab.jspf"/>
                    <!-- Conteudo -->
                    <div class="panel panel-success">
                        <div class="panel-heading">Login</div>
                        <div class="panel-body">
                            <form>
                                <div class="form-group">
                                    <label for="nome">Nome</label>
                                    <input type="text" class="form-control" name="nome" placeholder="Digite o seu nome">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Senha</label>
                                    <input type="password" class="form-control" name="senha" id="exampleInputPassword1" placeholder="Digite a sua senha">
                                </div>
                                <button type="submit" class="btn btn-primary">Entrar</button>
                                <a href="index.jsp" class="btn btn-success active" role="button">Voltar</a>
                            </form>
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
