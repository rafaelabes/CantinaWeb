<%-- 
    Document   : usuario_info
    Created on : 17/03/2016, 23:24:20
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
                    <!-- Conteudo -->
                    <div class="panel panel-success">
                        <div class="panel-heading">Usuário</div>
                        <div class="panel-body">
                            <form>
                                <div class="form-group">
                                    <label for="nome">Nome</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Nome">
                                </div>
                                <div class="form-group">
                                    <label for="login">Login</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Login">
                                </div>                                       
                                <button type="submit" class="btn btn-primary">Salvar</button>
                            </form>
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
