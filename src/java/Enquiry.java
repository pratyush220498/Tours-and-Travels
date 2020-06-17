



import Dao.LogicalCode;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Enquiry extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try
        {
               String name,id,gender,address,place,enquiry;
               name=request.getParameter("user");
               id=request.getParameter("userid");
               gender=request.getParameter("gender");
               address=request.getParameter("address");
               place=request.getParameter("place");
               enquiry=request.getParameter("enquiry");
               if(LogicalCode.insertion(name,id,gender,address,place,enquiry))
                   response.sendRedirect("ghumophirohome.jsp");
               else
                   response.sendRedirect("about.jsp");
        }
        catch(Exception e)
        {System.out.println(e);}
 
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
               try
        {
               String name,id,gender,address,place,enquiry;
               name=request.getParameter("user");
               id=request.getParameter("userid");
               gender=request.getParameter("gender");
               address=request.getParameter("address");
               place=request.getParameter("place");
               enquiry=request.getParameter("enquiry");
               if(LogicalCode.insertion(name,id,gender,address,place,enquiry))
                   response.sendRedirect("ghumophirohome.jsp");
               else
                   response.sendRedirect("about.jsp");
        }
        catch(Exception e)
        {System.out.println(e);}
 
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
