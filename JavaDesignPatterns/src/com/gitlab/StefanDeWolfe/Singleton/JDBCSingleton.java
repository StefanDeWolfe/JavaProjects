package com.gitlab.StefanDeWolfe.Singleton;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JDBCSingleton {
    //Step 1
    // create a JDBCSingleton class.
    //static member holds only one instance of the JDBCSingleton class.
    private static JDBCSingleton jdbc;

    //JDBCSingleton prevents the instantiation from any other class.
    private JDBCSingleton() {}

    //Now we are providing global point of access.
    public static JDBCSingleton getInstance() {
        if (jdbc == null)
        {
            jdbc = new  JDBCSingleton();
        }
        return jdbc;
    }

    // to get the connection from methods like insert, view etc.
    private static Connection getConnection()throws ClassNotFoundException, SQLException  {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwanirajput", "root", "ashwani");
        return connection;
    }

    //to insert the record into the database
    public int insert(String name, String pass) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int recordCounter=0;
        try {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement("insert into userdata(uname,upassword)values(?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, pass);
            recordCounter = preparedStatement.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); } finally{
            if (preparedStatement!=null){
                preparedStatement.close();
            }if(connection != null){
                connection.close();
            }
        }
        return recordCounter;
    }

    //to view the data from the database
    public void view(String name) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet results = null;
        try {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement("select * from userdata where uname=?");
            preparedStatement.setString(1, name);
            results = preparedStatement.executeQuery();
            while (results.next()) {
                System.out.println("Name= " + results.getString(2) + "\t" + "Password= " + results.getString(3));
            }

        } catch (Exception e) { System.out.println(e);}
        finally{
            if(results != null){
                results.close();
            }if (preparedStatement != null){
                preparedStatement.close();
            }if(connection != null){
                connection.close();
            }
        }
    }

    // to update the password for the given username
    public int update(String name, String password) throws SQLException  {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int recordCounter = 0;
        try {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement(" update userdata set upassword=? where uname='"+name+"' ");
            preparedStatement.setString(1, password);
            recordCounter = preparedStatement.executeUpdate();
        } catch (Exception e) {  e.printStackTrace(); } finally{

            if (preparedStatement != null){
                preparedStatement.close();
            }if(connection != null){
                connection.close();
            }
        }
        return recordCounter;
    }

    // to delete the data from the database
    public int delete(int userid) throws SQLException{
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int recordCounter = 0;
        try {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement(" delete from userdata where uid='"+userid+"' ");
            recordCounter = preparedStatement.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
        finally{
            if (preparedStatement != null){
                preparedStatement.close();
            }if(connection != null){
                connection.close();
            }
        }
        return recordCounter;
    }
}
