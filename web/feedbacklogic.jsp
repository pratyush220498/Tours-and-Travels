
<%@page import= "java.sql.Connection"%>
<%@page import= "java.sql.DriverManager"%>
<%@page import= "java.sql.PreparedStatement"%>
<%@page import= "java.sql.ResultSet"%>

<%
    String username=request.getParameter("user");
    String usergender=request.getParameter("gender");
    String birth=request.getParameter("dob");
    String email=request.getParameter("mail");
    String feeds=request.getParameter("feedback");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
    PreparedStatement st=con.prepareStatement("insert into picnicfeed values(?,?,?,?,?)");
    st.setString(1,username);
    st.setString(2,usergender);
    st.setString(3,birth);
    st.setString(4,email);
    st.setString(5,feeds);
    st.executeUpdate();
   response.sendRedirect("ghumophirohome.jsp");
%>
 