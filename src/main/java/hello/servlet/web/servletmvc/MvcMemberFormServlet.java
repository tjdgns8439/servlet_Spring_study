package hello.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        //getRequestDispatcher(viewPath) -> 컨트롤러에서 뷰로 이동할 거라는 뜻
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        //실제로 서블릿에서 JSP를 호출함 -> 컨트롤러가 제어할 수 있게 해줌.
        dispatcher.forward(request, response);
    }
}
