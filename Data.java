

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class MYDB{
 Connection con;
 Statement st;
 ResultSet rs;
 
    MYDB(){
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hashir","root","");
        st=con.createStatement();
           System.out.println("DB is connected");
        
       }
       catch(Exception e){
           System.out.println(e);
       }      
       
    }

public ResultSet getUserDetails(String username, String pass){
    
         String sql =" select * from student where St_email='"+username+"' and St_pass='"+pass+"'";
         // System.out.println(sql);
       try {   
         rs=st.executeQuery(sql);
         
       
     } catch (SQLException ex) {
         Logger.getLogger(MYDB.class.getName()).log(Level.SEVERE, null, ex);
     }
    return rs; 
}
 
}
public class Data {

    public static void main(String[] args) {
     MYDB db = new MYDB();
     
    }
    
}
