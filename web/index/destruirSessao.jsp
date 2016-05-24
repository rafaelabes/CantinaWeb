<%-- 
    Document   : destruirSessao
    Created on : 21/03/2016, 21:58:11
    Author     : uoston
--%>

<%
session.invalidate();
response.sendRedirect("ControlerUsuario"); 
%>



