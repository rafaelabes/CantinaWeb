<%-- 
    Document   : funcionario_usuario
    Created on : 02/06/2016, 22:59:30
    Author     : Rafaela
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

                    <div class="panel panel-success">
                        <div class="panel-heading">Cadastrar Usuário Funcionário</div>
                        <div class="panel-body">
                            <form class="form-horizontal" action="ControlerFuncionario?opcao=inserirUsuario" method="post">
                                <fieldset>
                                    <!-- Text input-->
                                    <div class="form-group">
                                      <label class="col-md-4 control-label" for="login_funcionario">Login</label>  
                                      <div class="col-md-4">
                                      <input id="login_funcionario" name="login_funcionario" type="text" class="form-control input-md"  required>
                                      </div>
                                    </div>
                                    <!-- Password input-->
                                    <div class="form-group">
                                      <label class="col-md-4 control-label" for="senha_funcionario">Senha</label>
                                      <div class="col-md-4"> 
                                        <input id="senha_funcionario" name="senha_funcionario" type="password" class="form-control input-md"  required>
                                      </div>
                                    </div>
                                    <!-- Button -->
                                    <div class="form-group">
                                      <div class="col-sm-offset-4 col-md-4">
                                        <button type="submit" class="btn btn-primary" name="opcao" value="true">Salvar</button>
                                        <a href="ControlerUsuario" class="btn btn-success active" role="button">Voltar</a>
                                      </div>
                                    </div>
                                </fieldset>
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
