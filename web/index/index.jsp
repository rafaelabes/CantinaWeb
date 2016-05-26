<%-- 
    Document   : index
    Created on : 12/03/2016, 16:26:13
    Author     : uoston
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="../estrutura/header_info.jspf"/> 
    <body>

        <%
//            Connection con;
//
//
//            try {
//
//                Class.forName("org.gjt.mm.mysql.Driver");
//                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lp3", "root", "123456");
//                String sql = "select login from usuario";
//                PreparedStatement stmt = con.prepareStatement(sql);            
//                
//                ResultSet rs = stmt.executeQuery();
//
//                // itera no ResultSet
//                while (rs.next()) {
//                  String nome = rs.getString("login");
//
//                  out.println("O nome é :: " + nome);
//                }
//
//                stmt.close();
//                con.close();
//            } catch (Exception e) {
//                out.println("Não foi possível conectar ao banco" + e.getMessage());
//            }
        %>
        <div class="container-fluid">  
            <jsp:include page="../estrutura/nav.jspf"/> 
            <div class="row" ></div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">

                    <!-- Conteudo -->
                    <div class="tab-content">
                        <div role="tabpanel painelgeral" class="tab-pane active" id="Cadastrar">     
                            <div class="panel panel-default">
                                <div class="panel-body">

                                    <div class="jumbotron">
                                        <h1>Seja Bem-vindo!</h1>
                                        <p></p>
                                        <p><a class="btn btn-primary btn-lg" href="#" role="button">Leia mais..</a></p>
                                    </div>
                                    <div class="row"> 
                                        <div class="col-sm-4 col-md-4">

                                            <div class="thumbnail">
                                                <img src="../img/Escola.jpg" alt="Escola">
                                                <div class="caption">
                                                    <h2>Escola</h2>
                                                    <p>A cinco anos no mercado a school food. è um sistema que proporciona um controle integral da vida alimentar de seus filhos. </p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-4 col-md-4">
                                            <div class="thumbnail">
                                                <img src="../img/Escola.jpg" alt="Eventos">
                                                <div class="caption">
                                                    <h2>Eventos</h2>
                                                    <p>A cinco anos dsdsdsadas no mercado a school food. è um sistema que proporciona um controle integral da vida alimentar de seus filhos. </p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-4 col-md-4">
                                            <div class="thumbnail">
                                                <img src="../img/aguaDeCoco.png" alt="Notícias">
                                                <div class="caption">
                                                    <h2>Notícias</h2>
                                                    <p>A cinco anos no mercado a school food. è um sistema que proporciona um controle integral da vida alimentar de seus filhos. </p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
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
