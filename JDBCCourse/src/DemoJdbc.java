import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
    /*
     iport package
     load and register
     create connection
     create statement
     execute statement
     process the results
     close
    */
        String url ="jdbc:postgresql://localhost:5432/demo";
        String uname ="postgres";
        String pass = "root";
        String sql = " Select * from student";
        String sql1= "Select sname from student where sid =1";
       // Optional-> Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

        Statement st = con.createStatement();
//        ResultSet result =  st.executeQuery(sql1);
//        result.next();
//        System.out.println(result.getString("sname"));

        ResultSet result =  st.executeQuery(sql);
        while(result.next())
        {
            System.out.print(result.getInt(1)+" ");
            System.out.print(result.getString(2)+" ");
            System.out.println(result.getInt(3));
        }


        con.close();
        System.out.println("Connection closed");

        }
    }
