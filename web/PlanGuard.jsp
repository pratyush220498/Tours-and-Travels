<%
    HttpSession session1=request.getSession(false);
    try
    {
        String value=(String)session.getAttribute("Access");
        if(value==null)
            response.sendRedirect("planyourtravel.jsp");
        if(session==null)
            response.sendRedirect("planyourtravel.jsp");
        else
            response.sendRedirect("CreatePlan.jsp");
    }
    catch(Exception ex)
    {System.out.println();}
%>