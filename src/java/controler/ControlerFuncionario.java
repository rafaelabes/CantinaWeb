package controler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import controller.Funcionario;
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
public class ControlerFuncionario extends HttpServlet {

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
            
            
            String opcao = request.getParameter("opcao");
            
            //verifica se existe usuario logado se, não redireciona para o index
            HttpSession session = request.getSession(false);
            Usuario usuarioSessao = (Usuario)session.getAttribute("usuario");
            if(usuarioSessao != null){
              if(session == null){
                      String url = "/index/index.jsp";
                      RequestDispatcher rd = request.getRequestDispatcher(url);
                      rd.include(request,response);
              }

              if((opcao != null) && (opcao.equals("cadastro"))){
                  String urlFuncionario = "/funcionario/funcionario_usuario.jsp";
                  RequestDispatcher rd = request.getRequestDispatcher(urlFuncionario);
                  rd.forward(request,response);
              }else if(opcao.equals("inserirUsuario")){
                  //recupera o usuario do funcionario da sessão
                  Usuario funcionarioLogado = (Usuario)session.getAttribute("usuario"); 

                  //cria usuario funcionario com os dados do cadastro 
                  Usuario funcionarioUsuario = new Usuario();
                  String login = request.getParameter("login_funcionario");
                  String senha = request.getParameter("senha_funcionario");
                  funcionarioUsuario.setLogin(login);
                  funcionarioUsuario.setSenha(senha);
                  funcionarioUsuario.setTipo(1);
                  //funcionarioUsuario.setIdEscola(funcionarioLogado.getIdEscola());

                  //cadastra e verifica se não houve erros e consulta para ter o usuario funcionario na hora de cadastrar o funcionario
                  funcionarioUsuario.cadastrar();
                  String condicao = " and idUsuario = (select max(idUsuario) from lp3.usuario)";
                  if(funcionarioUsuario.consultar(condicao)){
                      request.setAttribute("usuarioFuncionario", funcionarioUsuario);
                      String urlFuncionario = "/funcionario/funcionario_cadastro.jsp";
                      RequestDispatcher rd = request.getRequestDispatcher(urlFuncionario);
                      rd.forward(request,response);
                  }else{
                      //String StringErro = "Mensagem ao cadastrar o funcionario";
                      String urlFuncionario = "/funcionario/funcionario_usuario.jsp";
                      RequestDispatcher rd = request.getRequestDispatcher(urlFuncionario);
                      rd.forward(request,response);
                  }     

              }else if(opcao.equals("inserir")){
                  //recupera o usuario da sessão
                  Usuario funcionarioLogado = (Usuario)session.getAttribute("usuario"); 
  //                Usuario alunoUsuario  = (Usuario)request.getAttribute("usuarioAluno");

                  //cria um objeto responsavel para usar no cadastro do funcionario
                  Funcionario funcionario = new Funcionario(); 
                //  funcionario.setIdUsuario(funcionarioLogado.getIdUsuario());
                //  funcionario.consultar();             
                  //cria o objeto funcionario com os dados preenchidos realiza o cadastramento

                   
                  funcionario.setNome(request.getParameter("nome"));
                  funcionario.setEscola(request.getParameter("escola"));                                                                                            
                  funcionario.setCpf(request.getParameter("cpf"));
                  funcionario.setEmail(request.getParameter("email"));
                  funcionario.setIdUsuario(Integer.parseInt(request.getParameter("idUsuario")));
                  funcionario.setSituacao("Desbloqueado");
                  

                  //se o cadastro for realizado seta o objeto funionarioUsuario e retorna para o cadastro
                  funcionario.cadastrar();
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

                      String urlFuncionarioCadastro = "/index/index_funcionario.jsp";
                      RequestDispatcher rd = request.getRequestDispatcher(urlFuncionarioCadastro);
                      rd.include(request,response);

              //consulta os funcionarios
              }else if(opcao.equals("consultar")){
                  //recupera o usuario logado
                  Usuario funcionarioLogado = (Usuario)session.getAttribute("usuario"); 
                  //cria o objeto do responsavel e preenche o objeto
                  //cria um objeto responsavel para usar no cadastro do funcionario
                  Funcionario funcionario = new Funcionario(); 
                  funcionario.setIdUsuario(funcionarioLogado.getIdUsuario());
                  funcionario.consultar(); 
                  funcionario.ConsultarListaFuncionario();
                  //seta o parametro 
                  request.setAttribute("funcionario", funcionario);

                  String urlFuncionario = "/funcionario/funcionario_consultar.jsp";
                  RequestDispatcher rd = request.getRequestDispatcher(urlFuncionario);
                  rd.forward(request,response);
              }else if(opcao.equals("editar")){
                  //pega a idFuncionario cria o objeto funcionario com a id e consulta o funcionario
                  String idFunc = request.getParameter("idFunc");
                  Funcionario funcionario = new Funcionario();
                  funcionario.setIdFuncionario(Integer.parseInt(idFunc));
                  funcionario.consultar();
                  //passa o objeto funcionario
                  request.setAttribute("funcionario", funcionario);
                  String urlFuncionario = "/funcionario/funcionario_editar.jsp";
                  RequestDispatcher rd = request.getRequestDispatcher(urlFuncionario);
                  rd.forward(request,response);                               
              }else if(opcao.equals("editarFuncionario")){
                  //pega o id cria o objeto func com o id e consulta o funcionario
                  String idFuncEditar = request.getParameter("idFuncEditar");
                  String nomeEditar = request.getParameter("nomeEditar");
                  String escolaEditar = request.getParameter("escolaEditar");
                  String cpfEditar = request.getParameter("cpfEditar");
                  String emailEditar = request.getParameter("emailEditar");
                  String situacao = request.getParameter("situacao");
                  //criar o objeto edita e consulta
                  Funcionario funcionario = new Funcionario();
                  funcionario.setIdFuncionario(Integer.parseInt(idFuncEditar));
                  funcionario.setNome(nomeEditar);
                  funcionario.setEscola(escolaEditar);
                  funcionario.setCpf(cpfEditar);
                  funcionario.setEmail(emailEditar);
                  funcionario.setSituacao(situacao);
                  funcionario.editar();
                  funcionario.consultar();

                  //passa o objeto aluno
                 // request.setAttribute("aluno", aluno);

                                  //recupera o usuario do responsavel
                  Usuario funcionarioLogado = (Usuario)session.getAttribute("usuario"); 
                  //cria o objeto do responsavel e preenche o objeto
                  Funcionario funcionariol = new Funcionario();
                  funcionariol.setIdUsuario(funcionarioLogado.getIdUsuario());
                  funcionariol.consultar(); 
                  funcionariol.ConsultarListaFuncionario();
                  //seta o parametro responsavel
                  request.setAttribute("funcionariol", funcionariol);

                  String urlFuncionario = "/funcionario/funcionario_consultar.jsp";
                  RequestDispatcher rd = request.getRequestDispatcher(urlFuncionario);
                  rd.forward(request,response);                               
              }else{
                    session.invalidate();
                    String url = "/index/index.jsp";
                    RequestDispatcher rd = request.getRequestDispatcher(url);
                    rd.forward(request,response);
            }
                    

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

