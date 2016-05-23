/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import model.ProdutoDAO;

/**
 *
 * @author Kanec
 */
@WebServlet(name = "ProdutoController", urlPatterns = {"/cadastrarproduto", "/listarprodutos"})
public class ProdutoController extends HttpServlet {

    private Object con;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String uri = request.getRequestURI();

        if (uri.equals(request.getContextPath() + "/cadastrarproduto")) {

            try {
                cadastrar(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            try {
                consultarTodos(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {

        ProdutoDAO p = new ProdutoDAO();
        Produto p2 = new Produto();
        
        String tip = request.getParameter("tipo");
        String nome = request.getParameter("nome");
        int qntd = Integer.parseInt(request.getParameter("qntd"));
        double prec = Double.parseDouble(request.getParameter("prec"));

        p2.setTipMerc(tip);
        p2.setNomeMerc(nome);
        p2.setQntdMerc(qntd);
        p2.setPrecMerc(prec);

        p.cadastrar(p2);

        response.sendRedirect("sucess.jsp");

    }

    private void consultarTodos(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException, ServletException {

        ProdutoDAO p = new ProdutoDAO();
        Produto p2 = new Produto();

        List<Produto> c = p.consultarTodos();

        request.setAttribute("todosProdutos", c);

        request.getRequestDispatcher("saidalista.jsp").forward(request, response);
    }

}
