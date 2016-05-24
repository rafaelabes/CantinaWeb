<%-- 
    Document   : responsavel_cadastrar
    Created on : 18/03/2016, 01:37:02
    Author     : Rafaela Batista
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="../estrutura/header.jspf"/> 
    <body>
        <div class="container-fluid">  
            <jsp:include page="../estrutura/nav.jsp"/> 
            <div class="row" ></div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <jsp:include page="../estrutura/tab.jspf"/>
                    <!-- Conteudo -->

                    <div class="panel panel-success">
                        <div class="panel-heading">Bloquear Produtos</div>
                        <div class="panel-body">
                            <form id="bloquearprodutos">
                                <div class="form-group">
                                    <label for="nome">Matricula</label>
                                    <input type="text" name="matricula" class="form-control" placeholder="0000">
                                </div>
                                <div class="form-group">
                                    <label for="nome">Nome</label>
                                    <input type="text" name="nome" class="form-control" placeholder="Digite o nome">
                                </div>
                                <div>
                                    <label for="codigo">Produtos</label>
                                    <select class="form-control" name="tipoProduto">
                                        <option value="1">Refrigerante</option>
                                        <option value="2">Salgadinhos</option>
                                        <option value="2">Doces</option>
                                        <option value="2">Leite</option>

                                    </select>

                                </div>

                                <button type="submit" class="btn btn-primary">Salvar</button>
                                <a href="../index/index.jsp" class="btn btn-success active" role="button">Voltar</a>
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