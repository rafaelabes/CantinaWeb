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
import java.util.ArrayList;
import java.util.Iterator;
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
            
            //verifica se existe usuario logado se, não redireciona para o index
            HttpSession session = request.getSession(false);
              if(session == null){
                    String url = "/index/index.jsp";
                    RequestDispatcher rd = request.getRequestDispatcher(url);
                    rd.include(request,response);
            }

            if((opcao != null) && (opcao.equals("cadastro"))){
                String urlAluno = "/aluno/aluno_usuario.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(urlAluno);
                rd.forward(request,response);
            }else if(opcao.equals("inserirUsuario")){
                //recupera o usuario do Responsavel da sessão
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
                Usuario ResponsalveUsuario = (Usuario)session.getAttribute("usuario"); 
//                Usuario alunoUsuario  = (Usuario)request.getAttribute("usuarioAluno");
                
                //cria um objeto responsavel para usar no cadastro do aluno
                Responsavel responsavel = new Responsavel(); 
                responsavel.setIdUsuario(ResponsalveUsuario.getIdUsuario());
                responsavel.consultar();             
                //cria o objeto aluno com os dados preenchidos realiza o cadastramento
                
                Aluno aluno = new Aluno(); 
                aluno.setIdResponsavel(responsavel.getIdResponsavel());
                aluno.setNome(request.getParameter("nome"));
                aluno.setTurma(request.getParameter("turma"));
                aluno.setTurno(request.getParameter("turno"));
                aluno.setIdUsuario(Integer.parseInt(request.getParameter("idUsuario")));
                aluno.setSituacao("Desbloqueado");
                aluno.setIdResponsavel(responsavel.getIdResponsavel());

                //se o cadastro for realizado seta o objeto alunoUsuario e retorna para o cadastro
                aluno.cadastrar();
//                    String stringMensagem = "Cadastro realizado com sucesso!";
//                    String tipo = "-sucesso";
//                    Mensagem mensagem = new Mensagem(stringMensagem,tipo);
//                    
//                    request.setAttribute("mensagem", mensagem);  
//                    String idUsuarioAluno = request.getParameter("idUsuario");
//                    Usuario usuarioAluno = new Usuario();
//                    usuarioAluno.setIdUsuario(Integer.parseInt(idUsuarioAluno));
//                    usuarioAluno.consultar(null);
//                    request.setAttribute("usuarioAluno", usuarioAluno);
               
                    String urlAlunoCadastro = "/index/index_responsavel.jsp";
                    RequestDispatcher rd = request.getRequestDispatcher(urlAlunoCadastro);
                    rd.include(request,response);
                
            //consulta os alunos
            }else if(opcao.equals("consultar")){
                //recupera o usuario do responsavel
                Usuario responsavelUsuario = (Usuario)session.getAttribute("usuario"); 
                //cria o objeto do responsavel e preenche o objeto
                Responsavel responsavel = new Responsavel(); 
                responsavel.setIdUsuario(responsavelUsuario.getIdUsuario());
                responsavel.consultar(); 
                responsavel.ConsultarListaAluno();
                //seta o parametro responsavel
                request.setAttribute("responsavel", responsavel);
             
                String urlAluno = "/aluno/aluno_consultar.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(urlAluno);
                rd.forward(request,response);
            }else if(opcao.equals("editar")){
                //pega a matricula cria o objeto aluno com a matricula e consulta o aluno
                String mat = request.getParameter("mat");
                Aluno aluno = new Aluno();
                aluno.setMatricula(Integer.parseInt(mat));
                aluno.consultar();
                //passa o objeto aluno
                request.setAttribute("aluno", aluno);
                String urlAluno = "/aluno/aluno_editar.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(urlAluno);
                rd.forward(request,response);                               
            }else if(opcao.equals("editarAluno")){
                //pega a matricula cria o objeto aluno com a matricula e consulta o aluno
                String matriculaEditar = request.getParameter("matriculaEditar");
                String nomeEditar = request.getParameter("nomeEditar");
                String turmaEditar = request.getParameter("turmaEditar");
                String turnoEditar = request.getParameter("turnoEditar");
                String situacao = request.getParameter("situacao");
                //criar o objeto edita e consulta
                Aluno aluno = new Aluno();
                aluno.setMatricula(Integer.parseInt(matriculaEditar));
                aluno.setNome(nomeEditar);
                aluno.setTurma(turmaEditar);
                aluno.setTurno(turnoEditar);
                aluno.setSituacao(situacao);
                aluno.editar();
                aluno.consultar();
                
                //passa o objeto aluno
               // request.setAttribute("aluno", aluno);
                
                                //recupera o usuario do responsavel
                Usuario responsavelUsuario = (Usuario)session.getAttribute("usuario"); 
                //cria o objeto do responsavel e preenche o objeto
                Responsavel responsavel = new Responsavel(); 
                responsavel.setIdUsuario(responsavelUsuario.getIdUsuario());
                responsavel.consultar(); 
                responsavel.ConsultarListaAluno();
                //seta o parametro responsavel
                request.setAttribute("responsavel", responsavel);
                
                String urlAluno = "/aluno/aluno_consultar.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(urlAluno);
                rd.forward(request,response);                               
            }else if(opcao.equals("saldo")){
                //pega a matricula cria o objeto aluno com a matricula e consulta o aluno
                String mat = request.getParameter("mat");
                Aluno aluno = new Aluno();
                aluno.setMatricula(Integer.parseInt(mat));
                aluno.consultar();
                
//                
//                //recupera o usuario do responsavel
//                Usuario responsavelUsuario = (Usuario)session.getAttribute("usuario"); 
//                //cria o objeto do responsavel e preenche o objeto
//                Responsavel responsavel = new Responsavel(); 
//                responsavel.setIdUsuario(responsavelUsuario.getIdUsuario());
//                responsavel.consultar(); 
//                responsavel.ConsultarListaAluno();
//                
//                //seta o parametro responsavel
//                request.setAttribute("responsavel", responsavel); 
                request.setAttribute("aluno", aluno); 
                String urlAluno = "/aluno/aluno_saldo.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(urlAluno);
                rd.forward(request,response);                                  
            }else if(opcao.equals("inserirSaldo")){
                
                Aluno aluno = new Aluno();
                
                aluno.setMatricula(Integer.parseInt(request.getParameter("matricula")));
                aluno.setSaldo(Integer.parseInt(request.getParameter("saldo")));
                aluno.inserirSaldo();
                
                
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
