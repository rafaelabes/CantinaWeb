/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controler.Mensagem;
import controller.Aluno;
import controller.Responsavel;
import controller.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author uoston
 */
public class ControlerAluno extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String opcao = request.getParameter("opcao");

            if((opcao != null) && (opcao.equals("cadastro"))){
                String urlAluno = "/aluno/aluno_usuario.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(urlAluno);
                rd.forward(request,response);
            }else if(opcao.equals("inserirUsuario")){
                //recupera o usuario do Responsavel da sessão
                HttpSession session = request.getSession();
                Usuario responsavelUsuario = (Usuario)session.getAttribute("usuario"); 
                
                //cria usuario aluno com os dados do cadastro 
                Usuario alunoUsuario = new Usuario();
                String login = request.getParameter("login_aluno");
                String senha = request.getParameter("senha_aluno");
                alunoUsuario.setLogin(login);
                alunoUsuario.setSenha(senha);
                alunoUsuario.setTipo(3);
                alunoUsuario.setIdEscola(responsavelUsuario.getIdEscola());
                
                //cadastra e verifica se não houve erros e consulta para ter o usuario aluno na hora de cadastrar o aluno
                alunoUsuario.cadastrar();
                String condicao = " and idUsuario = (select max(idUsuario) from lp3.usuario)";
                if(alunoUsuario.consultar(condicao)){
                    request.setAttribute("usuarioAluno", alunoUsuario);
                    String urlFuncionario = "/aluno/aluno_cadastrar.jsp";
                    RequestDispatcher rd = request.getRequestDispatcher(urlFuncionario);
                    rd.forward(request,response);
                }else{
                    //String StringErro = "Mensagem ao cadastrar o aluno";
                    String urlAluno = "/aluno/aluno_usuario.jsp";
                    RequestDispatcher rd = request.getRequestDispatcher(urlAluno);
                    rd.forward(request,response);
                }     
                    
            }else if(opcao.equals("inserir")){
                //recupera o usuario da sessão
                HttpSession session = request.getSession();
                Usuario ResponsalveUsuario = (Usuario)session.getAttribute("usuario"); 
                Usuario alunoUsuario  = (Usuario)request.getAttribute("usuarioAluno");
                //cria um objeto responsavel para usar no cadastro do aluno
                Responsavel responsavel = new Responsavel(); 
                responsavel.consultar(ResponsalveUsuario);             
                //cria o objeto aluno com os dados preenchidos realiza o cadastramento
                Aluno aluno = new Aluno(); 
                aluno.setIdResponsavel(responsavel.getIdResponsavel());
                aluno.setNome(request.getParameter("nome"));
                aluno.setTurma(request.getParameter("turma"));
                aluno.setTurno(request.getParameter("turno"));
                aluno.setSaldo(request.getParameter("saldo"));
                aluno.setIdUsuario(Integer.parseInt(request.getParameter("idUsuario")));
                aluno.setIdResponsavel(responsavel.getIdResponsavel());
                //se o cadastro for realizado seta o objeto alunoUsuario e retorna para o cadastro
                if(aluno.cadastrar()){
                    String stringMensagem = "Cadastro realizado com sucesso!";
                    String tipo = "-sucesso";
                    Mensagem mensagem = new Mensagem(stringMensagem,tipo);
                    
                    request.setAttribute("mensagem", mensagem);                
                    request.setAttribute("alunoUsuario", alunoUsuario);

                    String urlAlunoCadastro = "/aluno/aluno_cadastrar.jsp";
                    RequestDispatcher rd = request.getRequestDispatcher(urlAlunoCadastro);
                    rd.include(request,response);
                }
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ControlerAluno</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ControlerAluno at " + responsavel.getIdResponsavel()+ "</h1>");
//            out.println("</body>");
//            out.println("</html>");
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
