<%@page import="java.sql.*"%>
<%
    String user=request.getParameter("user");
    String id=request.getParameter("id");
    String password=request.getParameter("pass");
    String gender=request.getParameter("gender");
    String birth=request.getParameter("dob");
    String num=request.getParameter("num");
    String add=request.getParameter("add");
    String mail=request.getParameter("mail");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
    String sql="insert into picnicregister values(?,?,?,?,?,?,?,?)";
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setString(1,user);
    ps.setString(2,id);
    ps.setString(3,password);
    ps.setString(4,gender);
    ps.setString(5,birth);
    ps.setString(6,num);
    ps.setString(7,add);
    ps.setString(8,mail);
    ps.executeUpdate();
    response.sendRedirect("placesinindore.jsp");
%>  