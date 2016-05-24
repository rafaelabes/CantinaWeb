<%-- 
    Document   : sessao
    Created on : 18/03/2016, 07:36:19
    Author     : uoston
--%>
<%
String nome =request.getParameter("nome");
if(nome==null) nome="";
 
session.setAttribute("nome",nome);

if (nome.equals("Ana")){
    response.sendRedirect("index_aluno.jsp"); 
}
else if (nome.equals("Rafaela")){
    response.sendRedirect("index_responsavel.jsp"); 
}else if (nome.equals("Iago")){
    response.sendRedirect("index_funcionario.jsp");  
}
%>



