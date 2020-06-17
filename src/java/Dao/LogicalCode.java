/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author pratyush
 */
public class LogicalCode {
            String sql;
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            
        public static boolean insertion(String name,String id,String gender,String address,String place,String enquiry)
        {
            String sql;
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            try
            {
                sql="insert into picnicenquiry values(?,?,?,?,?,?)";
                con=MyConnection.myConnection();
                ps=con.prepareStatement(sql);
                ps.setString(1,name);
                ps.setString(2,id);
                ps.setString(3,gender);
                ps.setString(4,address);
                ps.setString(5,place);
                ps.setString(6,enquiry);
                ps.executeUpdate();
                return true;
            
            }
            catch(Exception e)
            {
             System.out.println(e);   
            }
               return false;
        }
        
        public static boolean check(String userid,String userpass)throws Exception
        {
            String sql;
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
                sql="select * from picnicregister where UserId=? and UserPass=?";
                con=MyConnection.myConnection();
                ps=con.prepareStatement(sql);
                ps.setString(1,userid);
                ps.setString(2,userpass);
                rs=ps.executeQuery();
                if(rs.next())
                    return true;
                return false;
        }
}
