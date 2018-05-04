package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "controller.LoginControllerServlet", urlPatterns = "/login")
public class LoginControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("txtUsername");
        String password = request.getParameter("txtPassword");

        //create session
        HttpSession session = request.getSession();
        if(username.equals("admin") && password.equals("admin")){

            //create cooki
            Cookie user = new Cookie("username", "admin");
            Cookie pwd = new Cookie("password", "admin");
            if(request.getParameter("chkremember")!=null){
                user.setMaxAge(60*60*24);
                pwd.setMaxAge(60*60*24);
            }else {
                user.setMaxAge(0);
                pwd.setMaxAge(0);
            }
            response.addCookie(user);
            response.addCookie(pwd);

            //key = username, value = admin
            session.setAttribute("username", "admin");

            //chuyen tiep sang trang index
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request,response);
        }else {
            //dang nhap loi
            request.setAttribute("error", "username and password invalid !");

            //tro ve lai trang login
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
