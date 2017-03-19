/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mariam
 */
public class AddToDB {
   
   public boolean addQueryDB (String query) throws SQLException
   {
         Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ee", "root","her0_love");
         Statement statement = Con.createStatement();
         statement.executeUpdate(query);



       return true;
   }
   
   public ArrayList<String> getComaniesName () throws SQLException
   {
       ArrayList<String> compamies = new ArrayList<String>();
       Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ee", "root","her0_love");
       Statement statement = Con.createStatement();
       ResultSet rs = statement.executeQuery("SELECT cname FROM company");
       while ( rs.next() ) {
                String company = rs.getString("cname");
                compamies.add(company);
            }
       return compamies;
   }
   
      
 
}
