import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class NewServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        int a=Integer.parseInt(request.getParameter("t1"));
        int b=Integer.parseInt(request.getParameter("t2"));
        int c=Integer.parseInt(request.getParameter("t3"));
        if(a>b&&a>c)
        {
            out.println("a is greatest");
        }
        else if(b>a&&b>c)
        {
            out.println("b is gratest");
        }
        else
        {
            out.println("c is greatest");
        }
    }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
