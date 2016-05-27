<%-- 
    Document   : cadastrarFuncionario
    Created on : 12/03/2016, 22:39:18
    Author     : Rafaela Batista
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
                        <div class="panel panel-success">
                            <div class="panel-heading">Cadastrar Escola</div>
                            <div class="panel-body">
                                <form name="Cadastro" action="../ServletEscola" method="post">
                                    <div class="form-group">
                                    <label for="nome">Nome</label>
                                    <input type="text" name="nome" class="form-control" placeholder="Carrossel" required>
                                    </div>
                                    <div class="form-group">
                                    <label for="endereco">Endereco</label>
                                    <input type="text" name="endereco" class="form-control" placeholder=" AV Pedacinho do céu" required>
                                    </div>
                                    <div class="form-group">
                                    <label for="telefone">Telefone</label>
                                    <input type="text" name="telefone" class="form-control" placeholder="00 00000-0000" required>
                                    </div>
                                    <div class="form-group">
                                    <label for="email">Email</label>
                                    <input type="text" name="email" class="form-control" placeholder="Carrossel@gmail.com" required>
                                    </div>
                                    <div class="form-group">
                                    <label for="responsavel">Responsavel</label>
                                    <input type="text" name="responsavel" class="form-control" placeholder="Digite o nome do responsável" required>
                                    </div>
                                    </div>
                                    <br>
                                    
                                    <button type="submit" class="btn btn-primary">Salvar</button>
                                </form>
                            </div>
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

