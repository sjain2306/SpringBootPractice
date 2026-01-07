import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDJdbc {

        public static void main(String[] args) throws Exception {
    /*
     import package
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
            String insert = "insert into student values(5,'Jatin',87)";
            String update = "update student set sname='Max' where sid=5";
            String delete ="delete from student where sid=5";
            Connection con = DriverManager.getConnection(url,uname,pass);
            System.out.println("Connection Established");

            Statement st = con.createStatement();
            boolean status = st.execute(delete);
            System.out.println(status);



            con.close();
            System.out.println("Connection closed");

        }
    }


