package controler;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import controller.Aluno;
import controller.Responsavel;
import controller.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ControlerUsuario extends HttpServlet {


    
    
    
    
    //teste
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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            String opcao = request.getParameter("opcao");
            
 
            HttpSession session = request.getSession();
            Usuario usuarioSessao = (Usuario)session.getAttribute("usuario");
            if((usuarioSessao != null)&& (opcao == null)){
                opcao = "true";
            }
            //verifica se foi tentativa de login e se não foi retireciona
           if((opcao != null) && (opcao.equals("true"))) {
                //cria o objeto usuario          
                Usuario usuario = new Usuario();
                usuario.setLogin(login);
                usuario.setSenha(senha);
                if(usuarioSessao != null){
                    usuario = usuarioSessao;
                }else{
                    usuario.verificaLogin();
                }
                //verifica se o usuario e a senha estão corretos

                if(usuario.getIdUsuario() > 0){
                    //Seleciona a tela apartir do tipo do usuario       
                    session.setAttribute("usuario", usuario);
                    //funcionario
                    if(usuario.getTipo() == 1){
                        
                        String urlFuncionario = "/index/index_funcionario.jsp";
                        RequestDispatcher rd = request.getRequestDispatcher(urlFuncionario);
                        rd.forward(request,response);
                    //responsalvel
                    }else if(usuario.getTipo() == 2 ){ 
                        //cria o objeto responsavel e consulta no banco com o idUsuario preenche os dados do objeto
                        Responsavel responsavel = new Responsavel();
                        responsavel.setIdUsuario(usuario.getIdUsuario());
                        responsavel.consultar();

                        session.setAttribute("responsavel", responsavel);
                        
                        String urlResponsavel = "/index/index_responsavel.jsp";
                        RequestDispatcher rd = request.getRequestDispatcher(urlResponsavel);
                        rd.forward(request,response);    
                    //aluno
                    }else if(usuario.getTipo() == 3 ){
                        Aluno AlunoConsulta = new Aluno();
                        AlunoConsulta.setIdUsuario(usuario.getIdUsuario());
                        String condicao = "";
                        if(AlunoConsulta.consultar(condicao)){
                            request.setAttribute("aluno", AlunoConsulta);

                            String urlAluno = "/index/index_aluno.jsp";
                            RequestDispatcher rd = request.getRequestDispatcher(urlAluno);
                            rd.forward(request,response); 
                        }else{
                            String urlAluno = "/index/index.jsp";
                            RequestDispatcher rd = request.getRequestDispatcher(urlAluno);
                            rd.forward(request,response); 
                        }
                            
                    }
                }else{
                    session.invalidate();
                    String url = "/index/index.jsp";
                    RequestDispatcher rd = request.getRequestDispatcher(url);
                    rd.include(request,response);
                }
            }else{
                    session.invalidate();
                    String url = "/index/index.jsp";
                    RequestDispatcher rd = request.getRequestDispatcher(url);
                    rd.include(request,response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControlerUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControlerUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
